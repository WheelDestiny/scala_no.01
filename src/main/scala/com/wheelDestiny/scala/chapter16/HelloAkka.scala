package com.wheelDestiny.scala.chapter16

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class HelloAkka extends Actor {
  override def receive: Receive = {
    case "what`s your name?" => println("zhao")
    case "how old are you" => println(18)
    case "stop" => {
      context.stop(self)
      context.system.terminate()
    }
  }
}

object HelloAkka {
  def main(args: Array[String]): Unit = {
    val hell: ActorSystem = ActorSystem("Hell")
    val zhao: ActorRef = hell.actorOf(Props[HelloAkka], "zhao")

    zhao ! "what`s your name?"
    zhao ! "how old are you"
    zhao ! "stop"


  }

}
