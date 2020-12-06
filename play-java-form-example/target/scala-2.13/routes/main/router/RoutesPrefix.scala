// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hites/Desktop/Project Part 1/Project Part 1/play-java-forms-example/conf/routes
// @DATE:Fri Dec 04 17:45:28 EST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
