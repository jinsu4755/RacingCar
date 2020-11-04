package racingcar.view

object InputView {
    fun getCarNum(): Int {
        println("자동차 대수는 몇 대인가요?")
        val carNum = readLine()?.toIntOrNull()
            ?: throw NumberFormatException("숫자만 입력이 가능합니다.")
        return carNum
    }

    fun getRaceNum(): Int {
        println("시도할 횟수는 몇 회인가요?")
        val raceNum = readLine()?.toIntOrNull()
            ?: throw NumberFormatException("숫자만 입력이 가능합니다.")
        return raceNum
    }
}
