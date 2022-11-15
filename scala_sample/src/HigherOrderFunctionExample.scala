

object HigherOrderFunctionExample {

  def math1(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)

  def math2(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z)

  def main(args: Array[String]) {

    val result1 = math1(4, 5, (x, y) => x + y)

    val result2 = math1(4, 5, (x, y) => x * y)

    val result4 = math1(4, 5, (x, y) => x min y)

    println(result1)
    println(result2)
    println(result4)

    val result3 = math2(4, 5, 6, (x, y) => x max y)

    val result5 = math1(5, 9, _ + _)
    val result6 = math1(5, 9, _ min _)

    println(result3)
    println(result5)
    println(result6)
  }
}