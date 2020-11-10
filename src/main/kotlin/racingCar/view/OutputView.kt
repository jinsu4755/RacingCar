package racingCar.view

import racingCar.racing.GameResult
import racingCar.record.CapturedCar
import racingCar.record.CarsRecord

fun printWinner(winners: List<CapturedCar>) {
    println()
    println(winners.joinToString(separator = ", ") + "가 최종 우승했습니다.")
}

fun printGameResult(gameResult: GameResult) {
    gameResult.record.forEach { roundResult ->
        println()
        printRoundResult(roundResult)
    }
    printWinner(gameResult.getWinner())
}

fun printRoundResult(roundResult: CarsRecord) {
    roundResult.carsRecord.forEach { capturedCar ->
        println(capturedCar.name + ":" + distanceToLine(capturedCar.distance))
    }
}

fun distanceToLine(distance: Int): String {
    return "-".repeat(distance)
}
