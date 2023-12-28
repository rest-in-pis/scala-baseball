package vo

import org.scalatest.funsuite.AnyFunSuiteLike

class UserInputsTest extends AnyFunSuiteLike {
  test("생성자도 잘 몰라서 클래스 잘 생성됐는지 확인함") {
    val inputValue = "3"
    val expected = "3"

    val userInput = new UserInputs(inputValue)
    assert(userInput.value == expected)
  }

  test("유저입력값은 null일 수 없다.") {
    val invalidValue = null

    val exception = intercept[IllegalArgumentException] {
      new UserInputs(invalidValue)
    }

    assert(exception.getMessage.contains("값을 반드시 입력해야 합니다."))
  }

  test("유저입력값은 빈 문자열일 수 없다.") {
    val invalidValue = "       "

    val exception = intercept[IllegalArgumentException] {
      new UserInputs(invalidValue)
    }

    assert(exception.getMessage.contains("빈 문자열을 입력할 수 없습니다."))
  }

  test("유저입력값은 세 글자여야만 한다.") {
    val invalidValue = "1234"

    val exception = intercept[IllegalArgumentException] {
      new UserInputs(invalidValue)
    }

    assert(exception.getMessage.contains("세 자리 숫자만 입력 가능합니다."))
  }
}
