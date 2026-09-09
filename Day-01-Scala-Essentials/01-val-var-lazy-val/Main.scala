object Main extends App {

  // val - cannot be reassigned
  val name = "Harsha"
  println(s"Name: $name")

  // var - can be reassigned
  var age = 22
  println(s"Age: $age")

  age = 23
  println(s"Updated age: $age")

  // lazy val - calculated only when first accessed
  lazy val result = {
    println("Calculating result...")
    10 + 20
  }

  println("Before using lazy val")
  println(s"Result: $result")

  // Immutable List
  val numbers = List(10, 20, 30, 40, 50)

  println(s"Original numbers: $numbers")

  val doubledNumbers = numbers.map(number => number * 2)

  println(s"Doubled numbers: $doubledNumbers")

  println(s"Original numbers after map: $numbers")
}
