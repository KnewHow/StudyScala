
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(errors:Map[String,String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>register page</title>
    <link rel="stylesheet" type="text/css" href="/css/login.css">
  </head>

  <body>
    <h1>Login Page</h1>
    <span class="error-info">"""),_display_(/*11.31*/errors/*11.37*/.get("msg")),format.raw/*11.48*/("""</span>
    <form method="POST" action="/user/doLogin.html">
      <div class="login-form">
        <div class="form-box">
          <label class="basic-name">Username</label>
          <input class="basic-input" type="text" name="username" value=""""),_display_(/*16.74*/errors/*16.80*/.get("username")),format.raw/*16.96*/("""" />
          <span>
            """),_display_(/*18.14*/errors/*18.20*/.get("usernameError")),format.raw/*18.41*/("""
          """),format.raw/*19.11*/("""</span>
        </div>
        <div class="form-box">
          <label class="basic-name">Password</label>
          <input type="password" class="basic-input" name="password" value=""""),_display_(/*23.78*/errors/*23.84*/.get("password")),format.raw/*23.100*/("""" />
          <span>
            """),_display_(/*25.14*/errors/*25.20*/.get("passwordError")),format.raw/*25.41*/("""
          """),format.raw/*26.11*/("""</span>
        </div>
        <div class="form-box">
          <input class="basic-input" type="submit"  value="Login" />
        </div>
      </div>
    </form>
  </body>
</html>
"""))
      }
    }
  }

  def render(errors:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(errors)

  def f:((Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (errors) => apply(errors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jan 22 14:53:47 CST 2018
                  SOURCE: /Users/how/project/studyScala/workspace/scala_sprint4/app/views/login.scala.html
                  HASH: 2c4072c95a02e9b8abe6ebcff8fdd98e7412bbc6
                  MATRIX: 742->1|864->28|891->29|1123->234|1138->240|1170->251|1446->500|1461->506|1498->522|1560->557|1575->563|1617->584|1656->595|1867->779|1882->785|1920->801|1982->836|1997->842|2039->863|2078->874
                  LINES: 21->1|26->1|27->2|36->11|36->11|36->11|41->16|41->16|41->16|43->18|43->18|43->18|44->19|48->23|48->23|48->23|50->25|50->25|50->25|51->26
                  -- GENERATED --
              */
          