package vo

import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatest.prop.TableDrivenPropertyChecks._

class UserInputsTest extends AnyFunSuiteLike {
  test("생성자도 잘 몰라서 클래스 잘 생성됐는지 확인함") {
    val inputValue = "123"
    val expected = "123"

    val userInput = new UserInputs(inputValue)
    assert(userInput.value == expected)
  }

  val invalidCases = Table(
    ("invalidValue", "expectedException", "expectedMessage"),
    (null, classOf[IllegalArgumentException], "값을 반드시 입력해야 합니다."),
    ("       ", classOf[IllegalArgumentException], "빈 문자열을 입력할 수 없습니다."),
    ("1234", classOf[IllegalArgumentException], "세 자리만 입력 가능합니다."),
    ("332", classOf[IllegalArgumentException], "중복된 숫자가 없어야 합니다."),
    ("032", classOf[IllegalArgumentException], "0은 입력값이 될 수 없습니다."),
    ("a01", classOf[IllegalArgumentException], "숫자만 입력 가능합니다."),

  )

  forEvery(invalidCases) {(invalidValue, expectedException, expectedMessage) =>
    test(s"$expectedMessage") {
      val exception = intercept[Exception] {
        new UserInputs(invalidValue)
      }

      assert(exception.getClass == expectedException)
      assert(exception.getMessage.contains(expectedMessage))
    }
  }
}
