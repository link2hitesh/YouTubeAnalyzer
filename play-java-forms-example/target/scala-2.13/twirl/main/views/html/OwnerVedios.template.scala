
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

object OwnerVedios extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(VTitle: List[String],V:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("ListOfVedios")/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""

    """),format.raw/*4.5*/("""<div class="split left">

        <button class="btn1" onclick="goBack()"> Back</button>

        <script>
                function goBack() """),format.raw/*9.35*/("""{"""),format.raw/*9.36*/("""
                    """),format.raw/*10.21*/("""window.history.back();
                """),format.raw/*11.17*/("""}"""),format.raw/*11.18*/("""
        """),format.raw/*12.9*/("""</script>

        <br>
        <br>
        <br>
        <br>
        <h1 style="color:#85144b" align="center"> About This Page </h1>
        <p style="text-align:center">This Page display the list of ten latest videos uploaded by the user on its channel.The list is sorted by order in which they are posted.This means list display videos in order of latest first. Along with the the videos title and the upload date is also uploaded in the list. </p>
        <br>
        <br>
        <br>
        <br>
        <h1 style="color:#85144b" align="center"> Channel Owner's ID </h1>
        <br>
        <br>

        <h1 style="color:#85144b" > """),_display_(/*28.38*/V),format.raw/*28.39*/(""" """),format.raw/*28.40*/("""</h1>
    </div>

    <div class="split right">

            <h1 style="color:#85144b" align="center"> Latest Videos Posted by the Owner </h1>
            <div class="Video2" id = "VList2">



            """),_display_(/*38.14*/for(value <-VTitle) yield /*38.33*/{_display_(Seq[Any](format.raw/*38.34*/("""
                """),format.raw/*39.17*/("""<h3>"""),_display_(/*39.22*/value),format.raw/*39.27*/("""</h3>
                <hr>


                """)))}),format.raw/*43.18*/("""



        """),format.raw/*47.9*/("""</div>
    </div>


""")))}))
      }
    }
  }

  def render(VTitle:List[String],V:String): play.twirl.api.HtmlFormat.Appendable = apply(VTitle,V)

  def f:((List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (VTitle,V) => apply(VTitle,V)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-05T17:06:04.516
                  SOURCE: /Users/ankuraggarwal/Desktop/safest version/Project Part 1/play-java-forms-example/app/views/OwnerVedios.scala.html
                  HASH: 197344096170e6b7a9b7c35f1f6de406fc3ccb22
                  MATRIX: 926->1|1051->34|1079->54|1117->55|1149->61|1317->202|1345->203|1394->224|1461->263|1490->264|1526->273|2197->917|2219->918|2248->919|2481->1125|2516->1144|2555->1145|2600->1162|2632->1167|2658->1172|2735->1218|2774->1230
                  LINES: 27->1|32->2|32->2|32->2|34->4|39->9|39->9|40->10|41->11|41->11|42->12|58->28|58->28|58->28|68->38|68->38|68->38|69->39|69->39|69->39|73->43|77->47
                  -- GENERATED --
              */
          