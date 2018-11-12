object PrintLines {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  println(s"Here you can add the expressions ${20+20}")
                                                  //> Here you can add the expressions 40
 for(i <- 1 to 10){
 	println(i)                                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
 }
}