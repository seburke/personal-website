package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.home())
  }

  def resume = Action {
    Ok(views.html.resume())
  }

  def projects = Action {
    Ok(views.html.projects())
  }

  def projectsThesis = Action {
    Ok(views.html.projects_thesis())
  }



}