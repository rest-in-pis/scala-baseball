package vo

class DefaultIntegerPositiveNumberExample(val value: Integer) {
  require(value >= 0, "양수만 허용합니다.")

  def this(stringInput: String) = {
    // 일단 생성자를 실행한 뒤에만 무언가를 할 수 있기 때문에 이 경우 보조생성자에 뭔가 제어하기가 아주 개떡같아짐.
    // 차라리 팩토리 메서드를 박아서 쓰는 게 나을 수 있을듯.
    this(Integer.parseInt(stringInput))
  }

  def add(that: DefaultIntegerPositiveNumberExample): DefaultIntegerPositiveNumberExample = {
    new DefaultIntegerPositiveNumberExample(this.value + that.value)
  }

  private def canEqual(other: Any): Boolean = other.isInstanceOf[DefaultIntegerPositiveNumberExample]

  override def equals(other: Any): Boolean = other match {
    case that: DefaultIntegerPositiveNumberExample =>
      that.canEqual(this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
