object SalesProcessor extends App {

  val sales = List(100, 250, 150, 300, 50)

  // map - increase each sale by 10%
  val increasedSales = sales.map(sale => BigDecimal(sale * 1.10).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble)

  // filter - select sales greater than 150
  val highValueSales = sales.filter(sale => sale > 150)

  // flatMap - create multiple values from each sale
  val expandedSales = sales.flatMap(sale => List(sale, sale + 10))

  // reduce - calculate total sales
  val totalSales = sales.reduce((a, b) => a + b)

  println(s"Original sales: $sales")
  println(s"Increased sales: $increasedSales")
  println(s"High value sales: $highValueSales")
  println(s"Expanded sales: $expandedSales")
  println(s"Total sales: $totalSales")
}
