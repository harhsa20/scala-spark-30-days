import org.apache.spark.{SparkConf, SparkContext}

object RDDFromCollection {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD From Collection")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val numbers = List(10, 20, 30, 40, 50)

    val rdd = sc.parallelize(numbers)

    println("RDD Contents:")
    rdd.collect().foreach(println)

    println(s"Number of partitions: ${rdd.getNumPartitions}")

    sc.stop()
  }
}
