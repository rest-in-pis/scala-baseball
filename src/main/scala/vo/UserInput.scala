package vo

// VO = Value Object
class UserInput(val value: String) {
  require(value != null, "값을 반드시 입력해야 합니다.")
  require(value.length != 3, "")
}
