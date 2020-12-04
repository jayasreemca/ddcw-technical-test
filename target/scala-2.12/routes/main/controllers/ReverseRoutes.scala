// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jayasree/Practice/Scala/workspace/andrewrichards1/ddcw-technical-test/conf/routes
// @DATE:Sun Nov 29 20:42:29 GMT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:2
  class ReverseMessageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def showbalance(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "backend/showbalance")
    }
  
    // @LINE:5
    def withdraw(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "backend/withdraw")
    }
  
    // @LINE:2
    def printMessage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "backend/print")
    }
  
    // @LINE:4
    def deposit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "backend/deposit")
    }
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
