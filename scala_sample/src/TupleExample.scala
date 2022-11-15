

object TupleExample {
  
  val myTuple1 = (1, 2, "Hello", true)
  val myTuple2 = new Tuple3(1, 2 , "Sharif")
  val myTuple3 = new Tuple2(1,("gfg","javaTpoint"))
  
  def main(args: Array[String]){
    
    println(myTuple1)
    println(myTuple1._4)
    
    myTuple1.productIterator.foreach{ i => println(i)}
    
    println(myTuple3._2._2)
    
    println(myTuple1.toString())
    
    
  }
}