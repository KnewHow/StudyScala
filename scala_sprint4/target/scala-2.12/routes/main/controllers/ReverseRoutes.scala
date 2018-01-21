
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/conf/routes
// @DATE:Sat Jan 20 11:15:01 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:12
        case (path, file) if path == "/public/css" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/css"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
        // @LINE:15
        case (path, file) if path == "/public/user_image" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/user_image"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "user_avatar/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:5
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/doLogin.html")
    }
  
    // @LINE:9
    def doRegister(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/doRegister.html")
    }
  
    // @LINE:18
    def toLoginPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login.html")
    }
  
    // @LINE:5
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register.html")
    }
  
  }


}