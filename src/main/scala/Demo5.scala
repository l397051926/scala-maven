import scala.collection.mutable.ArrayBuffer

object Demo5 {
  def main(args:Array[String]):Unit={
    println("demo5 start")

    val nums=new Array[Int](10);
    val a =new  Array[String](10);
    val s =Array("hello","world");

    println(s(0))

    val b=ArrayBuffer[Int]();
    b+=1;
    println(b)
  }
}
