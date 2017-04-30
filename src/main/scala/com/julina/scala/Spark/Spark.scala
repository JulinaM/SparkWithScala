package com.julina.scala.Spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by julina on 4/29/17.
  */
object Spark {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("My App")
    val sc = new SparkContext(conf)
    // Load our input data.
    val input = sc.textFile("input")
    // Split it up into words.
    val words = input.flatMap(line => line.split(" "))
    // Transform into pairs and count.
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    // Save the word count back out to a text file, causing evaluation.
    counts.saveAsTextFile("output")


  }





}
