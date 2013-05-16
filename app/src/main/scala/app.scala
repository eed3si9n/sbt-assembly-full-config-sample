object App extends scala.App with foo.Names {
  println("hello, %s. It's %s!" format (names.head, foo.Day.SUNDAY.toString))
}
