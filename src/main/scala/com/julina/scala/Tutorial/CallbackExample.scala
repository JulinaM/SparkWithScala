package com.julina.scala.Tutorial

/**
  * Created by jmaharjan on 1/12/17.
  */

object CallbackExample {
  def main(args: Array[String]): Unit = {
    callBackFunc(forEverySec)
  }

  def forEverySec(){
    println("Time flies so fast !!")
  }

  def callBackFunc(callback : () => Unit){
    while (true){
      callback()
      Thread.sleep(1000)
    }
  }
}

object Anonymous {
  def main(args: Array[String]): Unit = {
    callBackFunc(() => println("Time flies so fast these days"))
  }

  def callBackFunc(callback : () => Unit){
    while (true){
      callback()
      Thread sleep 1000
    }
  }

  object Timer {
    def main(args: Array[String]) {
      onePerSecond(timeFlies)
    }
    def timeFlies(){
      println("time flies like an arrow...")
    }
    def onePerSecond(callback: () => Unit) {
      while (true){
        callback()
        Thread.sleep(1000)
      }
    }
  }

  object TimerAnonymous {
    def onePerSecond(callback:()=> Unit): Unit ={
      while (true){
        callback()
        Thread.sleep(1000)
      }
    }

    def main(args: Array[String]) {
      onePerSecond(()=> println("Time flies so fast!!!"))
    }
  }
}




