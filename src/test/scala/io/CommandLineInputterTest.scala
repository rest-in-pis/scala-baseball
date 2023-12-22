package io

import org.scalatest.funsuite.AnyFunSuiteLike

class CommandLineInputterTest extends AnyFunSuiteLike {

  test("단위테스트 잘 도는지 확인") {
    val inputter = new CommandLineInputter()
    assert(inputter.test == "hello, scala")
  }

}
