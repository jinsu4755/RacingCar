package racingcar

import java.lang.IllegalArgumentException

class KeyboardInputChanger {
    fun loadCarNames(carNamesString: String?): List<String> {
        val carNames = carNamesString!!.split(DELIMITER)
        checkCarNames(carNames)
        return carNames
    }

    private fun checkCarNames(carNames: List<String>) {
        carNames.forEach {
            if (it.length > 5) throw IllegalArgumentException("차 이름이 너무 깁니다 \n 입력된 차 이름: $it")
        }
    }

    fun stringToNum(numString: String?): Int {
        val num = numString!!.toIntOrNull() ?: throw IllegalArgumentException("숫자가 입력되어야 합니다. 입력값: $numString")
        require(num > 0) { throw IllegalArgumentException("숫자가 잘못 입력되었습니다.\n 입력값: $num") }
        return num
    }

    companion object {
        const val DELIMITER = ","
    }
}
