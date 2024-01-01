package vo

import org.scalatest.funsuite.AnyFunSuiteLike

class DefaultIntegerPositiveNumberExampleTest extends AnyFunSuiteLike {
  test("객체 간 덧셈이 가능하다") {
    val three = new DefaultIntegerPositiveNumberExample(3)
    val five = new DefaultIntegerPositiveNumberExample("5")
    val result = three.add(five)

    assert(result == new DefaultIntegerPositiveNumberExample(8))
  }

  test("양수만 허용한다.") {
    assertThrows[IllegalArgumentException] {
      new DefaultIntegerPositiveNumberExample(-3)
    }
  }
}
