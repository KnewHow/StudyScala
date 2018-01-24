
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

object chatPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html>

  <head>
    <title>Chat Page</title>
  </head>

  <body>
    <h1>Chat Page</h1>

    <div class="chat">

      <div class="ch-records">

      </div>

      <div class="sub-content">
        <form method="POST" action="/send.html">
          <div>
            <label>
              Input box:
            </label>
            <input type="text" name="send" />
          </div>

          <div>
            <input value="Submit" type="submit" />
          </div>

        </form>
      </div>


    </div>

  </body>

</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jan 22 14:53:47 CST 2018
                  SOURCE: /Users/how/project/studyScala/workspace/scala_sprint4/app/views/chatPage.scala.html
                  HASH: 576a7b525369d98c71eeb32e97f066e4e3cc8e0c
                  MATRIX: 814->0
                  LINES: 26->1
                  -- GENERATED --
              */
          