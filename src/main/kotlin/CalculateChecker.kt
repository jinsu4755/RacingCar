import java.lang.IllegalArgumentException

class CalculateChecker {
    private val fourRulesCalculationList = listOf("+", "-", "*", "/")
    fun checkCalculable(splitList: List<String>) {
        val operatorList = splitList.filterNot { it.toIntOrNull() is Int }
        checkOperatorList(operatorList)
        val numberList = splitList.filter { it.toIntOrNull() is Int }
        checkOperatorNumber(operatorList, numberList)
    }

    private fun checkOperatorNumber(operatorList: List<String>, numberList: List<String>) {
        require(operatorList.size + 1 == numberList.size) { IllegalArgumentException("연산자 : $operatorList 숫자 : $numberList") }
    }

    private fun checkOperatorList(operatorList: List<String>) {
        for (i in operatorList.indices) {
            val operator = operatorList[i]
            require(fourRulesCalculationList.contains(operator)) {
                IllegalArgumentException("${operator}는 사칙 연산기호가 아닙니다.")
            }
        }
    }
}