package racingcar

object InputValidation {
    fun validateAmountInput(inputValue: Int?): Int {
        require(inputValue != null) { "정수 이외의 문자를 입력하시면 안됩니다." }
        require(inputValue >= 0) { "음수를 입력하면 안됩니다." }
        require(inputValue != 0) { "입력값은 0이 될 수 없습니다." }
        return inputValue
    }
}
