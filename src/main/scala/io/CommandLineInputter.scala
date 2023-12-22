package io

import scala.io.StdIn.readLine

class CommandLineInputter {
  def scanner(): String = {
    val userInputValue: String = readLine();

    return userInputValue
  }
}
