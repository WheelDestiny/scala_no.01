package com.wheelDestiny.scala.chapter16

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}

class Server extends Actor {
  override def receive: Receive = {
    case "start" => println("Server started")
    case ClientMessage(message) =>{
      message match {
        case "Query balance" => {
          sender() ! ServerMessage("Lack of balance")
          println("Server:Lack of balance")
        }
        case "call a real people" =>{
          sender() ! ServerMessage("Please press 0")
          println("Server:call a real people")
        }
        case a:Any => {
          sender() ! ServerMessage(s"Server is done:${a}")
          println(s"Server is done:${a}")
        }
      }
    }

  }
}

object Server{

  def main(args: Array[String]): Unit = {
    val host = args(0)
    val port = args(1).toInt
    val config: Config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = ${host}
         |akka.remote.netty.tcp.port = ${port}
         |""".stripMargin)
    val server: ActorSystem = ActorSystem("server", config)
    val serverAnswer: ActorRef = server.actorOf(Props[Server], "ServerAnswer")
    serverAnswer ! "start"
  }

}

//客户端发送的信息对象
case class ClientMessage(message:String)
//服务端发送的信息对象
case class ServerMessage(message:String)