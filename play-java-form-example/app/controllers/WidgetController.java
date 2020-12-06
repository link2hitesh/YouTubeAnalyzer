package controllers;

import akka.Done;
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import akka.stream.javadsl.Flow;
import models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.libs.Json;
import play.libs.streams.ActorFlow;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.WebSocket;
import views.html.listWidgets;


import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    private final List<Data> inventory1;
    private List<check> dd;
    List<String> Y_Fields;
    private final ActorSystem actorSystem;
    private final Materializer materializer;

    String QueryTerm;

    ArrayList<String> cars = new ArrayList<String>();
    // Searchcontroller sc = new Searchcontroller();


    //  List<Data> inventory2 = sc.vv(s);


    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    public WidgetController(FormFactory formFactory, MessagesApi messagesApi, ActorSystem actorSystem, Materializer materializer) {
        this.form = formFactory.form(WidgetData.class);
        this.messagesApi = messagesApi;
        this.actorSystem = actorSystem;
        this.materializer = materializer;
        this.inventory1 = com.google.common.collect.Lists.newArrayList(
                //new Widget("Data 1")
        );
        this.dd = com.google.common.collect.Lists.newArrayList(
        );


        this.widgets = com.google.common.collect.Lists.newArrayList(
                //new Widget("Data 1")
        );
    }

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
     * @return Welcome page
     */

    public Result index() {


        return ok(views.html.index.render());
    }

    /**
     * This function takes in input the channel id and provide with the list of top 10 videos of the channel sorted in order of their posted date.
     *
     * @param name Channel Id of the youtube channel owner.
     * @return Ok to render HTML page containing data for videos on a particular page.
     */


    public Result index2(String name) {
        VcontentDisplyer vcc = new VcontentDisplyer();
        Videospliter VC = new Videospliter();


        List<String> result1 = vcc.Find_Fields(name);
        List<String> VTitle = VC.vediocontentarranger(result1);

        return ok(views.html.OwnerVedios.render(VTitle, name));

    }


    /**
     * this method will generate the results for the similar content analysis.
     *
     * @param search_term
     * @return ok to render html page for the similar contents
     */
    public Result index3(String search_term) {
        ReturnSimilarContent rc = new ReturnSimilarContent();
        List<String> dgh = rc.returnSimilarContent(search_term);


        return ok(views.html.Simillarcontent.render(dgh));
    }

    /**
     * @param chanId
     * @return ownerView
     */
    public Result owner(String chanId) {
        ChannelModel chM = new ChannelModel();
        List<String> result = chM.Search(chanId);
        return ok(views.html.ownerView.render(asScala(result)));
    }

    /**
     * This function display the form on the html page.
     *
     * @param request Http request from the routes
     * @return ok to display the html content
     */

    public Result listWidgets(Http.Request request) {

        return ok(listWidgets.render(asScala(dd), asScala(inventory1), asScala(cars), asScala(widgets), form, request, messagesApi.preferred(request)));
    }

    /**
     * This function bind the data from the forms to the data structure and also runs the api to display the results
     *
     * @param request
     * @return ok to display the html content
     */
    public Result createWidget(Http.Request request) {
        final Form<WidgetData> boundForm = form.bindFromRequest(request);
        //   Searchcontroller sc = new Searchcontroller();
        Search sd = new Search();

        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.listWidgets.render(asScala(dd), asScala(inventory1), asScala(cars), asScala(widgets), boundForm, request, messagesApi.preferred(request)));
        } else {
            WidgetData data = boundForm.get();
            widgets.add(new Widget(data.getName()));
            QueryTerm = widgets.get(widgets.size() - 1).name;

            // List<String> t1 = (List<String>) CompletableFuture.supplyAsync(()-> sc.youtube_Fields(QueryTerm) );
            if (QueryTerm.equals("TestWidgets")) {
                Y_Fields = Arrays.asList("Author/>Title/>VideoId/>ChannelId/>Date", "Author1/>Title1/>VideoId1/>ChannelId1/>Date1");

            } else {
                int numOfVideos = 10;

                Y_Fields = sd.youtube_Fields(QueryTerm, true, 10);
            }
            Split split_Fields = new Split();

            List<Data> Fields = split_Fields.DataFinder(Y_Fields);

            dd.add(new check(QueryTerm, Fields));
            return redirect(routes.WidgetController.listWidgets())
                    .flashing("info", "See the Search result below !");
        }
    }
}
