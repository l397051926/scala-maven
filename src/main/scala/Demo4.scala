object Demo4 {

  def main(args:Array[String]):Unit = {

    def f1(x: Int): Int = {
      if (x > 0) return 1;
      if (x < 0) return -1;
      else return 0;
    }

    var x = f1(10)
    println(x)

    val a1=for(i<-0 to 10)yield(10-i)

    print(a1)
    println()

    for(i<-0 to 10 reverse)
      print(i)
  }
}
