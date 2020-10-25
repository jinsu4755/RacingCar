import java.lang.IllegalArgumentException

class NumChecker {
    fun checkNum(num: String): Int {
        return num.toIntOrNull() ?: throw IllegalArgumentException("해당 문자는 숫자로 변환할 수 없습니다. \n 입력된 문자 : $num")
    }
}
