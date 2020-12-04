// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jayasree/Practice/Scala/workspace/andrewrichards1/ddcw-technical-test/conf/routes
// @DATE:Sun Nov 29 20:42:29 GMT 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  MessageController_0: controllers.MessageController,
  // @LINE:8
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    MessageController_0: controllers.MessageController,
    // @LINE:8
    Assets_1: controllers.Assets
  ) = this(errorHandler, MessageController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MessageController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backend/print""", """controllers.MessageController.printMessage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backend/showbalance""", """controllers.MessageController.showbalance"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backend/deposit""", """controllers.MessageController.deposit"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """backend/withdraw""", """controllers.MessageController.withdraw"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_MessageController_printMessage0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backend/print")))
  )
  private[this] lazy val controllers_MessageController_printMessage0_invoker = createInvoker(
    MessageController_0.printMessage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "printMessage",
      Nil,
      "POST",
      this.prefix + """backend/print""",
      """ Message Controller""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_MessageController_showbalance1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backend/showbalance")))
  )
  private[this] lazy val controllers_MessageController_showbalance1_invoker = createInvoker(
    MessageController_0.showbalance,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "showbalance",
      Nil,
      "GET",
      this.prefix + """backend/showbalance""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_MessageController_deposit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backend/deposit")))
  )
  private[this] lazy val controllers_MessageController_deposit2_invoker = createInvoker(
    MessageController_0.deposit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "deposit",
      Nil,
      "POST",
      this.prefix + """backend/deposit""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_MessageController_withdraw3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("backend/withdraw")))
  )
  private[this] lazy val controllers_MessageController_withdraw3_invoker = createInvoker(
    MessageController_0.withdraw,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "withdraw",
      Nil,
      "PUT",
      this.prefix + """backend/withdraw""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
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
  
    // @LINE:2
    case controllers_MessageController_printMessage0_route(params@_) =>
      call { 
        controllers_MessageController_printMessage0_invoker.call(MessageController_0.printMessage)
      }
  
    // @LINE:3
    case controllers_MessageController_showbalance1_route(params@_) =>
      call { 
        controllers_MessageController_showbalance1_invoker.call(MessageController_0.showbalance)
      }
  
    // @LINE:4
    case controllers_MessageController_deposit2_route(params@_) =>
      call { 
        controllers_MessageController_deposit2_invoker.call(MessageController_0.deposit)
      }
  
    // @LINE:5
    case controllers_MessageController_withdraw3_route(params@_) =>
      call { 
        controllers_MessageController_withdraw3_invoker.call(MessageController_0.withdraw)
      }
  
    // @LINE:8
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
