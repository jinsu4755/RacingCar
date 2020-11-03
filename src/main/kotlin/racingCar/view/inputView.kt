package racingCar.view

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun getNumberOfCar(): Int {
    println("자동차 대수는 몇 대 인가요?")
    val numberOfCar = readLine() ?: throw IllegalArgumentException("자동차 대수는 공백일 수 없습니다.")
    try {
        return numberOfCar.toInt()
    } catch (e: NumberFormatException) {
        throw NumberFormatException("자동차 대수는 정수이어야 합니다.")
    }
}

fun getNumberOfTry(): Int {
    println("시도할 횟수는 몇 회 인가요?")
    val numberOfTry = readLine() ?: throw IllegalArgumentException("시도할 횟수는 공백일 수 없습니다.")
    try {
        return numberOfTry.toInt()
    } catch (e: NumberFormatException) {
        throw NumberFormatException("시도할 횟수는 정수이어야 합니다.")
    }
}
