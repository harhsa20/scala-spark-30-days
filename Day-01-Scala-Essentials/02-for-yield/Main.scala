object Main extends App {

  val students = List("Harsha", "Ravi", "Sita")
  val marks = List(80, 75, 90)

  val studentMarks = for {
    student <- students
    mark <- marks
  } yield (student, mark)

  println(studentMarks)
}
