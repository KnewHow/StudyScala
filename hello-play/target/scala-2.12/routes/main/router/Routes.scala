
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/how/project/studyScala/workspace/hello-play/conf/routes
// @DATE:Wed Jan 24 15:20:55 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  HomeController_0: controllers.HomeController,
  // @LINE:7
  PersonController_3: controllers.PersonController,
  // @LINE:10
  MyController_1: controllers.MyController,
  // @LINE:28
  LearnRequestController_2: controllers.LearnRequestController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    HomeController_0: controllers.HomeController,
    // @LINE:7
    PersonController_3: controllers.PersonController,
    // @LINE:10
    MyController_1: controllers.MyController,
    // @LINE:28
    LearnRequestController_2: controllers.LearnRequestController
  ) = this(errorHandler, HomeController_0, PersonController_3, MyController_1, LearnRequestController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, PersonController_3, MyController_1, LearnRequestController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/personList""", """controllers.PersonController.personList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action/builder.html""", """controllers.MyController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action/builder/submit.html""", """controllers.MyController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action/builder/index2.html""", """controllers.MyController.index2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action/builder/showFodward.html""", """controllers.MyController.showFodward"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action/builder/showHTTPS.html""", """controllers.MyController.showHttps"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action/builder/showUserAuthen.html""", """controllers.LearnRequestController.showUserAuthentication"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """action/builder/requestinfo.html""", """controllers.LearnRequestController.showRequestInfo"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
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
      """index page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PersonController_personList1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/personList")))
  )
  private[this] lazy val controllers_PersonController_personList1_invoker = createInvoker(
    PersonController_3.personList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "personList",
      Nil,
      "GET",
      this.prefix + """person/personList""",
      """person List""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_MyController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action/builder.html")))
  )
  private[this] lazy val controllers_MyController_index2_invoker = createInvoker(
    MyController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyController",
      "index",
      Nil,
      "GET",
      this.prefix + """action/builder.html""",
      """test action builder""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MyController_submit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action/builder/submit.html")))
  )
  private[this] lazy val controllers_MyController_submit3_invoker = createInvoker(
    MyController_1.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyController",
      "submit",
      Nil,
      "GET",
      this.prefix + """action/builder/submit.html""",
      """test submit request""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MyController_index24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action/builder/index2.html")))
  )
  private[this] lazy val controllers_MyController_index24_invoker = createInvoker(
    MyController_1.index2,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyController",
      "index2",
      Nil,
      "GET",
      this.prefix + """action/builder/index2.html""",
      """test submit request""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_MyController_showFodward5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action/builder/showFodward.html")))
  )
  private[this] lazy val controllers_MyController_showFodward5_invoker = createInvoker(
    MyController_1.showFodward,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyController",
      "showFodward",
      Nil,
      "GET",
      this.prefix + """action/builder/showFodward.html""",
      """test forword request""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_MyController_showHttps6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action/builder/showHTTPS.html")))
  )
  private[this] lazy val controllers_MyController_showHttps6_invoker = createInvoker(
    MyController_1.showHttps,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyController",
      "showHttps",
      Nil,
      "GET",
      this.prefix + """action/builder/showHTTPS.html""",
      """test https validate request""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_LearnRequestController_showUserAuthentication7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action/builder/showUserAuthen.html")))
  )
  private[this] lazy val controllers_LearnRequestController_showUserAuthentication7_invoker = createInvoker(
    LearnRequestController_2.showUserAuthentication,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LearnRequestController",
      "showUserAuthentication",
      Nil,
      "GET",
      this.prefix + """action/builder/showUserAuthen.html""",
      """test user authentication""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_LearnRequestController_showRequestInfo8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("action/builder/requestinfo.html")))
  )
  private[this] lazy val controllers_LearnRequestController_showRequestInfo8_invoker = createInvoker(
    LearnRequestController_2.showRequestInfo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LearnRequestController",
      "showRequestInfo",
      Nil,
      "GET",
      this.prefix + """action/builder/requestinfo.html""",
      """test request info""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_PersonController_personList1_route(params@_) =>
      call { 
        controllers_PersonController_personList1_invoker.call(PersonController_3.personList)
      }
  
    // @LINE:10
    case controllers_MyController_index2_route(params@_) =>
      call { 
        controllers_MyController_index2_invoker.call(MyController_1.index)
      }
  
    // @LINE:13
    case controllers_MyController_submit3_route(params@_) =>
      call { 
        controllers_MyController_submit3_invoker.call(MyController_1.submit)
      }
  
    // @LINE:17
    case controllers_MyController_index24_route(params@_) =>
      call { 
        controllers_MyController_index24_invoker.call(MyController_1.index2)
      }
  
    // @LINE:21
    case controllers_MyController_showFodward5_route(params@_) =>
      call { 
        controllers_MyController_showFodward5_invoker.call(MyController_1.showFodward)
      }
  
    // @LINE:25
    case controllers_MyController_showHttps6_route(params@_) =>
      call { 
        controllers_MyController_showHttps6_invoker.call(MyController_1.showHttps)
      }
  
    // @LINE:28
    case controllers_LearnRequestController_showUserAuthentication7_route(params@_) =>
      call { 
        controllers_LearnRequestController_showUserAuthentication7_invoker.call(LearnRequestController_2.showUserAuthentication)
      }
  
    // @LINE:31
    case controllers_LearnRequestController_showRequestInfo8_route(params@_) =>
      call { 
        controllers_LearnRequestController_showRequestInfo8_invoker.call(LearnRequestController_2.showRequestInfo)
      }
  }
}
