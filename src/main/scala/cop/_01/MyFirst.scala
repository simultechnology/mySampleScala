package cop._01

object MyFirst {
  def main(args: Array[String]): Unit = {
    var capital: Map[String, String] = Map("US" -> "Washington", "France" -> "Paris")
    println(capital)
    capital += ("Japan" -> "Tokyo")
    println(capital)
    println(capital("France"))
  }
}
