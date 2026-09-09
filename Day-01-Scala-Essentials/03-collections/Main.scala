object Main extends App {

  // List - ordered collection, duplicates allowed
  val numbersList = List(10, 20, 20, 30)
  println(s"List: $numbersList")

  // Vector - ordered collection with efficient indexing
  val numbersVector = Vector(10, 20, 30, 40)
  println(s"Vector: $numbersVector")

  // Set - unique elements
  val numbersSet = Set(10, 20, 20, 30)
  println(s"Set: $numbersSet")

  // Map - key-value pairs
  val studentMarks = Map(
    "Harsha" -> 85,
    "Ravi" -> 75,
    "Sita" -> 90
  )
  println(s"Map: $studentMarks")
}
