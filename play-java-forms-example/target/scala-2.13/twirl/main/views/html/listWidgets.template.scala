
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import play.mvc.Http.Request
/*2.2*/import akka.util.Helpers.Requiring

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Seq[check],String,Seq[Widget],Form[WidgetData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(Videocontent :Seq[check],Searchterm:String,widgets: Seq[Widget], form: Form[WidgetData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Widgets")/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""



    """),format.raw/*9.40*/("""
    """),_display_(/*10.6*/request/*10.13*/.flash.asScala().data.map/*10.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*10.62*/("""
    """),format.raw/*11.5*/("""<div class=""""),_display_(/*11.18*/name),format.raw/*11.22*/("""">"""),_display_(/*11.25*/value),format.raw/*11.30*/("""</div>
    """)))}),format.raw/*12.6*/("""


    """),format.raw/*15.5*/("""<div class="group1" id="segment1">

        <div class="starter">
            <h2> Welcome to YouTubeAnalyzer </h2>
        </div>
        """),_display_(/*20.10*/helper/*20.16*/.form(routes.WidgetController.createWidget(request.path().substring(1)))/*20.88*/ {_display_(Seq[Any](format.raw/*20.90*/("""
            """),_display_(/*21.14*/helper/*21.20*/.CSRF.formField),format.raw/*21.35*/("""

            """),_display_(/*23.14*/helper/*23.20*/.inputText(form("name") ,'_label -> " ",
                'placeholder -> "Please enter your search here ",
                'id -> "title",
                'size -> 90,'_default -> "inline-block")),format.raw/*26.57*/("""

            """),format.raw/*28.13*/("""<button class="btn" type="submit">Go!</button>
        """)))}),format.raw/*29.10*/("""


    """),format.raw/*32.5*/("""</div>

    <script>
        const socketMap = new Map();
    </script>

    <div class="search-list">
    """),_display_(/*39.6*/for(videocontent <- Videocontent) yield /*39.39*/ {_display_(Seq[Any](format.raw/*39.41*/("""

            """),format.raw/*41.13*/("""<div class="group2" id="segment2">
                <h2 > Search Terms:  """),_display_(/*42.39*/videocontent/*42.51*/.value.getValue),format.raw/*42.66*/("""  """),format.raw/*42.68*/("""</h2>
                <ol id="search-"""),_display_(/*43.33*/videocontent/*43.45*/.value.getValue),format.raw/*43.60*/("""">
                """),_display_(/*44.18*/for(cc <- videocontent.getValue2 ) yield /*44.52*/{_display_(Seq[Any](format.raw/*44.53*/("""
                    """),format.raw/*45.21*/("""<li> <h4> Title : <a href=""""),_display_(/*45.49*/routes/*45.55*/.WidgetController.index3(videocontent.value.getValue)),format.raw/*45.108*/("""">  """),_display_(/*45.113*/cc/*45.115*/.title),format.raw/*45.121*/(""" """),format.raw/*45.122*/("""</a> <br>
                      Author :   <a href=""""),_display_(/*46.44*/routes/*46.50*/.WidgetController.owner(cc.chid)),format.raw/*46.82*/("""">  """),_display_(/*46.87*/cc/*46.89*/.author),format.raw/*46.96*/("""  """),format.raw/*46.98*/("""</a>       <br>
                        Owner Videos :  <a href=""""),_display_(/*47.51*/routes/*47.57*/.WidgetController.index2(cc.chid+Searchterm)),format.raw/*47.101*/(""""> Get Latest vedios from Owner Channel</a>  <br>
                        View Count  : """),_display_(/*48.40*/cc/*48.42*/.viewcount),format.raw/*48.52*/("""       """),format.raw/*48.59*/("""<br>
                        Date :     """),_display_(/*49.37*/cc/*49.39*/.posted),format.raw/*49.46*/("""          """),format.raw/*49.56*/("""<br>
                    </h4>
                    </li>
                """)))}),format.raw/*52.18*/("""
                """),format.raw/*53.17*/("""</ol>
            </div>
        <script>
            socketMap.set(""""),_display_(/*56.29*/videocontent/*56.41*/.value.getValue),format.raw/*56.56*/("""", """),format.raw/*56.59*/("""{"""),format.raw/*56.60*/("""
                """),format.raw/*57.17*/("""socket: new WebSocket("ws://localhost:9000/x/ws"),
                container: document.getElementById("search-"""),_display_(/*58.61*/videocontent/*58.73*/.value.getValue),format.raw/*58.88*/("""")
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/(""");

            socketMap.get(""""),_display_(/*61.29*/videocontent/*61.41*/.value.getValue),format.raw/*61.56*/("""").socket.addEventListener("open", function () """),format.raw/*61.103*/("""{"""),format.raw/*61.104*/("""
                """),format.raw/*62.17*/("""const interval = setInterval(function () """),format.raw/*62.58*/("""{"""),format.raw/*62.59*/("""
                    """),format.raw/*63.21*/("""socketMap.get(""""),_display_(/*63.37*/videocontent/*63.49*/.value.getValue),format.raw/*63.64*/("""").socket.send(""""),_display_(/*63.81*/videocontent/*63.93*/.value.getValue),format.raw/*63.108*/("""");
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/(""", 60000);
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/(""")

            socketMap.get(""""),_display_(/*67.29*/videocontent/*67.41*/.value.getValue),format.raw/*67.56*/("""").socket.addEventListener("message", function (msg) """),format.raw/*67.109*/("""{"""),format.raw/*67.110*/("""
                """),format.raw/*68.17*/("""if (msg.data) """),format.raw/*68.31*/("""{"""),format.raw/*68.32*/("""
                    """),format.raw/*69.21*/("""const """),format.raw/*69.27*/("""{"""),format.raw/*69.28*/(""" """),format.raw/*69.29*/("""data """),format.raw/*69.34*/("""}"""),format.raw/*69.35*/(""" """),format.raw/*69.36*/("""= msg;
                    const rawItems = data.split("\n");

                    for (let rawItem of rawItems) """),format.raw/*72.51*/("""{"""),format.raw/*72.52*/("""
                        """),format.raw/*73.25*/("""const dataItems = rawItem.split("/>");
                        const itemData = """),format.raw/*74.42*/("""{"""),format.raw/*74.43*/("""
                            """),format.raw/*75.29*/("""author: dataItems[0],
                            title: dataItems[1],
                            viewCount: dataItems[2],
                            id: dataItems[3],
                            date: dataItems[4]
                        """),format.raw/*80.25*/("""}"""),format.raw/*80.26*/(""";

                        const li = document.createElement("li");
                        const h4 = document.createElement("h4");

                        li.innerHTML = `<h4> Title : <a href=""""),_display_(/*85.64*/routes/*85.70*/.WidgetController.index3(videocontent.value.getValue)),format.raw/*85.123*/("""">  $"""),format.raw/*85.128*/("""{"""),format.raw/*85.129*/("""itemData.title"""),format.raw/*85.143*/("""}"""),format.raw/*85.144*/(""" """),format.raw/*85.145*/("""</a> <br>
                                          Author :   <a href=""> $"""),format.raw/*86.67*/("""{"""),format.raw/*86.68*/("""itemData.author"""),format.raw/*86.83*/("""}"""),format.raw/*86.84*/(""" """),format.raw/*86.85*/("""</a>       <br>
                                            Owner Videos :  <a href=""> Get Latest vedios from Owner Channel</a>  <br>
                                            View Count  : $"""),format.raw/*88.60*/("""{"""),format.raw/*88.61*/("""itemData.viewCount"""),format.raw/*88.79*/("""}"""),format.raw/*88.80*/(""" """),format.raw/*88.81*/("""<br>
                                            Date : $"""),format.raw/*89.53*/("""{"""),format.raw/*89.54*/("""itemData.date"""),format.raw/*89.67*/("""}"""),format.raw/*89.68*/(""" """),format.raw/*89.69*/("""<br>
                                        </h4>`;

                        // Uncomment the below line if want to remove existing videos.
                        //socketMap.get(""""),_display_(/*93.43*/videocontent/*93.55*/.value.getValue),format.raw/*93.70*/("""").container.innerHTML = "";

                        socketMap.get(""""),_display_(/*95.41*/videocontent/*95.53*/.value.getValue),format.raw/*95.68*/("""").container.appendChild(li);
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/("""

                    """),format.raw/*98.21*/("""var video= msg.toString();
                    var videoData=new Array(video.split("\n"));

                    console.log(msg.data);
                    // const items = msg.toString().split("\n");


                """),format.raw/*105.17*/("""}"""),format.raw/*105.18*/("""


            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/(""");
        </script>
    """)))}),format.raw/*110.6*/("""
    """),format.raw/*111.5*/("""</div>
""")))}),format.raw/*112.2*/("""
"""))
      }
    }
  }

  def render(Videocontent:Seq[check],Searchterm:String,widgets:Seq[Widget],form:Form[WidgetData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(Videocontent,Searchterm,widgets,form)(request,messages)

  def f:((Seq[check],String,Seq[Widget],Form[WidgetData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (Videocontent,Searchterm,widgets,form) => (request,messages) => apply(Videocontent,Searchterm,widgets,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-10T20:13:35.828
                  SOURCE: /Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/app/views/listWidgets.scala.html
                  HASH: 6e56560875beed4e824e577f9c2082abde32912f
                  MATRIX: 610->1|646->31|1058->67|1298->214|1325->216|1348->231|1387->233|1422->276|1454->282|1470->289|1504->314|1566->338|1598->343|1638->356|1663->360|1693->363|1719->368|1761->380|1795->387|1962->527|1977->533|2058->605|2098->607|2139->621|2154->627|2190->642|2232->657|2247->663|2463->858|2505->872|2592->928|2626->935|2760->1043|2809->1076|2849->1078|2891->1092|2991->1165|3012->1177|3048->1192|3078->1194|3143->1232|3164->1244|3200->1259|3247->1279|3297->1313|3336->1314|3385->1335|3440->1363|3455->1369|3530->1422|3563->1427|3575->1429|3603->1435|3633->1436|3713->1489|3728->1495|3781->1527|3813->1532|3824->1534|3852->1541|3882->1543|3975->1609|3990->1615|4056->1659|4172->1748|4183->1750|4214->1760|4249->1767|4317->1808|4328->1810|4356->1817|4394->1827|4499->1901|4544->1918|4641->1988|4662->2000|4698->2015|4729->2018|4758->2019|4803->2036|4941->2147|4962->2159|4998->2174|5041->2189|5070->2190|5129->2222|5150->2234|5186->2249|5262->2296|5292->2297|5337->2314|5406->2355|5435->2356|5484->2377|5527->2393|5548->2405|5584->2420|5628->2437|5649->2449|5686->2464|5734->2484|5763->2485|5813->2507|5842->2508|5900->2539|5921->2551|5957->2566|6039->2619|6069->2620|6114->2637|6156->2651|6185->2652|6234->2673|6268->2679|6297->2680|6326->2681|6359->2686|6388->2687|6417->2688|6558->2801|6587->2802|6640->2827|6748->2907|6777->2908|6834->2937|7103->3178|7132->3179|7356->3376|7371->3382|7446->3435|7480->3440|7510->3441|7553->3455|7583->3456|7613->3457|7717->3533|7746->3534|7789->3549|7818->3550|7847->3551|8069->3745|8098->3746|8144->3764|8173->3765|8202->3766|8287->3823|8316->3824|8357->3837|8386->3838|8415->3839|8625->4022|8646->4034|8682->4049|8779->4119|8800->4131|8836->4146|8914->4196|8943->4197|8993->4219|9240->4437|9270->4438|9314->4453|9344->4454|9401->4480|9434->4485|9473->4493
                  LINES: 23->1|24->2|29->3|34->4|35->5|35->5|35->5|39->9|40->10|40->10|40->10|40->10|41->11|41->11|41->11|41->11|41->11|42->12|45->15|50->20|50->20|50->20|50->20|51->21|51->21|51->21|53->23|53->23|56->26|58->28|59->29|62->32|69->39|69->39|69->39|71->41|72->42|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|76->46|76->46|76->46|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|78->48|79->49|79->49|79->49|79->49|82->52|83->53|86->56|86->56|86->56|86->56|86->56|87->57|88->58|88->58|88->58|89->59|89->59|91->61|91->61|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|93->63|93->63|93->63|93->63|94->64|94->64|95->65|95->65|97->67|97->67|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|99->69|99->69|99->69|99->69|102->72|102->72|103->73|104->74|104->74|105->75|110->80|110->80|115->85|115->85|115->85|115->85|115->85|115->85|115->85|115->85|116->86|116->86|116->86|116->86|116->86|118->88|118->88|118->88|118->88|118->88|119->89|119->89|119->89|119->89|119->89|123->93|123->93|123->93|125->95|125->95|125->95|126->96|126->96|128->98|135->105|135->105|138->108|138->108|140->110|141->111|142->112
                  -- GENERATED --
              */
          