// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krevu/Projects/ScalaPlayBookApp/conf/routes
// @DATE:Mon Jul 15 16:50:37 IST 2019


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
