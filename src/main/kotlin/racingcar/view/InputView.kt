package racingcar.view

import java.lang.IllegalArgumentException

object InputView {
    fun getCarNum(): Int {
        println("자동차 대수는 몇 대인가요?")
        val carNum = readLine()?.toIntOrNull()
            ?: throw NumberFormatException("숫자만 입력이 가능합니다.")
        return carNum
    }

    fun getCarNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        val carNames = readLine()!!.split(',')
        require(carNames.isNotEmpty()) {
            throw IllegalArgumentException("자동차를 반드시 입력해야 합니다.")
        }
        return carNames
    }

    fun getRaceNum(): Int {
        println("시도할 횟수는 몇 회인가요?")
        val raceNum = readLine()?.toIntOrNull()
            ?: throw NumberFormatException("숫자만 입력이 가능합니다.")
        return raceNum
    }
}
