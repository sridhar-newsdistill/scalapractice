package example

object ListDemo {
  def main(arr: Array[String]): Unit = {
    val oneTwoThree = List(1, 2, 3);
    val threeFour = List(3, 4);
    val oneTwoThreeFour=oneTwoThree:::threeFour;
    val newone = 4::oneTwoThreeFour;
    println(oneTwoThreeFour)
  }
}