
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/how/project/studyScala/workspace/hello-play/conf/routes
// @DATE:Wed Jan 24 15:20:55 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers.javascript {

  // @LINE:10
  class ReverseMyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def showFodward: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyController.showFodward",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action/builder/showFodward.html"})
        }
      """
    )
  
    // @LINE:13
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyController.submit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action/builder/submit.html"})
        }
      """
    )
  
    // @LINE:25
    def showHttps: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyController.showHttps",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action/builder/showHTTPS.html"})
        }
      """
    )
  
    // @LINE:17
    def index2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyController.index2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action/builder/index2.html"})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action/builder.html"})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseLearnRequestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def showRequestInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LearnRequestController.showRequestInfo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action/builder/requestinfo.html"})
        }
      """
    )
  
    // @LINE:28
    def showUserAuthentication: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LearnRequestController.showUserAuthentication",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "action/builder/showUserAuthen.html"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def personList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.personList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/personList"})
        }
      """
    )
  
  }


}
