package controllers

import play.api._
import javax.inject._
import play.api.mvc._
import services._
import models._

class PersonController @Inject()(
  cc:ControllerComponents,
  personService:PersonService
) extends AbstractController(cc){
  // val personService = new PersonService

  def personList = Action{ implicit request:Request[AnyContent] =>
    val personList = personService.getPersonList()
    Ok(views.html.personList(personList))
  }
}
