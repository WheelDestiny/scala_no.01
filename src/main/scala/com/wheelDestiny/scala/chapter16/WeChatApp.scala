package com.wheelDestiny.scala.chapter16

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

//import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class BoyActor extends Actor{
  override def receive: Receive = {
    case "start" => println("boy:start to shake")
    case "who are you" => {
      println("boy:im a good boy")
      Thread.sleep(1000)
      sender() ! "I`m a handsome boy"
    }
    case "I don`t care" => {
      println("boy: I`m rich")
      Thread.sleep(1000)
      sender()!"I`m rich"
    }
  }
}
class GirlActor(val boy : ActorRef) extends Actor{
  override def receive: Receive = {
    case "start" => {
      println("girl:be shaked")
      boy ! "who are you"
    }
    case "I`m a handsome boy" =>{
      println("girl:I don`t care")
      boy ! "I don`t care"
    }
    case "I`m rich" =>{
      println("girl:who are you")
      boy ! "who are you"
    }
  }
}


object WeChatApp extends App {
  private val weChatAppSystem: ActorSystem = ActorSystem("WeChatAppSystem")
  private val boy: ActorRef = weChatAppSystem.actorOf(Props[BoyActor], "boy")
  private val girl: ActorRef = weChatAppSystem.actorOf(Props[GirlActor](new GirlActor(boy)), "girl")
  boy ! "start"
  girl ! "start"


}
