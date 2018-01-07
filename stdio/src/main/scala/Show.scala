object Show extends App{
  val reader = ReadStdIO
  val write = WriteStdIO("wewew")
  val pure  = PureStdIO("123")
  def f1(s:String):Int = Integer.parseInt(s)
  def f2(s:String):StdIO[String] = PureStdIO(s)
  val result =  StdIO.calcFlatMap(reader,reader,reader)
  println(result.run.get.get)

}
