

object OptionsExample {
  
  val lst = List(1,2,3)
  val names = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")
  val opt: Option[Int] = Some(55)
  
  def main(args: Array[String]){
    
    println(lst.find(_ > 2))
    println(names.get(2))
    
    println(lst.find(_ > 2).get)
    println(names.get(2).get)
    
    println(lst.find(_ > 3).getOrElse(0))
    println(lst.find(_ > 2).getOrElse(0))
    
    println(names.get(2).getOrElse("not present"))
    println(names.get(4).getOrElse("not present"))
    
    println(opt.isEmpty)
    println(opt)
    println(opt.get)
    
  }
}