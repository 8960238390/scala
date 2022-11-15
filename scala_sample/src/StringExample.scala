

object StringExample {
  
  val num1 = 75
  val num2 = 100.25
  val str1: String = "Hello World "
  val str2: String = "Sharif"
  
  def main(args: Array[String]){
    
    println(str1.length())
    
    println(str1.concat(str2))
    
    printf("(%d---%f---%s)",num1,num2,str1)
    println()
    
    println("(%d---%f---%s)".format(num1, num2, str1))
  }
}