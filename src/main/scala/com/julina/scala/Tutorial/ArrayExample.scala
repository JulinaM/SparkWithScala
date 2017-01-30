package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 1/25/17.
  */
object ArrayExample {

  def main(args: Array[String]): Unit = {
    val newArray: Array[String] = new Array[String](3)
    newArray(0) = "apple"
    newArray(1) = "ball"
    newArray(2) = "cat"
    newArray.apply(1)
    newArray.foreach((arg: String) => println("This is "+ arg))
    println()
    newArray.foreach(println)
    println()
    println("Demonstrating for each loop")
    for (elem <- newArray) {
      println(elem)
    }
    println()
    println("Demonstrating for i loop")
    for (elem <- 0 to 2) {
      println(newArray(elem))
    }
    println()
    for (elem <- 0.to(2)){
      println(newArray(elem))
    }
    println()
    println( (1).+(2) : Int)
  }

}
