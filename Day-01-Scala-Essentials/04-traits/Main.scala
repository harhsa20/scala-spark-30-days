trait Logger {
  def log(message: String): Unit
}

class ConsoleLogger extends Logger {
  def log(message: String): Unit = {
    println(s"Console: $message")
  }
}

class FileLogger extends Logger {
  def log(message: String): Unit = {
    println(s"File: $message")
  }
}

object Main extends App {

  val consoleLogger = new ConsoleLogger()
  consoleLogger.log("Application started")

  val fileLogger = new FileLogger()
  fileLogger.log("Data processing completed")
}
