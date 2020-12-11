
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

object Simillarcontent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(result: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Top Ten videos List")/*5.29*/{_display_(Seq[Any](format.raw/*5.30*/("""

"""),format.raw/*7.1*/("""<div class="similar" id ="segment1">

    <h1  align="centre" >  Similarity Statistics  </h1>
</div>

    <div class="button" id="segment3">
    <form>
        <input type="button" value="Go back!" onclick="history.back()">
    </form>
    </div>

<div class="similar2" id = "segment1">

    """),_display_(/*20.6*/for(value <- result) yield /*20.26*/{_display_(Seq[Any](format.raw/*20.27*/("""
        """),format.raw/*21.9*/("""<h3>"""),_display_(/*21.14*/value),format.raw/*21.19*/("""</h3>
        <hr>


    """)))}),format.raw/*25.6*/("""

    """),format.raw/*27.5*/("""</div>










""")))}))
      }
    }
  }

  def render(result:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(result)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (result) => apply(result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-10T20:13:35.703
                  SOURCE: /Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/app/views/Simillarcontent.scala.html
                  HASH: 45690c2db25f157cd767f06b021c3c485f09faeb
                  MATRIX: 923->2|1039->25|1067->28|1102->55|1140->56|1168->58|1487->351|1523->371|1562->372|1598->381|1630->386|1656->391|1712->417|1745->423
                  LINES: 27->2|32->3|34->5|34->5|34->5|36->7|49->20|49->20|49->20|50->21|50->21|50->21|54->25|56->27
                  -- GENERATED --
              */
          