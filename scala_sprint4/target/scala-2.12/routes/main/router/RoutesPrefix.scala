
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/conf/routes
// @DATE:Sun Jan 21 18:20:25 CST 2018


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
