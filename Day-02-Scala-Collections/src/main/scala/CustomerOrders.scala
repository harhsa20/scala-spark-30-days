object CustomerOrders extends App {

  val customers = List(
    (101, "Harsha"),
    (102, "Ravi"),
    (103, "Sita")
  )

  val orders = List(
    (101, "Laptop", 50000),
    (102, "Phone", 30000),
    (101, "Mouse", 1000),
    (103, "Keyboard", 2000)
  )

  val customerOrders = for {
    customer <- customers
    order <- orders
    if customer._1 == order._1
  } yield (customer._2, order._2, order._3)

  println("Customer Orders:")

  customerOrders.foreach {
    case (customer, product, price) =>
      println(s"$customer -> $product -> Rs.$price")
  }
}
