import org.apache.spark.sql.SparkSession

object TextFileReader {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("Text File Reader")
      .master("local[2]")
      .getOrCreate()

    val filePath = "src/main/resources/sample.txt"

    val lines = spark.read.textFile(filePath)

    println("File Contents:")
    lines.collect().foreach(println)

    spark.stop()
  }
}
