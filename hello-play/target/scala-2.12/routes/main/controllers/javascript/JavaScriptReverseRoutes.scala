
// @GENERATOR:play-routes-compiler
// @SOURCE:/project/studyScala/workspace/scalaWorkspace/hello-play/conf/routes
// @DATE:Thu Jan 11 15:16:33 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers.javascript {

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
