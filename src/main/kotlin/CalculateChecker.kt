import java.lang.IllegalArgumentException

class CalculateChecker {
    companion object {
        val FOUR_RULES_CALCULATION_LIST = listOf("+", "-", "*", "/")
    }

    fun checkCalculable(splitList: List<String>) {
        checkSize(splitList)
        for (i in 1 until splitList.size step 2) {
            checkOperator(splitList[i])
            checkNum(splitList[i + 1])
        }
    }

    fun checkSize(splitList: List<String>) {
        require(splitList.size > 2) { IllegalArgumentException("계산 식이 아닙니다.\n 입력 받은 값 : $splitList") }
    }

    fun checkNum(number: String) {
        require(number.toIntOrNull() is Int) {
            IllegalArgumentException("숫자가 입력되어야 합니다. \n 입력받은 값 : $number")
        }
    }

    fun checkOperator(operator: String) {
        require(FOUR_RULES_CALCULATION_LIST.contains(operator)) {
            IllegalArgumentException("해당 자리에 사칙연산 기호만 입력할 수 있습니다. \n 입력받은 값 : $operator")
        }
    }
}