
package views.html.books

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : Set[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),_display_(/*2.2*/layout("All Books")/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""

    """),format.raw/*4.5*/("""<h3>List of books available</h3>
    <ul>
        """),_display_(/*6.10*/for(book <- books) yield /*6.28*/{_display_(Seq[Any](format.raw/*6.29*/("""
            """),format.raw/*7.13*/("""<li>"""),_display_(/*7.18*/book),format.raw/*7.22*/("""</li>
        """)))}),format.raw/*8.10*/("""
    """),format.raw/*9.5*/("""</ul>


""")))}))
      }
    }
  }

  def render(books:Set[String]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[String]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-11T18:38:29.648
                  SOURCE: C:/Users/krevu/Downloads/ScalaBookApp/app/views/books/index.scala.html
                  HASH: e5451193dab9dcf7ec7a669c1c406722d89129cd
                  MATRIX: 740->1|856->22|884->25|911->44|949->45|983->53|1062->106|1095->124|1133->125|1174->139|1205->144|1229->148|1275->164|1307->170
                  LINES: 21->1|26->1|27->2|27->2|27->2|29->4|31->6|31->6|31->6|32->7|32->7|32->7|33->8|34->9
                  -- GENERATED --
              */
          