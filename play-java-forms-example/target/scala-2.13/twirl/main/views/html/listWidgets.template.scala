
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

    <div class="search-list">
    """),_display_(/*35.6*/for(videocontent <- Videocontent) yield /*35.39*/ {_display_(Seq[Any](format.raw/*35.41*/("""

            """),format.raw/*37.13*/("""<div class="group2" id="segment2">

                <h2 > Search Terms:  """),_display_(/*39.39*/videocontent/*39.51*/.value.getValue),format.raw/*39.66*/("""  """),format.raw/*39.68*/("""</h2>
                <ol>

                """),_display_(/*42.18*/for(cc <- videocontent.getValue2 ) yield /*42.52*/{_display_(Seq[Any](format.raw/*42.53*/("""

                    """),format.raw/*44.21*/("""<li> <h4> Title : <a href=""""),_display_(/*44.49*/routes/*44.55*/.WidgetController.index3(videocontent.value.getValue)),format.raw/*44.108*/("""">  """),_display_(/*44.113*/cc/*44.115*/.title),format.raw/*44.121*/(""" """),format.raw/*44.122*/("""</a> <br>

                      Author :   <a href=""""),_display_(/*46.44*/routes/*46.50*/.WidgetController.owner(cc.chid)),format.raw/*46.82*/("""">  """),_display_(/*46.87*/cc/*46.89*/.author),format.raw/*46.96*/("""  """),format.raw/*46.98*/("""</a>       <br>

                        Owner Videos :  <a href=""""),_display_(/*48.51*/routes/*48.57*/.WidgetController.index2(cc.chid+Searchterm)),format.raw/*48.101*/(""""> Get Latest vedios from Owner Channel</a>  <br>

                        View Count  : """),_display_(/*50.40*/cc/*50.42*/.viewcount),format.raw/*50.52*/("""       """),format.raw/*50.59*/("""<br>

                        Date :     """),_display_(/*52.37*/cc/*52.39*/.posted),format.raw/*52.46*/("""          """),format.raw/*52.56*/("""<br>

                    </h4></li>

                """)))}),format.raw/*56.18*/("""
                """),format.raw/*57.17*/("""</ol>
                <script>
                    const socket = new WebSocket("ws://localhost:9000/x/ws");

                    socket.addEventListener("open", function () """),format.raw/*61.65*/("""{"""),format.raw/*61.66*/("""
                        """),format.raw/*62.25*/("""setInterval(function () """),format.raw/*62.49*/("""{"""),format.raw/*62.50*/("""
                            """),format.raw/*63.29*/("""socket.send(""""),_display_(/*63.43*/videocontent/*63.55*/.value.getValue),format.raw/*63.70*/("""");
                        """),format.raw/*64.25*/("""}"""),format.raw/*64.26*/(""", 60000);
                    """),format.raw/*65.21*/("""}"""),format.raw/*65.22*/(""")

                    socket.addEventListener("message", function (msg) """),format.raw/*67.71*/("""{"""),format.raw/*67.72*/("""
                        """),format.raw/*68.25*/("""if (msg.data) """),format.raw/*68.39*/("""{"""),format.raw/*68.40*/("""

                            """),format.raw/*70.29*/("""console.log(msg);
                            // const items = msg.toString().split("\n");
                            //  console.log(items);


                        """),format.raw/*75.25*/("""}"""),format.raw/*75.26*/("""

                        """),format.raw/*77.25*/("""// Update date here
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/(""");
                </script>

            </div>

    """)))}),format.raw/*83.6*/("""
    """),format.raw/*84.5*/("""</div>
""")))}),format.raw/*85.2*/("""
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
                  DATE: 2020-12-05T18:24:49.624
                  SOURCE: /Users/ankuraggarwal/Desktop/safest version/Project Part 1/play-java-forms-example/app/views/listWidgets.scala.html
                  HASH: 3a1c26c96a62b5c574a0d1518aaff97884426e89
                  MATRIX: 610->1|646->31|1058->67|1298->214|1325->216|1348->231|1387->233|1422->276|1454->282|1470->289|1504->314|1566->338|1598->343|1638->356|1663->360|1693->363|1719->368|1761->380|1795->387|1962->527|1977->533|2058->605|2098->607|2139->621|2154->627|2190->642|2232->657|2247->663|2463->858|2505->872|2592->928|2626->935|2695->978|2744->1011|2784->1013|2826->1027|2927->1101|2948->1113|2984->1128|3014->1130|3086->1175|3136->1209|3175->1210|3225->1232|3280->1260|3295->1266|3370->1319|3403->1324|3415->1326|3443->1332|3473->1333|3554->1387|3569->1393|3622->1425|3654->1430|3665->1432|3693->1439|3723->1441|3817->1508|3832->1514|3898->1558|4015->1648|4026->1650|4057->1660|4092->1667|4161->1709|4172->1711|4200->1718|4238->1728|4324->1783|4369->1800|4571->1974|4600->1975|4653->2000|4705->2024|4734->2025|4791->2054|4832->2068|4853->2080|4889->2095|4945->2123|4974->2124|5032->2154|5061->2155|5162->2228|5191->2229|5244->2254|5286->2268|5315->2269|5373->2299|5570->2468|5599->2469|5653->2495|5721->2535|5750->2536|5835->2591|5867->2596|5905->2604
                  LINES: 23->1|24->2|29->3|34->4|35->5|35->5|35->5|39->9|40->10|40->10|40->10|40->10|41->11|41->11|41->11|41->11|41->11|42->12|45->15|50->20|50->20|50->20|50->20|51->21|51->21|51->21|53->23|53->23|56->26|58->28|59->29|62->32|65->35|65->35|65->35|67->37|69->39|69->39|69->39|69->39|72->42|72->42|72->42|74->44|74->44|74->44|74->44|74->44|74->44|74->44|74->44|76->46|76->46|76->46|76->46|76->46|76->46|76->46|78->48|78->48|78->48|80->50|80->50|80->50|80->50|82->52|82->52|82->52|82->52|86->56|87->57|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|93->63|94->64|94->64|95->65|95->65|97->67|97->67|98->68|98->68|98->68|100->70|105->75|105->75|107->77|108->78|108->78|113->83|114->84|115->85
                  -- GENERATED --
              */
          