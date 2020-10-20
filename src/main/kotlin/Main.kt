import java.lang.IllegalArgumentException

fun main() {
    val keyboardInputString = readLine() ?: throw IllegalArgumentException("아무것도 입력하지 않았습니다.")
    val splitList = keyboardInputString.split(" ")
    CalculateChecker().checkCalculable(splitList)
    val resultValue = StringCalculator().calculate(splitList)
    print("계산값은 ${resultValue}입니다.")
}