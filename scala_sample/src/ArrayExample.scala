
import Array._
object ArrayExample {

  val myArray1: Array[Int] = new Array[Int](4)

  val myArray2 = new Array[String](5)

  val myArray3 = Array(1, 5, 8, 6, 9, 2)

  def main(args: Array[String]) {

    myArray1(0) = 56
    myArray1(1) = 20
    myArray1(2) = 12
    myArray1(3) = 98

    for (i <- 0 to myArray1.length) {
      println(myArray2(i))
    }

    val concatArray = concat(myArray1, myArray3)
    
    for(i <- 0 until concatArray.length){
      println(concatArray(i))
    }
    
  }
}