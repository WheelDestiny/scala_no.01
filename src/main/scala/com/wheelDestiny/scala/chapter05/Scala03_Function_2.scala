package com.wheelDestiny.scala.chapter05

object Scala03_Function_2 {
  def main(args: Array[String]): Unit = {
    //scala可以采用自动推断功能来简化函数的声明
    /**
     * 1，如果函数声明时，明确无返回值Unit，那么及时函数体中有return也不起作用
     */
    def test(): Unit ={
      return "zhao"
    }
//    println(test())

    //如果将函数体的最后一行代码返回，那么return关键字可以省略
    //如果可以根据函数的最后一行来推断返回值类型，那么声明函数时的返回值类型可以省略
    def test1()={
      "qian"
    }
//    println(test1())

    //如果整个函数体中只有一行代码，那么{}可以省略
    def test2() = "sun"
//    println(test2())

    //如果函数声明中没有参数列表，()可以省略
    //声明函数必须要使用def关键字也可以从该句看出，如果不加那么与变量赋值的写法就没有区别，难以区分
    def test3 = "li"
    //如果函数声明时()省略了，那么调用函数时不要加()
//    println(test3)

    //当明确函数不需要返回值的时候=可以省略,这时方法不会把最后一行的代码作为返回值
    def test4{
      println("zhou")
    }
//    println(test4)

    //匿名函数
    ()->{
      println("wu")
    }

    //这种匿名声明方式不会直接调用，需要被调用
    val f: () => Unit = () => {
      println("zheng")
    }
    f()

  }

}