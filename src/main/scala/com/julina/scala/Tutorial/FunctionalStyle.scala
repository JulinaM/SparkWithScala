package com.julina.scala.Tutorial

import scala.io.Source

/**
  * Created by jmaharjan on 1/26/17.
  */
object FunctionalStyle {

  def main(args: Array[String]): Unit = {
   var a;
    args.update(0) = "/home/jmaharjan/workspace/SparkWithScala/src/main/scala/com/julina/scala/Tutorial/FunctionalStyle.scala"
    if(args.length >0){
      for(line <- Source.fromFile(args(0)).getLines()){
        println(line.length +" "+ line)
      }
    }
    else
      Console.err.println("Please input filename")
  }


}
