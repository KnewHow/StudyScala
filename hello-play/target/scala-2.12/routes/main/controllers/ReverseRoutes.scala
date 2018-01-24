
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/how/project/studyScala/workspace/hello-play/conf/routes
// @DATE:Wed Jan 24 15:20:55 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:4
package controllers {

  // @LINE:10
  class ReverseMyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def showFodward(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action/builder/showFodward.html")
    }
  
    // @LINE:13
    def submit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action/builder/submit.html")
    }
  
    // @LINE:25
    def showHttps(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action/builder/showHTTPS.html")
    }
  
    // @LINE:17
    def index2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action/builder/index2.html")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action/builder.html")
    }
  
  }

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

  // @LINE:28
  class ReverseLearnRequestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def showRequestInfo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action/builder/requestinfo.html")
    }
  
    // @LINE:28
    def showUserAuthentication(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "action/builder/showUserAuthen.html")
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
