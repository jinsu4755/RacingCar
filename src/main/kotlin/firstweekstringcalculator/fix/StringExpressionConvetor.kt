package firstweekstringcalculator.fix

class StringExpressionConvertor {
    fun toExpressionElementList(stringExpression: String): List<String> {
        return stringExpression.also{
             validateNotBlank(it)
        }.split(" ")
    }

    private fun validateNotBlank(stringExpression: String) {
        if (stringExpression.isBlank()) throw IllegalArgumentException("입력받은 값이 공백일 수 없습니다.")
    }
}