package com.wheelDestiny.scala.chapter0678

import sun.plugin2.util.ColorUtil.ColorRGB

/**
 * scala会自动导入scala包中的类
 *
 */
object Scala20_ClassInfo1 extends App {
  private val blue: Color.Value = Color.BLUE

}
//枚举
object Color extends Enumeration {
  var RED = Value(1,"red")
  var YELLOW = Value(2,"yellow")
  var BLUE = Value(3,"blue")
}



