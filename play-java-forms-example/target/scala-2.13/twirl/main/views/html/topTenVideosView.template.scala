
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

object topTenVideosView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /* topTenVideosView Template File */
  def apply/*2.2*/(result: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Top Ten videos List")/*5.29*/{_display_(Seq[Any](format.raw/*5.30*/("""

    """),format.raw/*7.5*/("""<html lang="en">
        <head>
            <title>Top Ten videos List</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
            <style>
                    /* Remove the navbar's default margin-bottom and rounded borders */
                    .navbar """),format.raw/*17.29*/("""{"""),format.raw/*17.30*/("""
                        """),format.raw/*18.25*/("""margin-bottom: 0;
                        border-radius: 0;
                    """),format.raw/*20.21*/("""}"""),format.raw/*20.22*/("""

                    """),format.raw/*22.21*/("""/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
                    .row.content """),format.raw/*23.34*/("""{"""),format.raw/*23.35*/("""height: 450px"""),format.raw/*23.48*/("""}"""),format.raw/*23.49*/("""

                    """),format.raw/*25.21*/("""/* Set gray background color and 100% height */
                    .sidenav """),format.raw/*26.30*/("""{"""),format.raw/*26.31*/("""
                        """),format.raw/*27.25*/("""padding-top: 20px;
                        background-color: #f1f1f1;
                        height: 100%;
                    """),format.raw/*30.21*/("""}"""),format.raw/*30.22*/("""

                    """),format.raw/*32.21*/("""/* Set black background color, white text and some padding */
                    footer """),format.raw/*33.28*/("""{"""),format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""background-color: #555;
                        color: white;
                        padding: 15px;
                    """),format.raw/*37.21*/("""}"""),format.raw/*37.22*/("""

            """),format.raw/*39.13*/("""</style>
        </head>
        <body>

            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>

                    </div>

                </div>
            </nav>

            <div class="container-fluid text-center">

                <div class="row content">
                    <div class="col-sm-2 sidenav">

                    </br>

                        <p><a href="http://localhost:9000/widgets"> Search again </a></p>

                    </div>
                    <div class="col-sm-8 text-left">
                        <h1 style="color:darkgoldenrod"> Latest Videos Posted by the Owner </h1>
                        </br>

                        <hr>
                        <h3>Top 10</h3>

                        """),_display_(/*74.26*/for(value <- result) yield /*74.46*/{_display_(Seq[Any](format.raw/*74.47*/("""
                            """),format.raw/*75.29*/("""<h3>"""),_display_(/*75.34*/value),format.raw/*75.39*/("""</h3>
                            <hr>


                        """)))}),format.raw/*79.26*/("""


                    """),format.raw/*82.21*/("""</div>

                </div>
            </div>



        </body>
    </html>




""")))}),format.raw/*95.2*/("""




"""))
      }
    }
  }

  def render(result:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(result)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (result) => apply(result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-10T20:13:35.857
                  SOURCE: /Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/app/views/topTenVideosView.scala.html
                  HASH: c02ea4cc278971cd46ee05394b2d9c53697d370d
                  MATRIX: 956->38|1072->61|1100->64|1135->91|1173->92|1205->98|1882->747|1911->748|1964->773|2072->853|2101->854|2151->876|2284->981|2313->982|2354->995|2383->996|2433->1018|2538->1095|2567->1096|2620->1121|2776->1249|2805->1250|2855->1272|2972->1361|3001->1362|3054->1387|3203->1508|3232->1509|3274->1523|4453->2675|4489->2695|4528->2696|4585->2725|4617->2730|4643->2735|4740->2801|4791->2824|4907->2910
                  LINES: 27->2|32->3|34->5|34->5|34->5|36->7|46->17|46->17|47->18|49->20|49->20|51->22|52->23|52->23|52->23|52->23|54->25|55->26|55->26|56->27|59->30|59->30|61->32|62->33|62->33|63->34|66->37|66->37|68->39|103->74|103->74|103->74|104->75|104->75|104->75|108->79|111->82|124->95
                  -- GENERATED --
              */
          