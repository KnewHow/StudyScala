
// @GENERATOR:play-routes-compiler
// @SOURCE:/project/studyScala/workspace/scalaWorkspace/hello-play/conf/routes
// @DATE:Thu Jan 11 15:16:33 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers {

  // @LINE:4
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:7
  class ReversePersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def personList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/personList")
    }
  
  }


}
