object CustomerRecords extends App {

  val customers = Vector(
    (101, "Harsha"),
    (102, "Ravi"),
    (103, "Sita"),
    (104, "Anil")
  )

  println(s"All customers: $customers")

  println(s"First customer: ${customers(0)}")
  println(s"Second customer: ${customers(1)}")

  println(s"Customer at index 2: ${customers(2)}")
}
