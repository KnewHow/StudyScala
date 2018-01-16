
// @GENERATOR:play-routes-compiler
// @SOURCE:/project/studyScala/workspace/scalaWorkspace/hello-play/conf/routes
// @DATE:Thu Jan 11 15:16:33 CST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
  }

}
