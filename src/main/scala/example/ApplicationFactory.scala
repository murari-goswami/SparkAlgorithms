package example

object ApplicationFactory {

  def main(args: Array[String]): Unit = {
    println(greeting)
  }

  lazy val greeting: String = {
    "Alles gut !!"
  }
}
