package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 1/5/17.
  */
object HelloWorld {

  def main(args: Array[String]) : Unit ={
      println("Hello World")
    val name = "Julina"
    val nameHasUpperCase = name.exists(_.isUpper)
    println(nameHasUpperCase)
  }
}
