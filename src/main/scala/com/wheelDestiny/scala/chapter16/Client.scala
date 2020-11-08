package com.wheelDestiny.scala.chapter16

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}

import scala.io.StdIn

class Client(val host:String,port:Int) extends Actor{
  var serverRef : ActorSelection = _

  override def preStart(): Unit = {
    serverRef = context.actorSelection(s"akka.tcp://server@${host}:${port}/user/ServerAnswer")
  }

  override def receive: Receive = {
    case "start" => println("Client is started")
    case message:String => serverRef ! ClientMessage(message)
    case ServerMessage(message) =>{
      println(s"answer from Server:${message}")
    }
  }
}

object Client {
  def main(args: Array[String]): Unit = {
    val serverHost = "192.168.88.189"
    val serverPort = 8888

    val host = "127.0.0.1"
    val port = 8889

    val config: Config = ConfigFactory.parseString(
      s"""
         |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
         |akka.remote.netty.tcp.hostname = ${host}
         |akka.remote.netty.tcp.port = ${port}
         |""".stripMargin)
    val client: ActorSystem = ActorSystem("client", config)
    val user: ActorRef = client.actorOf(Props[Client](new Client(serverHost, serverPort)), "User")
    user ! "start"

    while (true){
      val str: String = StdIn.readLine()
      user ! str
    }
  }

}
