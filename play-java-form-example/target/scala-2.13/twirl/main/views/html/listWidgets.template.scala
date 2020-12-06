
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

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[Seq[check],Seq[Data],Seq[String],Seq[Widget],Form[WidgetData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(tt: Seq[check], inventory: Seq[Data], car: Seq[String], widgets: Seq[Widget], form: Form[WidgetData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
    """),_display_(/*5.6*/main("Widgets")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
        """),format.raw/*6.44*/("""
        """),_display_(/*7.10*/request/*7.17*/.flash.asScala().data.map/*7.42*/ { case (name, value) =>_display_(Seq[Any](format.raw/*7.66*/("""
        """),format.raw/*8.9*/("""<div class=""""),_display_(/*8.22*/name),format.raw/*8.26*/("""">"""),_display_(/*8.29*/value),format.raw/*8.34*/("""</div>
        """)))}),format.raw/*9.10*/("""


        """),format.raw/*12.9*/("""<div class="group1" id="segment1">

            <div class="starter">
                <h2> Welcome to YouTubeAnalyzer </h2>
            </div>
            """),_display_(/*17.14*/helper/*17.20*/.form(routes.WidgetController.createWidget)/*17.63*/ {_display_(Seq[Any](format.raw/*17.65*/("""
                """),_display_(/*18.18*/helper/*18.24*/.CSRF.formField),format.raw/*18.39*/("""

                """),_display_(/*20.18*/helper/*20.24*/.inputText(form("name"), '_label -> " ",
                    'placeholder -> "Please enter your search here ",
                    'id -> "title",
                    'size -> 90, '_default -> "inline-block")),format.raw/*23.62*/("""

                """),format.raw/*25.17*/("""<button class="btn" type="submit">Go!</button>
            """)))}),format.raw/*26.14*/("""


        """),format.raw/*29.9*/("""</div>

        <div class="search-list">
        """),_display_(/*32.10*/for(t <- tt) yield /*32.22*/ {_display_(Seq[Any](format.raw/*32.24*/("""

            """),format.raw/*34.13*/("""<div class="group2" id="segment2">

                <h2> Search Terms: """),_display_(/*36.37*/t/*36.38*/.value.getValue),format.raw/*36.53*/("""  """),format.raw/*36.55*/("""</h2>
                <ol>

                """),_display_(/*39.18*/for(cc <- t.getValue2) yield /*39.40*/ {_display_(Seq[Any](format.raw/*39.42*/("""

                    """),format.raw/*41.21*/("""<li> <h4> Title : <a href=""""),_display_(/*41.49*/routes/*41.55*/.WidgetController.index3(t.value.getValue)),format.raw/*41.97*/(""""> """),_display_(/*41.101*/cc/*41.103*/.title),format.raw/*41.109*/(""" """),format.raw/*41.110*/("""</a>
                        <br>

                        Author : <a href=""""),_display_(/*44.44*/routes/*44.50*/.WidgetController.owner(cc.chid)),format.raw/*44.82*/(""""> """),_display_(/*44.86*/cc/*44.88*/.author),format.raw/*44.95*/(""" """),format.raw/*44.96*/("""</a>
                        <br>

                        Owner Videos : <a href=""""),_display_(/*47.50*/routes/*47.56*/.WidgetController.index2(cc.chid)),format.raw/*47.89*/(""""> Get Latest vedios from Owner Channel</a>
                        <br>

                        View Count  : """),_display_(/*50.40*/cc/*50.42*/.viewcount),format.raw/*50.52*/(""" """),format.raw/*50.53*/("""<br>

                        Date : """),_display_(/*52.33*/cc/*52.35*/.posted),format.raw/*52.42*/(""" """),format.raw/*52.43*/("""<br>

                    </h4></li>

                """)))}),format.raw/*56.18*/("""
                """),format.raw/*57.17*/("""</ol>

                <script>
                    const socket = new WebSocket("ws://localhost:9000/ws");

                    socket.addEventListener("open", function () """),format.raw/*62.65*/("""{"""),format.raw/*62.66*/("""
                        """),format.raw/*63.25*/("""setInterval(function () """),format.raw/*63.49*/("""{"""),format.raw/*63.50*/("""
                            """),format.raw/*64.29*/("""socket.send(""""),_display_(/*64.43*/t/*64.44*/.value.getValue),format.raw/*64.59*/("""");
                        """),format.raw/*65.25*/("""}"""),format.raw/*65.26*/(""", 10000);
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/(""")

                    socket.addEventListener("message", function (msg) """),format.raw/*68.71*/("""{"""),format.raw/*68.72*/("""
                        """),format.raw/*69.25*/("""console.log(msg.data);

                        // Update date here
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/(""");
                </script>
            </div>

        """)))}),format.raw/*76.10*/("""
        """),format.raw/*77.9*/("""</div>
    """)))}),format.raw/*78.6*/("""
"""))
      }
    }
  }

  def render(tt:Seq[check],inventory:Seq[Data],car:Seq[String],widgets:Seq[Widget],form:Form[WidgetData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(tt,inventory,car,widgets,form)(request,messages)

  def f:((Seq[check],Seq[Data],Seq[String],Seq[Widget],Form[WidgetData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (tt,inventory,car,widgets,form) => (request,messages) => apply(tt,inventory,car,widgets,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-04T19:57:15.487
                  SOURCE: C:/Users/hites/Desktop/Project Part 1/Project Part 1/play-java-forms-example/app/views/listWidgets.scala.html
                  HASH: 59081c3ed3232f514aa1b2c648a473abe13c793f
                  MATRIX: 610->1|646->31|1073->67|1326->227|1357->233|1380->248|1419->250|1455->294|1491->304|1506->311|1539->336|1600->360|1635->369|1674->382|1698->386|1727->389|1752->394|1798->410|1836->421|2019->577|2034->583|2086->626|2126->628|2171->646|2186->652|2222->667|2268->686|2283->692|2512->900|2558->918|2649->978|2687->989|2765->1040|2793->1052|2833->1054|2875->1068|2974->1140|2984->1141|3020->1156|3050->1158|3122->1203|3160->1225|3200->1227|3250->1249|3305->1277|3320->1283|3383->1325|3415->1329|3427->1331|3455->1337|3485->1338|3590->1416|3605->1422|3658->1454|3689->1458|3700->1460|3728->1467|3757->1468|3868->1552|3883->1558|3937->1591|4077->1704|4088->1706|4119->1716|4148->1717|4213->1755|4224->1757|4252->1764|4281->1765|4367->1820|4412->1837|4613->2010|4642->2011|4695->2036|4747->2060|4776->2061|4833->2090|4874->2104|4884->2105|4920->2120|4976->2148|5005->2149|5063->2179|5092->2180|5193->2253|5222->2254|5275->2279|5391->2367|5420->2368|5509->2426|5545->2435|5587->2447
                  LINES: 23->1|24->2|29->3|34->4|35->5|35->5|35->5|36->6|37->7|37->7|37->7|37->7|38->8|38->8|38->8|38->8|38->8|39->9|42->12|47->17|47->17|47->17|47->17|48->18|48->18|48->18|50->20|50->20|53->23|55->25|56->26|59->29|62->32|62->32|62->32|64->34|66->36|66->36|66->36|66->36|69->39|69->39|69->39|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|74->44|74->44|74->44|74->44|74->44|74->44|74->44|77->47|77->47|77->47|80->50|80->50|80->50|80->50|82->52|82->52|82->52|82->52|86->56|87->57|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|94->64|95->65|95->65|96->66|96->66|98->68|98->68|99->69|102->72|102->72|106->76|107->77|108->78
                  -- GENERATED --
              */
          