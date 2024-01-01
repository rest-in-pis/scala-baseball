package vo

import org.scalatest.funsuite.AnyFunSuiteLike

class DefaultStringNumberExampleTest extends AnyFunSuiteLike {
  test("Number 객체 간 덧셈이 가능하다") {
    val three = new DefaultStringNumberExample("3")
    val five = new DefaultStringNumberExample("5")
    val result = three.add(five)

    assert(result == new DefaultStringNumberExample("8"))
  }
}
