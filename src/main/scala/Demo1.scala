class Demo1 {
  var name = ""
  var age = 0

  def this(name: String, age: Int) = {
    this();
    this.name = name
    this.age = age
  }
  def show()={
    println("name:"+name+"age"+age)
  }
}
object aaa{
  def main(args: Array[String]): Unit = {
    val demo1 = new Demo1("a",12)
    demo1.show()
  }
}