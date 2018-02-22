object Demo2  {
   def main(args:Array[String]) : Unit={

    println("9*9")

     for(x<-1 to 9 ;y<- 1 to x ;val z =if (x==y) "\r\n" else "\t" ){
       print(x+" * "+y+" = "+x*y+z)
     }

     val list =List(1,2,3,4,5,6,7,8)
     println(list(list.size-1))

     println(list(list.size-2))

     val n =3;
     println(list(n-1))


  }

}
