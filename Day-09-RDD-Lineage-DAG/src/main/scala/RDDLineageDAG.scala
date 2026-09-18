import org.apache.spark.{SparkConf, SparkContext}

object RDDLineageDAG {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
      .setAppName("RDD Lineage and DAG")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val numbers = sc.parallelize(1 to 10)

    val doubled = numbers.map(x => x * 2)

    val filtered = doubled.filter(x => x > 10)

    println("RDD Lineage:")
    println(filtered.toDebugString)

    println("\nFinal Result:")
    println(filtered.collect().mkString(", "))

    sc.stop()
  }
}
