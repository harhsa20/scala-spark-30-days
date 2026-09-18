import org.apache.spark.{SparkConf, SparkContext}

object RDDCollectCount {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD Actions")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val numbers = sc.parallelize(Seq(10, 20, 30, 40, 50))

    println("Collect:")
    println(numbers.collect().mkString(", "))

    println("Count:")
    println(numbers.count())

    println("First:")
    println(numbers.first())

    println("Take 3:")
    println(numbers.take(3).mkString(", "))

    println("Reduce Sum:")
    println(numbers.reduce(_ + _))

    println("Foreach:")
    numbers.foreach(x => println(s"Value: $x"))

    sc.stop()
  }
}
