package example

object PrintDemo {
  def printArgs(args:Array[String]) :Unit={
    for(a<-args){
      println(a);
    }
  }
  def main(args:Array[String]):Unit ={
    printArgs(args);
  }
  def functionlStyle(arr:Array[String]) :Unit={
    arr.foreach(println);
  }
}