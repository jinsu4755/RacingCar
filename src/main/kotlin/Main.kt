import java.lang.IllegalArgumentException

fun main(){
    val keyboardInputString = readLine() ?: throw IllegalArgumentException("아무것도 입력하지 않았습니다.")
    val resultValue = StringCalculator().calculate(keyboardInputString)
    print("계산값은 ${resultValue}입니다.")
}