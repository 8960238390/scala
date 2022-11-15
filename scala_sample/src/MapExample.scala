

object MapExample {
  
  val family1: Map[Int,String] = Map(101 -> "sharif", 102 -> "Sahil", 103 -> "Ibrahim")
  val family2: Map[Int, String] = Map(104 -> "Palik", 105 -> "Shahida")
  
  def main(args: Array[String]){
    
    println(family1)
    println(family1(102))
    
    println(family1.keys)
    println(family1.values)
    println(family1.isEmpty)
    
    family1.keys.foreach{key => 
      println("key is : "+key)
      println("value is : "+family1(key))
    }
    
    println(family1.contains(102))
    println(family1 ++ family2)
    
    println(family1.size)
  }//main
}