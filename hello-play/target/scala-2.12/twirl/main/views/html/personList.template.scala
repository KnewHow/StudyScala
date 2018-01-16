
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

object personList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Person],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(persons:Seq[Person]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<table>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>age</th>
  </tr>

  """),_display_(/*9.4*/for(p <- persons) yield /*9.21*/{_display_(Seq[Any](format.raw/*9.22*/("""
    """),format.raw/*10.5*/("""<tr>
      <td>"""),_display_(/*11.12*/p/*11.13*/.id),format.raw/*11.16*/("""</td>
      <td>"""),_display_(/*12.12*/p/*12.13*/.name),format.raw/*12.18*/("""</td>
      <td>"""),_display_(/*13.12*/p/*13.13*/.age),format.raw/*13.17*/("""</td>
    </tr>
   """)))}),format.raw/*15.5*/("""

"""),format.raw/*17.1*/("""</table>
"""))
      }
    }
  }

  def render(persons:Seq[Person]): play.twirl.api.HtmlFormat.Appendable = apply(persons)

  def f:((Seq[Person]) => play.twirl.api.HtmlFormat.Appendable) = (persons) => apply(persons)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jan 11 15:03:42 CST 2018
                  SOURCE: /project/studyScala/workspace/scalaWorkspace/hello-play/app/views/personList.scala.html
                  HASH: 0cc761366f355e514d800c4237e9f61fbe9349e7
                  MATRIX: 739->1|855->22|882->23|985->101|1017->118|1055->119|1087->124|1130->140|1140->141|1164->144|1208->161|1218->162|1244->167|1288->184|1298->185|1323->189|1373->209|1402->211
                  LINES: 21->1|26->1|27->2|34->9|34->9|34->9|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|40->15|42->17
                  -- GENERATED --
              */
          