package vo

// VO = Value Object
class UserInput(val value: String) {
  require(value != null, "값을 반드시 입력해야 합니다.")
  require(!value.isBlank, "빈 문자열을 입력할 수 없습니다.")
}
