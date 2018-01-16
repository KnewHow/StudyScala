
// @GENERATOR:play-routes-compiler
// @SOURCE:/project/studyScala/workspace/scalaWorkspace/hello-play/conf/routes
// @DATE:Thu Jan 11 15:16:33 CST 2018

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
  PersonController_1: controllers.PersonController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    HomeController_0: controllers.HomeController,
    // @LINE:7
    PersonController_1: controllers.PersonController
  ) = this(errorHandler, HomeController_0, PersonController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, PersonController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/personList""", """controllers.PersonController.personList"""),
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
    PersonController_1.personList,
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_PersonController_personList1_route(params@_) =>
      call { 
        controllers_PersonController_personList1_invoker.call(PersonController_1.personList)
      }
  }
}
