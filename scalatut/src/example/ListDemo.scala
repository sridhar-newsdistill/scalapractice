package example

object ListDemo {
  def main(arr: Array[String]): Unit = {
    val oneTwoThree = List(1, 2, 3);
    val threeFour = List(3, 4);
    val oneTwoThreeFour=oneTwoThree:::threeFour;
    val newone = 4::oneTwoThreeFour;
    //val newval = 1::2::3:Nil;
    List("Sridhar","newsDistill","hyderabad")
    println(oneTwoThreeFour)
  }
}