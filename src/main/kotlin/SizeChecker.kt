import java.lang.IllegalArgumentException

class SizeChecker {
    fun checkSize(splitList: List<String>) {
        require(splitList.size > 2) { IllegalArgumentException("계산 식이 아닙니다.\n 입력 받은 값 : $splitList") }
    }
}
