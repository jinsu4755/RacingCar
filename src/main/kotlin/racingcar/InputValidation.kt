package racingcar

import java.lang.IllegalArgumentException

object InputValidation {
    fun validateIntInput(inputValue: Int) {
        require(inputValue >= 0) { "음수를 입력하면 안됩니다." }
        require(inputValue != 0) { "입력값은 0이 될 수 없습니다." }
    }

    fun validateNameList(inputValue: MutableList<String>) {
        require(inputValue.size > 1) { throw IllegalArgumentException("2대부터 경주가 가능합니다.") }
    }
}
