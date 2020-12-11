// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/conf/routes
// @DATE:Thu Dec 10 20:13:35 EST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseWidgetController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.index2",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "r/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:13
    def createWidget: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.createWidget",
      """
        function(sessionId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("sessionId", sessionId0))})
        }
      """
    )
  
    // @LINE:15
    def owner: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.owner",
      """
        function(chanId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "channel/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("chanId", chanId0))})
        }
      """
    )
  
    // @LINE:17
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "x/ws"})
        }
      """
    )
  
    // @LINE:12
    def index3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.index3",
      """
        function(Value0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rd/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("Value", Value0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def listWidgets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.listWidgets",
      """
        function(sessionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("sessionId", sessionId0))})
        }
      """
    )
  
  }


}
