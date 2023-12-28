package vo

import org.scalatest.funsuite.AnyFunSuiteLike

class UserInputTest extends AnyFunSuiteLike {
  test("생성자도 잘 몰라서 클래스 잘 생성됐는지 확인함") {
    val inputValue = "3"
    val expected = "3"

    val userInput = new UserInput(inputValue)
    assert(userInput.value == expected)
  }

  test("유저입력값은 null일 수 없다.") {
    val invalidValue = null

    val userInput = new UserInput(invalidValue)
  }
}
