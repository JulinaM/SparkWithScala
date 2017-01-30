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

    def operate(name: String, function: (Int, Int) => Int): Unit = {
      print(name +":: Result of anonymous function: ")
      println(function(a, b))
    }
  }


  def main(args: Array[String]) {
    val newObject = new Object(5, 4)
    newObject.transform(1, 1)
    newObject.printMessage(() => println("Trying to print out sum.... "))
    newObject.operate("Product", (a: Int, b: Int) => a*b)
    newObject.operate("Addition", (a: Int, b: Int) => a-b)
    newObject.operate("Subtraction", (a: Int, b: Int) => a+b)
    newObject.operate("Division", (a: Int, b: Int) => a/b)
  }

}

