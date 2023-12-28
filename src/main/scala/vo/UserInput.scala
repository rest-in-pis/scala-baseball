package vo

// VO = Value Object
class UserInput(val value: String) {
  require(value != null)
}
