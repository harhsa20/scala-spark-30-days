import org.apache.spark.{SparkConf, SparkContext}

object RDDTransformations {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD Transformations")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val numbers = sc.parallelize(List(1, 2, 3, 4, 5))

    val doubled = numbers.map(_ * 2)

    val evenNumbers = numbers.filter(_ % 2 == 0)

    val expanded = numbers.flatMap(n => List(n, n * 10))

    println("Original:")
    numbers.collect().foreach(println)

    println("Doubled using map:")
    doubled.collect().foreach(println)

    println("Even numbers using filter:")
    evenNumbers.collect().foreach(println)

    println("Expanded using flatMap:")
    expanded.collect().foreach(println)

    sc.stop()
  }
}
