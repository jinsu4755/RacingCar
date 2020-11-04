package racingcar.view

import java.lang.IllegalArgumentException

object InputView {
    fun getCarNum(): Int {
        println("자동차 대수는 몇 대인가요?")
        return readLine()?.toInt()
            ?: throw IllegalArgumentException("자동차 대수는 반드시 입력해야 합니다.")
    }

    fun getRaceNum(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readLine()?.toInt()
            ?: throw IllegalArgumentException("시도할 횟수는 반드시 입력해야 합니다.")
    }
}
