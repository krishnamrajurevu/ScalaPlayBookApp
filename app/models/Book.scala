package models

import io.ebean.Model

class Book(id : Int,title : String,price : Int,author : String) extends Model{

  def this(){
    this(0,null,0,null)
  }

}
