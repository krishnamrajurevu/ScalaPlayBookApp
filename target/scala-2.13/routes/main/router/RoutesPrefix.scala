// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krevu/Downloads/ScalaBookApp/conf/routes
// @DATE:Thu Jul 11 17:02:46 IST 2019


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
