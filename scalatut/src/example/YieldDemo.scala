package example

object YieldDemo {
  def main(args: Array[String]): Unit = {
    var x = List(9, 7, 23, 5, 1, 5, 8);
    var yieldVal = for { p <- x if p != 2; if p < 9 }
      yield p;

    for (a <- yieldVal) {
      println(a);
    }
  }

}