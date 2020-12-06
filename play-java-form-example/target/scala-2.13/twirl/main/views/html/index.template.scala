
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Welcome to Play")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
    """),format.raw/*4.5*/("""<div>
      <ul>
        <li>Welcome to the Youtube Analyzer . Please click  <a href=""""),_display_(/*6.71*/routes/*6.77*/.WidgetController.listWidgets),format.raw/*6.106*/("""">"""),_display_(/*6.109*/routes/*6.115*/.WidgetController.listWidgets),format.raw/*6.144*/("""</a></li>
      </ul>

    </div>

  """)))}),format.raw/*11.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-04T17:45:28.290
                  SOURCE: C:/Users/hites/Desktop/Project Part 1/Project Part 1/play-java-forms-example/app/views/index.scala.html
                  HASH: 4bf288f7b049e718619fd30c8b627c221ab86e14
                  MATRIX: 900->1|996->4|1025->8|1056->31|1095->33|1126->38|1239->125|1253->131|1303->160|1333->163|1348->169|1398->198|1466->236
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|36->6|36->6|36->6|36->6|36->6|36->6|41->11
                  -- GENERATED --
              */
          