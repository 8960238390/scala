

object FunctionExample {

  object Math {

    def add(x: Int, y: Int): Int = x + y

    def square(x: Int) = x * x

  } //Math Object

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def sub(x: Int, y: Int): Int = {
    x - y
  }

  def mul(x: Int, y: Int): Int = x * y

  def div(x: Int, y: Int) = x / y

  def main(args: Array[String]): Unit = {

    println(Math.add(45, 15))
    println(Math.square(5))

    println(add(45, 15))
    println(sub(45, 15))
    println(mul(45, 15))
    println(div(45, 15))
  }

}