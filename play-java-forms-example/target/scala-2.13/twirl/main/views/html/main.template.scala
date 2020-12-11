
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <style>

            #segment2"""),format.raw/*9.22*/("""{"""),format.raw/*9.23*/("""

                """),format.raw/*11.17*/("""border: 3px dashed #7F33FF;
                margin-left: 300px;
                margin-right: 300px;
                margin-top: 30px;
                padding-bottom: 20px;


            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/("""
                """),format.raw/*19.17*/("""#segment1"""),format.raw/*19.26*/("""{"""),format.raw/*19.27*/("""

                    """),format.raw/*21.21*/("""border: 3px dashed #7F33FF;
                    text-align:center;
                    margin-left: 300px;
                    margin-right: 300px;
                    margin-top: 30px;
                    padding-bottom: 20px;


                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/("""
                """),format.raw/*30.17*/(""".starter"""),format.raw/*30.25*/("""{"""),format.raw/*30.26*/("""
                    """),format.raw/*31.21*/("""color:red;
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/("""
            """),format.raw/*33.13*/(""".username"""),format.raw/*33.22*/("""{"""),format.raw/*33.23*/("""
                """),format.raw/*34.17*/("""width: 400px;
                height: 23px;
                border-color: #6495ED;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
             """),format.raw/*38.14*/(""".btn"""),format.raw/*38.18*/("""{"""),format.raw/*38.19*/("""
                 """),format.raw/*39.18*/("""display = inline-block;

                 width :36px;
                 background: #fff;
                 border-color: #6495ED;
                 color:red;
                 height : 36px;
                 border-radius : 50%;
                 text-align: center;

                 vertical-align:middle;
             """),format.raw/*50.14*/("""}"""),format.raw/*50.15*/("""
            """),format.raw/*51.13*/(""".btn1"""),format.raw/*51.18*/("""{"""),format.raw/*51.19*/("""
                """),format.raw/*52.17*/("""display = inline-block;

                width :45px;
                background: #fff;
                border-color: #6495ED;
                color:red;
                height : 45px;
                border-radius : 50%;
                text-align: center;

                vertical-align:middle;
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""#VList"""),format.raw/*64.19*/("""{"""),format.raw/*64.20*/("""

                """),format.raw/*66.17*/("""background-color:#F7CAC9;


            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/("""
            """),format.raw/*70.13*/("""#VList2"""),format.raw/*70.20*/("""{"""),format.raw/*70.21*/("""

                """),format.raw/*72.17*/("""border: 3px dashed
                #955251;
                margin-left: 300px;
                margin-right: 300px;
                margin-top: 30px;
                padding-bottom: 20px;
                text-align: center;


            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/("""
            """),format.raw/*82.13*/(""".split """),format.raw/*82.20*/("""{"""),format.raw/*82.21*/("""
                """),format.raw/*83.17*/("""height: 100%;

                position: fixed;
                z-index: 1;
                top: 0;
                overflow-x: hidden;
                padding-top: 20px;
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""
            """),format.raw/*91.13*/(""".left """),format.raw/*91.19*/("""{"""),format.raw/*91.20*/("""

                """),format.raw/*93.17*/("""width: 25%;
                left: 0;
                background-color: #955251 ;
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/("""
            """),format.raw/*97.13*/(""".right """),format.raw/*97.20*/("""{"""),format.raw/*97.21*/("""
                """),format.raw/*98.17*/("""width: 80%;
                left: 25%;
                background-color: #FFFFFF;
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/("""
            """),format.raw/*102.13*/(""".centered """),format.raw/*102.23*/("""{"""),format.raw/*102.24*/("""
                """),format.raw/*103.17*/("""position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                text-align: center;
            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/("""





        """),format.raw/*114.9*/("""</style>


        <title>"""),_display_(/*117.17*/title),format.raw/*117.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*118.54*/routes/*118.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*118.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*119.59*/routes/*119.65*/.Assets.versioned("images/favicon.png")),format.raw/*119.104*/("""">
    </head>
    <body>
    """),_display_(/*122.6*/content),format.raw/*122.13*/("""
    """),format.raw/*123.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-10T20:13:35.777
                  SOURCE: /Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/app/views/main.scala.html
                  HASH: 4ef7fa7eaefee55c5d8e3e09f1503bae5746aa9c
                  MATRIX: 911->1|1035->32|1062->33|1172->116|1200->117|1246->135|1461->322|1490->323|1535->340|1572->349|1601->350|1651->372|1925->618|1954->619|1999->636|2035->644|2064->645|2113->666|2168->693|2197->694|2238->707|2275->716|2304->717|2349->734|2472->829|2501->830|2543->844|2575->848|2604->849|2650->867|2997->1186|3026->1187|3067->1200|3100->1205|3129->1206|3174->1223|3512->1533|3541->1534|3582->1547|3616->1553|3645->1554|3691->1572|3759->1612|3788->1613|3829->1626|3864->1633|3893->1634|3939->1652|4206->1891|4235->1892|4276->1905|4311->1912|4340->1913|4385->1930|4596->2113|4625->2114|4666->2127|4700->2133|4729->2134|4775->2152|4896->2245|4925->2246|4966->2259|5001->2266|5030->2267|5075->2284|5198->2378|5228->2379|5270->2392|5309->2402|5339->2403|5385->2420|5585->2591|5615->2592|5657->2606|5712->2633|5739->2638|5829->2700|5845->2706|5909->2747|5998->2808|6014->2814|6076->2853|6134->2884|6163->2891|6196->2896
                  LINES: 27->1|32->2|33->3|39->9|39->9|41->11|48->18|48->18|49->19|49->19|49->19|51->21|59->29|59->29|60->30|60->30|60->30|61->31|62->32|62->32|63->33|63->33|63->33|64->34|67->37|67->37|68->38|68->38|68->38|69->39|80->50|80->50|81->51|81->51|81->51|82->52|93->63|93->63|94->64|94->64|94->64|96->66|99->69|99->69|100->70|100->70|100->70|102->72|111->81|111->81|112->82|112->82|112->82|113->83|120->90|120->90|121->91|121->91|121->91|123->93|126->96|126->96|127->97|127->97|127->97|128->98|131->101|131->101|132->102|132->102|132->102|133->103|138->108|138->108|144->114|147->117|147->117|148->118|148->118|148->118|149->119|149->119|149->119|152->122|152->122|153->123
                  -- GENERATED --
              */
          