package vo

class DefaultStringNumberExample(inputValue: String) {
  require(inputValue.nonEmpty, "입력값이 반드시 필요합니다.")

  val value: Integer = Integer.parseInt(inputValue)

  def this(inputValue: Integer) = this(String.valueOf(inputValue))

  def add(that: DefaultStringNumberExample): DefaultStringNumberExample = {
    new DefaultStringNumberExample(this.value + that.value)
  }

  private def canEqual(other: Any): Boolean = other.isInstanceOf[DefaultStringNumberExample]

  override def equals(other: Any): Boolean = other match {
    case that: DefaultStringNumberExample =>
      that.canEqual(this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
