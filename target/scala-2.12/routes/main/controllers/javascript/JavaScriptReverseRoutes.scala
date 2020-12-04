// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jayasree/Practice/Scala/workspace/andrewrichards1/ddcw-technical-test/conf/routes
// @DATE:Sun Nov 29 20:42:29 GMT 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers.javascript {

  // @LINE:2
  class ReverseMessageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def showbalance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.showbalance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "backend/showbalance"})
        }
      """
    )
  
    // @LINE:5
    def withdraw: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.withdraw",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "backend/withdraw"})
        }
      """
    )
  
    // @LINE:2
    def printMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.printMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "backend/print"})
        }
      """
    )
  
    // @LINE:4
    def deposit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.deposit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "backend/deposit"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
