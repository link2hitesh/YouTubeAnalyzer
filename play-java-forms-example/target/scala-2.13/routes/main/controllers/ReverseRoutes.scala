// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/conf/routes
// @DATE:Thu Dec 10 20:13:35 EST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseWidgetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index2(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "r/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:13
    def createWidget(sessionId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sessionId", sessionId)))
    }
  
    // @LINE:15
    def owner(chanId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "channel/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("chanId", chanId)))
    }
  
    // @LINE:17
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "x/ws")
    }
  
    // @LINE:12
    def index3(Value:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rd/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("Value", Value)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def listWidgets(sessionId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sessionId", sessionId)))
    }
  
  }


}
