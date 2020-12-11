
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

object ListOfVideos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(result: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/("ListOfVedios")),format.raw/*3.18*/("""

"""),format.raw/*5.1*/("""<div class="similar" id ="segment1">

    <h1  align="centre" >  Similarity Statistics  </h1>
</div>

<div class="similar2" id = "segment1">

"""),_display_(/*12.2*/for(value <- result) yield /*12.22*/{_display_(Seq[Any](format.raw/*12.23*/("""
    """),format.raw/*13.5*/("""<h3>"""),_display_(/*13.10*/value),format.raw/*13.15*/("""</h3>
    <hr>


    """)))}),format.raw/*17.6*/("""

"""),format.raw/*19.1*/("""</div>"""))
      }
    }
  }

  def render(result:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(result)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (result) => apply(result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-10T20:13:35.658
                  SOURCE: /Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/app/views/ListOfVideos.scala.html
                  HASH: 30d0c2e8cf12bd074aa195b56aa2abaceed744d3
                  MATRIX: 920->2|1036->26|1072->42|1100->44|1269->187|1305->207|1344->208|1376->213|1408->218|1434->223|1486->245|1515->247
                  LINES: 27->2|32->3|32->3|34->5|41->12|41->12|41->12|42->13|42->13|42->13|46->17|48->19
                  -- GENERATED --
              */
          