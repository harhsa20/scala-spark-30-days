import org.apache.spark.{SparkConf, SparkContext}

object PairRDDOperations {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("Pair RDD Operations")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val data = Seq(
      ("Apple", 10),
      ("Banana", 20),
      ("Apple", 15),
      ("Banana", 5),
      ("Orange", 30)
    )

    val pairRDD = sc.parallelize(data)

    println("Original Pair RDD:")
    pairRDD.collect().foreach(println)

    println("\nReduce By Key:")
    pairRDD
      .reduceByKey(_ + _)
      .collect()
      .foreach(println)

    println("\nGroup By Key:")
    pairRDD
      .groupByKey()
      .collect()
      .foreach(println)

    println("\nSort By Key:")
    pairRDD
      .sortByKey()
      .collect()
      .foreach(println)

    println("\nKeys:")
    pairRDD.keys.collect().foreach(println)

    println("\nValues:")
    pairRDD.values.collect().foreach(println)

    sc.stop()
  }
}
