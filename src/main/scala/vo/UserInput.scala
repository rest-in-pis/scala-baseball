package vo

class UserInput(val inputValue: String) {
  val value = Integer.parseInt(inputValue)


  def getter(): Unit = {
    return {
      value1, value2, value3
    }
  }

  def getUserInputValue(): Unit = {
    return userInputValue
  }

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
