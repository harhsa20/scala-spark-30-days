import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.storage.StorageLevel

object RDDPersistence {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD Persistence")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val numbers = sc.parallelize(1 to 10)

    val squaredNumbers = numbers.map(x => x * x)

    squaredNumbers.cache()

    println("First Action - Count:")
    println(squaredNumbers.count())

    println("\nSecond Action - Collect:")
    println(squaredNumbers.collect().mkString(", "))

    println("\nStorage Level:")
    println(squaredNumbers.getStorageLevel)

    squaredNumbers.unpersist()

    println("\nRDD Unpersisted")

    sc.stop()
  }
}
