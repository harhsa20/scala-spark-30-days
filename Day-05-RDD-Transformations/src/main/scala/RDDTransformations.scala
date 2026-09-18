import org.apache.spark.{SparkConf, SparkContext}

object RDDTransformations {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD Transformations")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val numbers = sc.parallelize(List(1, 2, 3, 4, 5))

    val doubled = numbers.map(x => x * 2)

    val greaterThanTwo = numbers.filter(x => x > 2)

    val expanded = numbers.flatMap(x => List(x, x * 10))

    println("Original: " + numbers.collect().toList)
    println("Map - Doubled: " + doubled.collect().toList)
    println("Filter - Greater than 2: " + greaterThanTwo.collect().toList)
    println("FlatMap - Expanded: " + expanded.collect().toList)

    sc.stop()
  }
}
