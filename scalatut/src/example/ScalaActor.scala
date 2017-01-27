package example

object ScalaActor {
  def main(arr: Array[String]) = {
    var arr = Array(1, 2, 3);
    printFun(3, arr);
  }
  def printFun(num: Int, arry: Array[Int]) {
    var ret: List[Int] = List();
    var y = 0;
    for (y: Int <- arry) {
      var x = 0;
      for (x <- 1 to num) {
        ret = y :: ret;
        println(y);
      }
    }

  }
  def f(num: Int, arr: List[Int]): List[Int] = {
    var x = 0;
    var data: List[Int] = List();
    for (x <- arr) {
      var y = 0;
      for (y <- 1 to num) {
        data = y :: data;
      }
    }
    if (!data.isEmpty) {
      data = data.reverse;
    }

    return data;
  }
}