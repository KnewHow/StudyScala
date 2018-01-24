
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/how/project/studyScala/workspace/hello-play/conf/routes
// @DATE:Wed Jan 24 15:20:55 CST 2018


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
