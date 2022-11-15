

object ClosuresExample {
  
  var number =10;
  
  val add = (x: Int) => {
    number = x+number
  }
  
  def main(args: Array[String]){
    println(add(20))
    println(number)
  }
}