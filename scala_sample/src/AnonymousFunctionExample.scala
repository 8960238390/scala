

object AnonymousFunctionExample {
  
  object Math{
    
    def +(x:Int , y:Int) : Int = x+y
    
    def **(x:Int, y:Int) : Int = x*y
    
  }
  
  def myPrint(x:Int) : Unit = {
    println(x)
  }
  
 
  
  def main(args : Array[String]) : Unit = {
    
    val add = (x:Int , y:Int) => x+y
    
    println(Math.+(15,25))
    println(Math.**(2, 3))
    
    myPrint(5)
    
    println(add(5,4));
    
  }
}