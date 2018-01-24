
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/how/project/studyScala/workspace/scala_sprint4/conf/routes
// @DATE:Tue Jan 23 14:42:11 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_0: controllers.HomeController,
  // @LINE:5
  UserController_1: controllers.UserController,
  // @LINE:12
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_0: controllers.HomeController,
    // @LINE:5
    UserController_1: controllers.UserController,
    // @LINE:12
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, UserController_1, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register.html""", """controllers.UserController.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/doRegister.html""", """controllers.UserController.doRegister"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """css/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/css", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user_avatar/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/user_image", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login.html""", """controllers.UserController.toLoginPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/doLogin.html""", """controllers.UserController.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """toChatPage.html""", """controllers.UserController.toChatPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """send.html""", """controllers.UserController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userHome.html""", """controllers.UserController.userHome"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """user register""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_UserController_register1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register.html")))
  )
  private[this] lazy val controllers_UserController_register1_invoker = createInvoker(
    UserController_1.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "register",
      Nil,
      "GET",
      this.prefix + """register.html""",
      """forward to register page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_doRegister2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/doRegister.html")))
  )
  private[this] lazy val controllers_UserController_doRegister2_invoker = createInvoker(
    UserController_1.doRegister,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doRegister",
      Nil,
      "POST",
      this.prefix + """user/doRegister.html""",
      """user register
 + nocsrf""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("css/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """css/""" + "$" + """file<.+>""",
      """registe css""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user_avatar/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """user_avatar/""" + "$" + """file<.+>""",
      """user_avatar""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_toLoginPage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login.html")))
  )
  private[this] lazy val controllers_UserController_toLoginPage5_invoker = createInvoker(
    UserController_1.toLoginPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "toLoginPage",
      Nil,
      "GET",
      this.prefix + """login.html""",
      """forward to login page""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UserController_doLogin6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/doLogin.html")))
  )
  private[this] lazy val controllers_UserController_doLogin6_invoker = createInvoker(
    UserController_1.doLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """user/doLogin.html""",
      """user login""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UserController_toChatPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("toChatPage.html")))
  )
  private[this] lazy val controllers_UserController_toChatPage7_invoker = createInvoker(
    UserController_1.toChatPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "toChatPage",
      Nil,
      "GET",
      this.prefix + """toChatPage.html""",
      """forward to chat page""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_socket8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("send.html")))
  )
  private[this] lazy val controllers_UserController_socket8_invoker = createInvoker(
    UserController_1.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "socket",
      Nil,
      "POST",
      this.prefix + """send.html""",
      """submit chat content""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_userHome9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userHome.html")))
  )
  private[this] lazy val controllers_UserController_userHome9_invoker = createInvoker(
    UserController_1.userHome,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userHome",
      Nil,
      "GET",
      this.prefix + """userHome.html""",
      """user home""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:5
    case controllers_UserController_register1_route(params@_) =>
      call { 
        controllers_UserController_register1_invoker.call(UserController_1.register)
      }
  
    // @LINE:9
    case controllers_UserController_doRegister2_route(params@_) =>
      call { 
        controllers_UserController_doRegister2_invoker.call(UserController_1.doRegister)
      }
  
    // @LINE:12
    case controllers_Assets_at3_route(params@_) =>
      call(Param[String]("path", Right("/public/css")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:15
    case controllers_Assets_at4_route(params@_) =>
      call(Param[String]("path", Right("/public/user_image")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:18
    case controllers_UserController_toLoginPage5_route(params@_) =>
      call { 
        controllers_UserController_toLoginPage5_invoker.call(UserController_1.toLoginPage)
      }
  
    // @LINE:21
    case controllers_UserController_doLogin6_route(params@_) =>
      call { 
        controllers_UserController_doLogin6_invoker.call(UserController_1.doLogin)
      }
  
    // @LINE:24
    case controllers_UserController_toChatPage7_route(params@_) =>
      call { 
        controllers_UserController_toChatPage7_invoker.call(UserController_1.toChatPage)
      }
  
    // @LINE:27
    case controllers_UserController_socket8_route(params@_) =>
      call { 
        controllers_UserController_socket8_invoker.call(UserController_1.socket)
      }
  
    // @LINE:30
    case controllers_UserController_userHome9_route(params@_) =>
      call { 
        controllers_UserController_userHome9_invoker.call(UserController_1.userHome)
      }
  }
}
