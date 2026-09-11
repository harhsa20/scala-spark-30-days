import org.apache.spark.{SparkConf, SparkContext}

object SparkContextExample {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("Spark Context Example")
      .setMaster("local[4]")

    val sc = new SparkContext(conf)

    println("SparkContext created successfully!")
    println(s"Application name: ${sc.appName}")
    println(s"Master: ${sc.master}")

    sc.stop()
  }
}
