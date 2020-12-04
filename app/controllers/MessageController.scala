package controllers

import javax.inject._
import models.AccountBalance
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.mvc._
import services.MessageService


@Singleton
class MessageController @Inject()(messageService: MessageService, cc: ControllerComponents) extends AbstractController(cc) {

  val printMessage: Action[JsValue] = Action(parse.json) { implicit request =>
    Ok(messageService.printToTerminal((request.body \ "message").as[String]))
  }

/*
  implicit val locationWrites: Writes[AccountBalance] =
    (JsPath \ "message").write[Double](unlift(AccountBalance.unapply))

  implicit val locationReads: Reads[AccountBalance] =
    (JsPath \ "message").read[Double](AccountBalance.apply _)
*/

  val deposit: Action[JsValue] = Action(parse.json) { implicit request =>
    val depositAmt: Double = (request.body \ "message").as[String].toDouble
    val availBal: Double = request.session.get("totalBalance").getOrElse(0).toString.toDouble
    AccountBalance.accountBal = availBal
    val accountBalance = AccountBalance.deposit(depositAmt)
    Ok(messageService.printToTerminal("Available Balance after Deposit" + AccountBalance.accountBal)).
      withSession("totalBalance" -> AccountBalance.accountBal.toString)
  }

  val withdraw: Action[JsValue] = Action(parse.json) { implicit request =>
    val existBal :Double = request.session.get("totalBalance").getOrElse(0).toString.toDouble
    val withdrawAmt = (request.body \ "message").as[String].toDouble
    if(AccountBalance.withdraw(withdrawAmt)) {
      Redirect(routes.MessageController.showbalance)
                                            .withSession("totalBalance" -> AccountBalance.accountBal.toString)
    }
    else {
      Ok(messageService.printToTerminal(s"Insufficient Amount to Withdraw. Available Bal : ${AccountBalance.accountBal}"))
                    .withSession("totalBalance" -> AccountBalance.accountBal.toString)
    }
  }

  val showbalance: Action[AnyContent] = Action { implicit request =>
    val bal = request.session.get("totalBalance")
    Ok(messageService.printToTerminal("Available Balance "+ bal.getOrElse(0.0)))
  }
}