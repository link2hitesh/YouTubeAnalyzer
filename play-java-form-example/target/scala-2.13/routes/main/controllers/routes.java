// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hites/Desktop/Project Part 1/Project Part 1/play-java-forms-example/conf/routes
// @DATE:Fri Dec 04 17:45:28 EST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWidgetController WidgetController = new controllers.ReverseWidgetController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWidgetController WidgetController = new controllers.javascript.ReverseWidgetController(RoutesPrefix.byNamePrefix());
  }

}
