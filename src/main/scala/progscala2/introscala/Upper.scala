package progscala2.introscala

/**
 * Created by t_ishikawa on 2015/05/12.
 */
class Upper {

  def upper(strings: String*): Seq[String] = {
    strings.map((s: String) => s.toUpperCase)
  }

  def printAll(ss: String*): Unit = {
    ss.foreach(println)
  }

}

object Upper {

  def main(args: Array[String]): Unit = {
    println("start")
    val upper = new Upper
    var upperName = upper.upper("i am takatsugu ishikawa!", "cat")
    println(upperName)
    upper.printAll("BAZ", "FOO", "BAR")
    val fooBar = Seq("FOO", "BAR")
    upper.printAll(fooBar:_*)
  }
}
