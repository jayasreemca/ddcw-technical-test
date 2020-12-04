// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jayasree/Practice/Scala/workspace/andrewrichards1/ddcw-technical-test/conf/routes
// @DATE:Sun Nov 29 20:42:29 GMT 2020


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
