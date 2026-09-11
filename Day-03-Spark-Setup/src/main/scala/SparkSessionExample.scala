import org.apache.spark.sql.SparkSession

object SparkSessionExample {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("Spark Session Example")
      .master("local[*]")
      .getOrCreate()

    println("SparkSession created successfully!")
    println(s"Spark version: ${spark.version}")

    spark.stop()
  }
}
