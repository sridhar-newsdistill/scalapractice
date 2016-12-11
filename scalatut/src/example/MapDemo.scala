package example

object MapDemo {
  def main(arg: Array[String]) {

    var x: Int = 100;
    for (a <- 1 to 100) {
      println(a)
      printUsingWhileLoop();
    }

  }
  def printUsingWhileLoop() = {
    var x: Int = 1;
    while (x < 100) {
      x = x + 1;
      println(x);
    }
  }
  def max(a: Int, b: Int): Int = {
    if (a > b) {
      a
    } else {
      b
    }
  }
  //Iterating through list
  def iteratingUsingList(){
   var x=List(1,3,4,5);
   for( p<-x){
     println(p)
   }
  }
}