package vo

// VO = Value Object
class UserInputs(val value: String) {
  private val VALID_LENGTH = 3

  require(value != null, "값을 반드시 입력해야 합니다.")
  require(!value.isBlank, "빈 문자열을 입력할 수 없습니다.")
  require(value.length == VALID_LENGTH, "세 자리만 입력 가능합니다.")
  require(value.distinct.length == value.length, "중복된 숫자가 없어야 합니다.")

  val numbers: List[UserInput] = value.map(it => new UserInput(it.toString)).toList

  def firstValue: UserInput = numbers.head
}
