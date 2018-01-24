
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/how/project/studyScala/workspace/scala_sprint4/conf/routes
// @DATE:Tue Jan 23 14:42:11 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(path0,file1) {
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/css") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "css/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("/public/user_image") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user_avatar/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def toChatPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.toChatPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toChatPage.html"})
        }
      """
    )
  
    // @LINE:30
    def userHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userHome.html"})
        }
      """
    )
  
    // @LINE:21
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/doLogin.html"})
        }
      """
    )
  
    // @LINE:9
    def doRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.doRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/doRegister.html"})
        }
      """
    )
  
    // @LINE:27
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.socket",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "send.html"})
        }
      """
    )
  
    // @LINE:5
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register.html"})
        }
      """
    )
  
    // @LINE:18
    def toLoginPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.toLoginPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login.html"})
        }
      """
    )
  
  }


}
