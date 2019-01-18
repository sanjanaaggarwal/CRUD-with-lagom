package com.knoldus.welcome.api

import play.api.libs.json.{Format, Json}

/**
  *
  * @param userId - The user Id.
  * @param id - The normal Id.
  * @param title - The user title.
  * @param body - The user body.
  */
case class UserData(userId: Int, id: Int, title:String, body: String)

object UserData {
  /**
    * Format for converting user messages to and from JSON.
    *
    * This will be picked up by a Lagom implicit conversion from Play's JSON format to Lagom's message serializer.
    */
  implicit val format: Format[UserData] = Json.format[UserData]
}
