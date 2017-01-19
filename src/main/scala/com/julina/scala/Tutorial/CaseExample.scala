package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 1/19/17.
  */
object CaseExample {

}
abstract  class Notification

case class Email(sourceEmail: String, title: String, body: String) extends  Notification{
}

case class SMS (sourceNumber: String, sourceMessage: String) extends Notification{

}

case class VoiceRecording(contactName: String, link: String) extends Notification {

}

object Demo{
  def main(args: Array[String]): Unit = {
    val emailFromJulina = Email("julinamaharjan@gmail.com", "Regarding Checkup", "When will doctor arrive")
    println(emailFromJulina.body)
    println(emailFromJulina.title)
    println(emailFromJulina.sourceEmail)
    println(emailFromJulina)
    val editedEmail = emailFromJulina.copy(title = "Cancel Appointment", body = "I've recovered my headache")
    println(editedEmail)

  }

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        "You got an email from " + email + " with title: " + title
      case SMS(number, message) =>
        "You got an SMS from " + number + "! Message: " + message
      case VoiceRecording(name, link) =>
        "you received a Voice Recording from " + name + "! Click the link to hear it: " + link
    }
  }
}
