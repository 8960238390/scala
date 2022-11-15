

object CurryingExample {
  
  def add(x: Int, y:Int) = x+y
  
  // Approach 1 : for currying
  def add2(x:Int) = (y: Int) => x+y
  
  // Approach 2 : for currying
  def add3(x: Int)(y: Int) = x+y
  
  val sum = () => "sum"
  
  def main(args: Array[String]){
    println(add(20,30))
    
    println(add2(20)(30))
    
    //partially implemention
    val sum1 = add2(30)
    println(sum1(60))
    
    println(add3(40)(20))
    
    //partially implemention
    val sum2 = add3(30)_
    
    println(sum2(60))
    
    
  }
}