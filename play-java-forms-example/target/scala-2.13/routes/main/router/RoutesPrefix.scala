// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ankuraggarwal/Desktop/safest version/Project Part 1/play-java-forms-example/conf/routes
// @DATE:Sat Dec 05 17:06:04 EST 2020


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
