// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hites/Desktop/Project Part 1/Project Part 1/play-java-forms-example/conf/routes
// @DATE:Fri Dec 04 17:45:28 EST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
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

  
    // @LINE:12
    def index2(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "r/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:11
    def listWidgets(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "widgets")
    }
  
    // @LINE:14
    def createWidget(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "widgets")
    }
  
    // @LINE:16
    def owner(chanId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "channel/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("chanId", chanId)))
    }
  
    // @LINE:7
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ws")
    }
  
    // @LINE:13
    def index3(Value:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rd/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("Value", Value)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
