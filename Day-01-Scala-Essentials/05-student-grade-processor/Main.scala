object Main extends App {

  val students = List(
    ("Harsha", 85),
    ("Ravi", 72),
    ("Sita", 91),
    ("Anil", 45),
    ("Priya", 68)
  )

  def getGrade(mark: Int): String = {
    if (mark >= 90) "A"
    else if (mark >= 75) "B"
    else if (mark >= 60) "C"
    else if (mark >= 50) "D"
    else "F"
  }

  val studentGrades = students.map {
    case (name, mark) => (name, mark, getGrade(mark))
  }

  println("Student Grades:")
  studentGrades.foreach {
    case (name, mark, grade) =>
      println(s"$name -> Mark: $mark, Grade: $grade")
  }

  val passedStudents = students.filter {
    case (_, mark) => mark >= 50
  }

  println(s"\nNumber of students passed: ${passedStudents.size}")

  val averageMarks = students.map(_._2).sum.toDouble / students.size

  println(s"Average marks: $averageMarks")
}
