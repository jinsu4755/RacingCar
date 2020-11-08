package racingcar.view

class InputRacingInfo {
    fun getNumberOfAttempt(): Int {
        println("시도할 횟수는 몇 회인가요?")
        val attemptString: String = readInputDataOrIllegalArgument()
        return attemptString.also {
            validateNumber(it)
        }.toInt()
    }

    fun getNumberOfRacingCar(): Int {
        println("자동차 대수는 몇 대인가요?")
        val racingCarNumberString: String = readInputDataOrIllegalArgument()
        return racingCarNumberString.also {
            validateNumber(it)
        }.toInt()
    }

    private fun readInputDataOrIllegalArgument() =
        readLine() ?: throw IllegalArgumentException("입력받은 값이 Null 일 수 없습니다.")

    fun validateNumber(numberString: String) {
        require(numberString.toIntOrNull() is Int) {
            throw IllegalArgumentException("입력받은 $numberString 은 숫자가 아닙니다, 숫자를 입력해주세요.")
        }
    }
}
