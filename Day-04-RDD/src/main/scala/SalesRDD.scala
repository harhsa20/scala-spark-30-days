import org.apache.spark.{SparkConf, SparkContext}

object SalesRDD {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("Sales RDD")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val filePath = "src/main/resources/transactions.txt"

    val transactions = sc.textFile(filePath)

    val sales = transactions.map { line =>
      val parts = line.split(",")
      val id = parts(0)
      val product = parts(1)
      val amount = parts(2).toDouble

      (id, product, amount)
    }

    val totalSales = sales
      .map(_._3)
      .reduce(_ + _)

    println(s"Total Sales: $totalSales")

    sc.stop()
  }
}
