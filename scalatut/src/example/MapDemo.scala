package example

object MapDemo {
  def main(arg: Array[String]) {

    var x: Int = 100;
    for (a <- 1 to 100) {
      println(a)
    }

  }
  def max(a: Int, b: Int): Int = {
    if (a > b) {
      a
    } else {
      b
    }
  }
}