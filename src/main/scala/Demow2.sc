val str ="hello"
var sum =0;
for(x<- 0 until str.length){
  sum =sum+str(x)
}
println(sum)

var sum1 =0;
for(i <-"hello") sum1+=i;
println(sum1)

for(i <- 1 to 3 ;from =4-i ;j <- from to 3) print((10*i+j)+" ");


for(i <- 1 to 10)yield i%3

for(c<- "hello";i<- 0 to 1)yield(c+i).toChar

for(i<- -10 to -1)yield(i*(-1))

def produce(str:String,right:String="[",left:String="]")={right+str+left}

produce("hello")

