object ProductData extends App {

  val productPrices = Map(
    "Laptop" -> 50000,
    "Phone" -> 30000,
    "Mouse" -> 1000,
    "Keyboard" -> 2000
  )

  val productQuantities = Map(
    "Laptop" -> 2,
    "Phone" -> 5,
    "Mouse" -> 10,
    "Keyboard" -> 4
  )

  println(s"Product prices: $productPrices")
  println(s"Product quantities: $productQuantities")

  println(s"Laptop price: ${productPrices("Laptop")}")
  println(s"Phone quantity: ${productQuantities("Phone")}")
}
