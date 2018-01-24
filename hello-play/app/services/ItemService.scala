package services

import models._

class ItemService{

  def findById(id:String):Option[Item]={
    Option(Item(id,"knewHow"))
  }
}
