import breeze.linalg.reverse

object Demo3 {
  def main(args : Array[String]):Unit={
    def sum(args:Int*):Int={
      var result=0
      for(i<- args) result+=i
      result
    }

    val r=sum(1,2,3,4,5,6,7,8,9)
    println(r )
  }
}
