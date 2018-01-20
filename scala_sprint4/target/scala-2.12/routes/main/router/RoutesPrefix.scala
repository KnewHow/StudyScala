
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ygh/project/studyScala/workspace/scalaWorkspace/scala_sprint4/conf/routes
// @DATE:Sat Jan 20 11:15:01 CST 2018


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
