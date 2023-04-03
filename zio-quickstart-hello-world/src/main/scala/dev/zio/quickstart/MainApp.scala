package dev.zio.quickstart

import java.io.IOException

import zio._

object MainApp extends ZIOAppDefault {
  def run =
    for {
      _    <- Console.print("Please enter your name: ")
      name <- Console.readLine
      _    <- Console.printLine(s"Hello, $name!")
    } yield ()
}
