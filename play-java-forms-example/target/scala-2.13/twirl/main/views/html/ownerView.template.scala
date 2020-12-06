
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

object ownerView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /* ownerView Template File */
  def apply/*2.2*/(result: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Youtube Channel Details")/*5.33*/{_display_(Seq[Any](format.raw/*5.34*/("""

"""),format.raw/*7.1*/("""<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar """),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""
      """),format.raw/*18.7*/("""margin-bottom: 0;
      border-radius: 0;
    """),format.raw/*20.5*/("""}"""),format.raw/*20.6*/("""
    
    """),format.raw/*22.5*/("""/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content """),format.raw/*23.18*/("""{"""),format.raw/*23.19*/("""height: 450px"""),format.raw/*23.32*/("""}"""),format.raw/*23.33*/("""
    
    """),format.raw/*25.5*/("""/* Set gray background color and 100% height */
    .sidenav """),format.raw/*26.14*/("""{"""),format.raw/*26.15*/("""
      """),format.raw/*27.7*/("""padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/("""
    
    """),format.raw/*32.5*/("""/* Set black background color, white text and some padding */
    footer """),format.raw/*33.12*/("""{"""),format.raw/*33.13*/("""
      """),format.raw/*34.7*/("""background-color: #555;
      color: white;
      padding: 15px;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""
 
  """),format.raw/*39.3*/("""</style>
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
    <div class="col-sm-3 sidenav">
  
       <img src="""),_display_(/*62.18*/result/*62.24*/.get(3)),format.raw/*62.31*/(""" """),format.raw/*62.32*/("""class="img-circle" height="200" width="200" alt="Avatar">
       
       </br>
       
       <p ><b>Subscribers:</b> """),_display_(/*66.33*/result/*66.39*/.get(4)),format.raw/*66.46*/("""</p>   
     </br>
      <p ><b>Videos:</b> """),_display_(/*68.27*/result/*68.33*/.get(5)),format.raw/*68.40*/("""</p>  
      </br>
      <p > <b>Views:</b> """),_display_(/*70.27*/result/*70.33*/.get(6)),format.raw/*70.40*/("""</p>
         </br>  
      <p > <b>Joined:</b> """),_display_(/*72.28*/result/*72.34*/.get(2)),format.raw/*72.41*/("""</p>
   
    </br>
    
    </div>
    <div class="col-sm-8 text-left"> 
      <h1 >Welcome To the <b style = "color:red"> """),_display_(/*78.52*/result/*78.58*/.get(1)),format.raw/*78.65*/(""" """),format.raw/*78.66*/("""</b> Youtube Page Information </h1>
      </br>
      
      <hr>
      <h3>About</h3>
     <p> """),_display_(/*83.11*/result/*83.17*/.get(0)),format.raw/*83.24*/("""</p>
        
      
      </br>

      
      
    </div>
   
  </div>
</div>



</body>
</html>




""")))}),format.raw/*103.2*/("""

"""))
      }
    }
  }

  def render(result:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(result)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (result) => apply(result)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-05T17:06:04.463
                  SOURCE: /Users/ankuraggarwal/Desktop/safest version/Project Part 1/play-java-forms-example/app/views/ownerView.scala.html
                  HASH: fbf69266b33662e988a88e362be164c02bacd6d2
                  MATRIX: 941->31|1056->53|1084->56|1123->87|1161->88|1189->90|1755->628|1784->629|1818->636|1891->682|1919->683|1956->693|2073->782|2102->783|2143->796|2172->797|2209->807|2298->868|2327->869|2361->876|2464->952|2492->953|2529->963|2630->1036|2659->1037|2693->1044|2789->1113|2817->1114|2849->1119|3425->1668|3440->1674|3468->1681|3497->1682|3643->1801|3658->1807|3686->1814|3758->1859|3773->1865|3801->1872|3873->1917|3888->1923|3916->1930|3992->1979|4007->1985|4035->1992|4186->2116|4201->2122|4229->2129|4258->2130|4382->2227|4397->2233|4425->2240|4559->2343
                  LINES: 27->2|32->3|34->5|34->5|34->5|36->7|46->17|46->17|47->18|49->20|49->20|51->22|52->23|52->23|52->23|52->23|54->25|55->26|55->26|56->27|59->30|59->30|61->32|62->33|62->33|63->34|66->37|66->37|68->39|91->62|91->62|91->62|91->62|95->66|95->66|95->66|97->68|97->68|97->68|99->70|99->70|99->70|101->72|101->72|101->72|107->78|107->78|107->78|107->78|112->83|112->83|112->83|132->103
                  -- GENERATED --
              */
          