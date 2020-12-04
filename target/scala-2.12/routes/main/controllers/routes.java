// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jayasree/Practice/Scala/workspace/andrewrichards1/ddcw-technical-test/conf/routes
// @DATE:Sun Nov 29 20:42:29 GMT 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMessageController MessageController = new controllers.ReverseMessageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMessageController MessageController = new controllers.javascript.ReverseMessageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
