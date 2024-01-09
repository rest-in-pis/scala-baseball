package vo

import scala.util.control.Exception

class UserInput(val inputValue: String) {
  private val VAN_NUMBER = 0

  try {
    Integer.parseInt(inputValue)
  } catch {
    case e: Exception => throw new IllegalArgumentException("숫자만 입력 가능합니다.")
  }

  val value = Integer.parseInt(inputValue)

  require(value != VAN_NUMBER, "0은 입력값이 될 수 없습니다.")

  private def canEqual(other: Any): Boolean = other.isInstanceOf[UserInput]

  override def equals(other: Any): Boolean = other match {
    case that: UserInput =>
      that.canEqual(this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
