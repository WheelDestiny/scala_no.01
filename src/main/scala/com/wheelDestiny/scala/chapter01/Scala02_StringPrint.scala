package com.wheelDestiny.scala.chapter01

/*
* 打印字符串
*
* */
object Scala02_StringPrint {
  /**
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    var name = "name"
    var age = 1
    var url = "www.google.com"
    //打印字符串
    println("name="+name+" age="+age+" url="+url)
    printf("name=%s,age=%d,url=%s \n",name,age,url,name)
    println(s"name=${name},age=${age},url=${url}")
    //格式化
    println(f"name=${name},age=${age}%.2f,url=${url}")
    //原样输出
    println(raw"name=${name},\n age=${age}%.2f,url=${url}")


  }

}
