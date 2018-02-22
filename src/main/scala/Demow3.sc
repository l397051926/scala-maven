import scala.collection.mutable.ArrayBuffer

val b = ArrayBuffer[Int]()
b+=1;
b+=(1,2,3,4,5)
b++=Array(2,3,4)
b.insert(1,2)
b+=1
b.remove(2)
b+=1
b.remove(2,3)
b+=1
b.trimEnd(3)
val arr=b.toArray

for(i<- arr) println(i)

val miDim =Array.ofDim[Double](3,4)
