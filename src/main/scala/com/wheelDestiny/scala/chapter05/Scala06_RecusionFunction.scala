package com.wheelDestiny.scala.chapter05

object Scala06_RecusionFunction {
  def main(args: Array[String]): Unit = {
    //递归
    /**
     * 函数的逻辑代码中调用自身
     * 函数在调用自身时，传递的参数应该有规律
     * 函数应该有跳出递归的逻辑，否则会出现死循环(StackOverflowError)
     * 递归函数无法推断出函数的返回值类型，所以必须要声明
     */

    /**
     * 阶乘 => n的阶乘 = n*((n-1)的阶乘)
     */
    def !!(i:Int): Int = {
      if(i==1){
        1
      }else{
        i * !!(i-1)
      }
    }
    print(!!(5))

    def f1 = "aa"
    print(f1)

  }
}