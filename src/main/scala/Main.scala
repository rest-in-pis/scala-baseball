import io.CommandLineInputter

object Main {
  def main(args: Array[String]): Unit = {
    val commandLineInputter = new CommandLineInputter()

    print("값을 입력해주세요. : ")
    val userInputValue = commandLineInputter.scanner()

    println(userInputValue)
  }
}