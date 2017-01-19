package com.julina.scala.Tutorial

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by jmaharjan on 1/10/17.
  */
object Jan10 {
  val NUM_SAMPLES  = 10
  def main(args: Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("array").setMaster("local")
    val sparkContext = new SparkContext(conf)
    pi(sparkContext)
  }

  def pi(sc: SparkContext): Unit ={
    val count = sc.parallelize(1 to NUM_SAMPLES).map{i =>
      val x = Math.random()
      val y = Math.random()
      if (x*x + y*y < 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / NUM_SAMPLES)
  }
}
