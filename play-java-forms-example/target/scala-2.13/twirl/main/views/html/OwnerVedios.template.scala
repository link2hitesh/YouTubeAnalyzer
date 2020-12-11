
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

object OwnerVedios extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[channelvideolist],List[channelvideolist],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(VTitle: List[channelvideolist],VReverse:List[channelvideolist],V:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""    """),_display_(/*2.6*/main("ListOfVedios")/*2.26*/{_display_(Seq[Any](format.raw/*2.27*/("""

        """),format.raw/*4.9*/("""<div class="split left">

            <button class="btn1" onclick="goBack()"> Back</button>

            <script>
                    function goBack() """),format.raw/*9.39*/("""{"""),format.raw/*9.40*/("""
                        """),format.raw/*10.25*/("""window.history.back();
                    """),format.raw/*11.21*/("""}"""),format.raw/*11.22*/("""
            """),format.raw/*12.13*/("""</script>

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

            <h1 style="color:#85144b" > """),_display_(/*28.42*/V),format.raw/*28.43*/(""" """),format.raw/*28.44*/("""</h1>
        </div>


        <button class="btn1" onclick="myFunction()">Order</button>
        <script>
                function myFunction()"""),format.raw/*34.38*/("""{"""),format.raw/*34.39*/("""
                    """),format.raw/*35.21*/("""const main = document.getElementById('VList2');
                    const div= document.getElementById('VList3');
                    const clone= div.cloneNode(true);

                    while(main.firstChild) main.firstChild.remove();
                    main.appendChild(clone);

                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""
        """),format.raw/*43.9*/("""</script>

        <div class="split right">


            <button class="btn1" onclick="myFunction()">Order</button>




            <h1 style="color:#85144b" align="center"> Latest Videos Posted by the Owner </h1>
            <div class="Video2" id = "VList2">


            """),_display_(/*57.14*/for(value <- VTitle) yield /*57.34*/{_display_(Seq[Any](format.raw/*57.35*/("""
                """),format.raw/*58.17*/("""<h3> """),_display_(/*58.23*/value/*58.28*/.title),format.raw/*58.34*/(""" """),format.raw/*58.35*/("""</h3>
                <h3> """),_display_(/*59.23*/value/*59.28*/.Date),format.raw/*59.33*/(""" """),format.raw/*59.34*/("""</h3>

                <hr>


                """)))}),format.raw/*64.18*/("""


            """),format.raw/*67.13*/("""</div>

            <div class="Video3" id = "VList3" >


            """),_display_(/*72.14*/for(value <- VReverse) yield /*72.36*/{_display_(Seq[Any](format.raw/*72.37*/("""
                """),format.raw/*73.17*/("""<h3> """),_display_(/*73.23*/value/*73.28*/.title),format.raw/*73.34*/(""" """),format.raw/*73.35*/("""</h3>
                <h3> """),_display_(/*74.23*/value/*74.28*/.Date),format.raw/*74.33*/(""" """),format.raw/*74.34*/("""</h3>

                <hr>


                """)))}),format.raw/*79.18*/("""


            """),format.raw/*82.13*/("""</div>



        </div>



    """)))}))
      }
    }
  }

  def render(VTitle:List[channelvideolist],VReverse:List[channelvideolist],V:String): play.twirl.api.HtmlFormat.Appendable = apply(VTitle,VReverse,V)

  def f:((List[channelvideolist],List[channelvideolist],String) => play.twirl.api.HtmlFormat.Appendable) = (VTitle,VReverse,V) => apply(VTitle,VReverse,V)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-10T20:13:35.734
                  SOURCE: /Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/app/views/OwnerVedios.scala.html
                  HASH: 95673f425d07d3560660e7fb41e3991f72fd944d
                  MATRIX: 959->1|1126->75|1156->80|1184->100|1222->101|1258->111|1438->264|1466->265|1519->290|1590->333|1619->334|1660->347|2387->1047|2409->1048|2438->1049|2610->1193|2639->1194|2688->1215|3016->1515|3045->1516|3081->1525|3386->1803|3422->1823|3461->1824|3506->1841|3539->1847|3553->1852|3580->1858|3609->1859|3664->1887|3678->1892|3704->1897|3733->1898|3811->1945|3854->1960|3952->2031|3990->2053|4029->2054|4074->2071|4107->2077|4121->2082|4148->2088|4177->2089|4232->2117|4246->2122|4272->2127|4301->2128|4379->2175|4422->2190
                  LINES: 27->1|32->2|32->2|32->2|32->2|34->4|39->9|39->9|40->10|41->11|41->11|42->12|58->28|58->28|58->28|64->34|64->34|65->35|72->42|72->42|73->43|87->57|87->57|87->57|88->58|88->58|88->58|88->58|88->58|89->59|89->59|89->59|89->59|94->64|97->67|102->72|102->72|102->72|103->73|103->73|103->73|103->73|103->73|104->74|104->74|104->74|104->74|109->79|112->82
                  -- GENERATED --
              */
          