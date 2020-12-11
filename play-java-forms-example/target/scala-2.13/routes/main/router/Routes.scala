// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/conf/routes
// @DATE:Thu Dec 10 20:13:35 EST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  WidgetController_0: controllers.WidgetController,
  // @LINE:20
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    WidgetController_0: controllers.WidgetController,
    // @LINE:20
    Assets_1: controllers.Assets
  ) = this(errorHandler, WidgetController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, WidgetController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.WidgetController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """sessionId<[^/]+>""", """controllers.WidgetController.listWidgets(sessionId:String, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """r/""" + "$" + """name<[^/]+>""", """controllers.WidgetController.index2(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rd/""" + "$" + """Value<[^/]+>""", """controllers.WidgetController.index3(Value:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """sessionId<[^/]+>""", """controllers.WidgetController.createWidget(sessionId:String, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """channel/""" + "$" + """chanId<[^/]+>""", """controllers.WidgetController.owner(chanId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """x/ws""", """controllers.WidgetController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_WidgetController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_WidgetController_index0_invoker = createInvoker(
    WidgetController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_WidgetController_listWidgets1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("sessionId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WidgetController_listWidgets1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WidgetController_0.listWidgets(fakeValue[String], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "listWidgets",
      Seq(classOf[String], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""" + "$" + """sessionId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_WidgetController_index22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("r/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WidgetController_index22_invoker = createInvoker(
    WidgetController_0.index2(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "index2",
      Seq(classOf[String]),
      "GET",
      this.prefix + """r/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_WidgetController_index33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rd/"), DynamicPart("Value", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WidgetController_index33_invoker = createInvoker(
    WidgetController_0.index3(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "index3",
      Seq(classOf[String]),
      "GET",
      this.prefix + """rd/""" + "$" + """Value<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_WidgetController_createWidget4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("sessionId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WidgetController_createWidget4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WidgetController_0.createWidget(fakeValue[String], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "createWidget",
      Seq(classOf[String], classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """""" + "$" + """sessionId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_WidgetController_owner5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("channel/"), DynamicPart("chanId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WidgetController_owner5_invoker = createInvoker(
    WidgetController_0.owner(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "owner",
      Seq(classOf[String]),
      "GET",
      this.prefix + """channel/""" + "$" + """chanId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_WidgetController_socket6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("x/ws")))
  )
  private[this] lazy val controllers_WidgetController_socket6_invoker = createInvoker(
    WidgetController_0.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "socket",
      Nil,
      "GET",
      this.prefix + """x/ws""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_WidgetController_index0_route(params@_) =>
      call { 
        controllers_WidgetController_index0_invoker.call(WidgetController_0.index)
      }
  
    // @LINE:10
    case controllers_WidgetController_listWidgets1_route(params@_) =>
      call(params.fromPath[String]("sessionId", None)) { (sessionId) =>
        controllers_WidgetController_listWidgets1_invoker.call(
          req => WidgetController_0.listWidgets(sessionId, req))
      }
  
    // @LINE:11
    case controllers_WidgetController_index22_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_WidgetController_index22_invoker.call(WidgetController_0.index2(name))
      }
  
    // @LINE:12
    case controllers_WidgetController_index33_route(params@_) =>
      call(params.fromPath[String]("Value", None)) { (Value) =>
        controllers_WidgetController_index33_invoker.call(WidgetController_0.index3(Value))
      }
  
    // @LINE:13
    case controllers_WidgetController_createWidget4_route(params@_) =>
      call(params.fromPath[String]("sessionId", None)) { (sessionId) =>
        controllers_WidgetController_createWidget4_invoker.call(
          req => WidgetController_0.createWidget(sessionId, req))
      }
  
    // @LINE:15
    case controllers_WidgetController_owner5_route(params@_) =>
      call(params.fromPath[String]("chanId", None)) { (chanId) =>
        controllers_WidgetController_owner5_invoker.call(WidgetController_0.owner(chanId))
      }
  
    // @LINE:17
    case controllers_WidgetController_socket6_route(params@_) =>
      call { 
        controllers_WidgetController_socket6_invoker.call(WidgetController_0.socket)
      }
  
    // @LINE:20
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
