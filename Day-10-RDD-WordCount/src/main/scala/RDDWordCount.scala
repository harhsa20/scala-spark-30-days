import org.apache.spark.{SparkConf, SparkContext}

object RDDWordCount {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD Word Count")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val inputPath = "src/main/resources/sample.txt"

    val lines = sc.textFile(inputPath)

    val words = lines.flatMap(_.split("\\s+"))

    val wordPairs = words.map(word => (word.toLowerCase, 1))

    val wordCounts = wordPairs.reduceByKey(_ + _)

    println("Word Counts:")

    wordCounts
      .sortByKey()
      .collect()
      .foreach {
        case (word, count) =>
          println(s"$word -> $count")
      }

    sc.stop()
  }
}
