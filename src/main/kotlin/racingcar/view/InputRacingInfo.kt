package racingcar.view

class InputRacingInfo {
    fun getNumberOfAttempt(): Int {
        println("시도할 횟수는 몇 회인가요?")
        val attemptString: String = readLine()!!
        return attemptString.also {
            validateNumber(it)
        }.toInt()
    }

    fun getCarNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분합니다.")
        val racingCarNames: String = readLine()!!
        return racingCarNames.split(",")
    }

    fun validateNumber(numberString: String) {
        require(numberString.toIntOrNull() is Int) {
            throw IllegalArgumentException("입력받은 $numberString 은 숫자가 아닙니다, 숫자를 입력해주세요.")
        }
    }
}
