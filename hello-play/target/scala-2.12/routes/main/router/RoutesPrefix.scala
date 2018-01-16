
// @GENERATOR:play-routes-compiler
// @SOURCE:/project/studyScala/workspace/scalaWorkspace/hello-play/conf/routes
// @DATE:Thu Jan 11 15:16:33 CST 2018


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
