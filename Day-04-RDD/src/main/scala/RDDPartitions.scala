import org.apache.spark.{SparkConf, SparkContext}

object RDDPartitions {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD Partitions")
      .setMaster("local[4]")

    val sc = new SparkContext(conf)

    println(s"Default parallelism: ${sc.defaultParallelism}")

    val customers = sc.parallelize(
      List(
        "C001,Harsha",
        "C002,Ravi",
        "C003,Sita",
        "C004,Anil",
        "C005,Priya",
        "C006,Kiran",
        "C007,Rahul",
        "C008,Divya"
      ),
      4
    )

    println(s"Number of partitions: ${customers.getNumPartitions}")

    println("Customer data:")
    customers.collect().foreach(println)

    sc.stop()
  }
}
