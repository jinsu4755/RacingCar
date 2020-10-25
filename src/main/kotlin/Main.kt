import java.lang.IllegalArgumentException

const val delimiter = " "
fun main() {
    val keyboardInputString = readLine() ?: throw IllegalArgumentException("입력값은 null일 수 없습니다.")
    val splitList = keyboardInputString.split(delimiter)
    SizeChecker().checkSize(splitList)
    val resultValue = StringCalculator().calculate(splitList)
    print("계산값은 ${resultValue}입니다.")
}
