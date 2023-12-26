package io

import org.scalatest.funsuite.AnyFunSuiteLike

class CommandLineInputterTest extends AnyFunSuiteLike {

  test("유저가 입력한 값을 그대로 반환한다..") {
    val inputter = new CommandLineInputter()

    inputter.scanner()
  }

}
