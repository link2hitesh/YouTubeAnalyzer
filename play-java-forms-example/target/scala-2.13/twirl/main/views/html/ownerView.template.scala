
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

object ownerView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /* ownerView Template File */
  def apply/*2.2*/(result: List[String]):play.twirl.api.HtmlFormat.Appendable = {
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
      <button class="btn-primary" onclick="goBack()"> Back To Search</button>
      <script>
              function goBack() """),format.raw/*75.33*/("""{"""),format.raw/*75.34*/("""
                """),format.raw/*76.17*/("""window.history.back();
              """),format.raw/*77.15*/("""}"""),format.raw/*77.16*/("""
      """),format.raw/*78.7*/("""</script>
   
    </br>
    
    </div>
    <div class="col-sm-8 text-left"> 
      <h1 >Welcome To the <b style = "color:red"> """),_display_(/*84.52*/result/*84.58*/.get(1)),format.raw/*84.65*/(""" """),format.raw/*84.66*/("""</b> Youtube Page Information </h1>
      </br>
      
      <hr>
      <h3>About</h3>
     <p> """),_display_(/*89.11*/result/*89.17*/.get(0)),format.raw/*89.24*/("""</p>
        
      
      </br>

      
      
    </div>
   
  </div>
</div>



</body>
</html>




""")))}),format.raw/*109.2*/("""

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
                  DATE: 2020-12-10T20:13:35.562
                  SOURCE: /Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/app/views/ownerView.scala.html
                  HASH: 2cee002c369dbcc8b20c936512140112fe0046f2
                  MATRIX: 942->31|1058->54|1086->57|1125->88|1163->89|1191->91|1757->629|1786->630|1820->637|1893->683|1921->684|1958->694|2075->783|2104->784|2145->797|2174->798|2211->808|2300->869|2329->870|2363->877|2466->953|2494->954|2531->964|2632->1037|2661->1038|2695->1045|2791->1114|2819->1115|2851->1120|3427->1669|3442->1675|3470->1682|3499->1683|3645->1802|3660->1808|3688->1815|3760->1860|3775->1866|3803->1873|3875->1918|3890->1924|3918->1931|3994->1980|4009->1986|4037->1993|4195->2123|4224->2124|4269->2141|4334->2178|4363->2179|4397->2186|4553->2315|4568->2321|4596->2328|4625->2329|4749->2426|4764->2432|4792->2439|4926->2542
                  LINES: 27->2|32->3|34->5|34->5|34->5|36->7|46->17|46->17|47->18|49->20|49->20|51->22|52->23|52->23|52->23|52->23|54->25|55->26|55->26|56->27|59->30|59->30|61->32|62->33|62->33|63->34|66->37|66->37|68->39|91->62|91->62|91->62|91->62|95->66|95->66|95->66|97->68|97->68|97->68|99->70|99->70|99->70|101->72|101->72|101->72|104->75|104->75|105->76|106->77|106->77|107->78|113->84|113->84|113->84|113->84|118->89|118->89|118->89|138->109
                  -- GENERATED --
              */
          