package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import models.Book
@Singleton
class BooksController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index= Action {
    var books=Set("AAA","BBB")
    Ok(views.html.books.index(books))
  }

  def create = TODO

  def save=TODO

  def edit(id : Int)= TODO

  def update()=TODO

  def show(id : Int)=TODO

  def delete(id : Int)=TODO

}
