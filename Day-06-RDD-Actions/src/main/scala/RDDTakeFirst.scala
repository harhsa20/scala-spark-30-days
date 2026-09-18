import org.apache.spark.{SparkConf, SparkContext}

object RDDTakeFirst {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD First and Take")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val numbers = sc.parallelize(Seq(10, 20, 30, 40, 50))

    val firstNumber = numbers.first()
    println(s"First number: $firstNumber")

    val firstThree = numbers.take(3)
    println(s"First three numbers: ${firstThree.mkString(", ")}")

    sc.stop()
  }
}
