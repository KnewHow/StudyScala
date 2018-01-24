
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/how/project/studyScala/workspace/hello-play/conf/routes
// @DATE:Wed Jan 24 15:20:55 CST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMyController MyController = new controllers.ReverseMyController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLearnRequestController LearnRequestController = new controllers.ReverseLearnRequestController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMyController MyController = new controllers.javascript.ReverseMyController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLearnRequestController LearnRequestController = new controllers.javascript.ReverseLearnRequestController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
  }

}
