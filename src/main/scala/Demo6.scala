import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object Demo6 {
  def main(args: Array[String]): Unit = {
    //1
    //    val n=readInt();
    //    val a=Random
    //    val b=new Array[Int](n)
    //    for(i<-0 to b.length-1){
    //      b(i)=a.nextInt(n);
    //    }
    //    println(b.mkString(" and "))

    //2
    //    val arr =Array(1,2,3,4,5)
    //    for(i<-arr;if(i%2==1 && i<arr.length-1)){
    //      var tmp =arr(i)
    //      arr(i)=arr(i-1)
    //      arr(i-1)=tmp;
    //    }
    //    println(arr.mkString(" and "))
    //    val a = Array(1,-1,-3,0,4,-2,4,87,0,-10,9)
    //
    //    val b=a.filter(_>0)
    //    val c=a.filter(_==0)
    //    val d=a.filter(_<0)
    //    val e=ArrayBuffer
    //
    //    println(b.mkString(" "))

//    val g = Array(1,-1,-3,0,4,-2,4,87,0,-10,9)
//    println(g.distinct.mkString(" "))

    val a=Map("qiang"->15,"jian"->10,"dao"->12)
    val b=a.mapValues(_*0.9)
    for((k,v)<-b) println(k,v)
  }
}
