package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 1/12/17.
  */
object ConstructorExample {

  class Object(obj1: Int, obj2: Int) {

    var a: Int = obj1
    var b: Int = obj2

    def transform(x: Int, y: Int): Unit = {
      a = a + x
      b = b + y
    }

    def printMessage(func: () => Unit): Unit = {
      func()
      print("New values are : ")
      println(a + " and " + b)
    }

    def operate(function: (Int, Int) => Unit): Unit = {
      println("product in the method: ",function(a, b))
      println("after the call")

    }
  }


  def main(args: Array[String]) {
    val newObject = new Object(5, 4)
    newObject.transform(1, 1)
    newObject.printMessage(() => println("Trying to print out sum"))
    newObject.operate((a: Int, b: Int) => {
      println("Why not!! ")
      println("Product: ", a*b)
//      return a*b
    })
  }

}
