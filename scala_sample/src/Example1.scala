

object Example1 {
  
  def main(args : Array[String]) : Unit = {
   
    
    val x = 20
    val y = 30
    var res1 = ""
    
   /* if(x==20)
      res1 = "x=20"
    else
      res1 = "x!=20"
    */
    
    var res2 = if(x==20) "x=20" else "x!=20"
    println(res2)
    
  }
}