// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ankuraggarwal/Downloads/Git2/YouTubeAnalyzer/play-java-forms-example/conf/routes
// @DATE:Thu Dec 10 20:13:35 EST 2020


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
