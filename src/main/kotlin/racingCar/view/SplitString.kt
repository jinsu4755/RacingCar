package racingCar.view

import java.lang.IllegalArgumentException

object SplitString {
    private const val DELIMITER = ","

    fun getSplitNames(NamesOfCar: String): List<String> {
        val namesOfCar = NamesOfCar.split(DELIMITER)
        namesOfCar.forEach { name ->
            checkName(name)
        }
        return namesOfCar
    }

    private fun checkName(name: String) {
        require(name.length <= 5) { IllegalArgumentException("자동차 이름은 5글자 이내여야 합니다.") }
    }
}
