object DailySalesSummary extends App {

  val sales = List(
    ("Laptop", 50000),
    ("Phone", 30000),
    ("Mouse", 1000),
    ("Keyboard", 2000),
    ("Phone", 30000)
  )

  val totalSales = sales.map(_._2).reduce(_ + _)

  val highValueSales = sales.filter(_._2 >= 30000)

  val productNames = sales.map(_._1).distinct

  println("Daily Sales Summary")
  println("-------------------")
  println(s"Total number of sales: ${sales.size}")
  println(s"Total sales amount: Rs.$totalSales")
  println(s"High-value sales: $highValueSales")
  println(s"Products sold: $productNames")
}
