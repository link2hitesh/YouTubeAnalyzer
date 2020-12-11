package controllers;

import akka.Done;
import actors.ChannelVideoActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.javadsl.Flow;
import models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.WebSocket;
import views.html.listWidgets;
import actors.*;
import scala.compat.java8.FutureConverters;
import static akka.pattern.Patterns.ask;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Scala.asScala;

/**
 * This is the main controller class. It is used to display the result of the search api as well as the individual part of the project.
 *
 * @author ankur aggarwal
 * @author Hitesh Agarwal
 * @author adeyinka areje
 */
@Singleton
public class WidgetController extends Controller {

    private final Form<WidgetData> form;
    private MessagesApi messagesApi;
    private final List<Widget> widgets;
   // private final List<Data> inventory1;
    private List<check> dd  ;
    final ActorRef helloActor;
    final ActorRef ownerActor;
    final ActorRef helloActor2;




    List<String> Y_Fields;
    String Search_Query= "";
    String QueryTerm;
    HashMap<String, List<check>> Cache = new HashMap<String,List<check>>();
    ArrayList<String> cars = new ArrayList<String>();
   // Searchcontroller sc = new Searchcontroller();


  //  List<Data> inventory2 = sc.vv(s);



    private final Logger logger = LoggerFactory.getLogger(getClass()) ;
    /**
     * constructor of the class
     */





    @Inject
    public WidgetController(FormFactory formFactory, MessagesApi messagesApi, ActorSystem system) {
        this.form = formFactory.form(WidgetData.class);
        this.messagesApi = messagesApi;
     //   this.inventory1 = com.google.common.collect.Lists.newArrayList(
                //new Widget("Data 1")
      //  );
        this.dd= com.google.common.collect.Lists.newArrayList(
        );
        helloActor = system.actorOf(ChannelVideoActor.getProps());
        helloActor2=system.actorOf(SimillarActor.getProps());
        
        ownerActor = system.actorOf(OwnerPageActor.getProps());

        this.widgets = com.google.common.collect.Lists.newArrayList(
                //new Widget("Data 1")
        );
    }

    /**
     *
     * @return Welcome page
     */

    public Result index() {

        String sessionId = UUID.randomUUID().toString();
        return redirect("/"+sessionId);
        //return ok(views.html.index.render());
    }

    /**
     * Checking WebSocket
     * @return WebSocket
     */

    public WebSocket socket() {
        return WebSocket.Text.accept(
                request -> {
                    System.out.println("connection...");

                    // log the message to stdout and send response back to client
                    return Flow.<String>create()
                            .map(
                                    msg -> {
                                        List<String> videos = Search.youtube_Fields(msg, true, 10);
                                        return String.join("\n", videos);
                                    });
                });
    }


    /**
     * This function takes in input the channel id and provide with the list of top 10 videos of the channel sorted in order of their posted date.
     * 
     * @param name Channel Id of the youtube channel owner.
     * @return Ok to render HTML page containing data for videos on a particular page.
     */



    @SuppressWarnings("unchecked")
    public  CompletionStage<Result> index2(String name){
        return FutureConverters.toJava(ask(helloActor,new ChannelVideoProtocol.SayHello(name),1000))
                .thenApply(response -> {

                    List<channelvideolist> list_Sort = (ArrayList<channelvideolist>) response;
                    String p[] =name.split("//");
                    String S_t = p[1];

                    List<channelvideolist> finalList= new ArrayList<>();


                    List<channelvideolist> list_Sort2 = ChannelOrder.sortedlist(list_Sort,S_t);
                    List<channelvideolist> Reverse_list_Sort = ChannelOrder.Reverse_order(list_Sort2) ;

                    return ok(views.html.OwnerVedios.render((ArrayList<channelvideolist>)list_Sort2,(ArrayList<channelvideolist>)Reverse_list_Sort,name));

                });
    }


    /**
     * This function takes in input the search term and provide with the list of simillar content.
     *
     * @param search_term value searched by user
     * @return Ok to render HTML page.
     */

    @SuppressWarnings("unchecked")
    public CompletionStage<Result> index3(String search_term){
        return FutureConverters.toJava(ask(helloActor2, new SimillarProtocol.SayHello2(search_term),1000))
                .thenApply(response ->{

                    return ok(views.html.Simillarcontent.render((ArrayList<String >)response));

                });
    }


    /**
 * @param chanId
 * @return ownerView
 */
public CompletionStage<Result> owner(String chanId) {
    return FutureConverters.toJava(ask(ownerActor,new ChannelVideoProtocol.SayHello(chanId),1000)
    )
            .thenApply(response -> {
                return ok(views.html.ownerView.render((ArrayList<String>)response));
            });

}

    /**
     *  This function display the form on the html page.
     * @param request Http request from the routes
     * @return ok to display the html content
     */

    public Result listWidgets(String sessionId,Http.Request request) {

        return ok(listWidgets.render(asScala(dd),Search_Query,asScala(widgets),form, request, messagesApi.preferred(request)));
    }

    /**
     * This function bind the data from the forms to the data structure and also runs the api to display the results
     * @param request
     * @return ok to display the html content
     */





    public CompletionStage<Result> createWidget(String sessionId,Http.Request request){
        final Form<WidgetData> boundForm = form.bindFromRequest(request);
        WidgetData data = boundForm.get();
        Search sd =new Search();
      //  Search2 sd1= new Search2();
        widgets.add(new Widget(data.getName()));
        QueryTerm = widgets.get(widgets.size()-1).name;

        Search_Query = "//"+QueryTerm;
        //List<String> f = sd.youtube_Fields(QueryTerm, true, 10);
      //  System.out.println(f);


      //  sessionId = "123";
        String url = "ws://localhost:9000/"+sessionId+"/ws";


        return  sd.AsynYoutube(QueryTerm).thenApply(datavalue ->
                {
                   //  List<String> s =datavalue;
                    List<check> df = new ArrayList<>();
                  //  return ok(String.valueOf(s));
                    Split split_Fields = new Split();
                    List<Data> Fields = split_Fields.DataFinder(datavalue);
                    if(Cache.containsKey(sessionId)){
                        System.out.println("1");
                        df = Cache.get(sessionId);
                        df.add(new check(QueryTerm,Fields));
                        Cache.replace(sessionId,df);
                    }else {
                        System.out.println("0");
                        df.add(new check(QueryTerm,Fields));
                        Cache.put(sessionId,df);
                    }




                //    dd.add(new check(QueryTerm,Fields));
//                     dd.add((check) datavalue);
                    //dd=datavalue;
                    return ok(listWidgets.render(asScala(df),Search_Query,asScala(widgets),form, request, messagesApi.preferred(request)));
            //    .flashing("info", "See the Search result below !"));
                });

    }
}
