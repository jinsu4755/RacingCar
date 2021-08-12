package racingcar.view

import racingcar.RaceRecord
import racingcar.RoundRecord

object OutputView {
    fun printRaceResult(raceRecord: RaceRecord) {
        println("실행결과")
        printRaceGraph(raceRecord)
        printWinCar(raceRecord)
    }

    private fun printRaceGraph(raceRecord: RaceRecord) {
        val roundsRecord = raceRecord.get()
        roundsRecord.forEach { roundRecord ->
            printRoundGraph(roundRecord)
            println()
        }
    }

    private fun printRoundGraph(roundRecord: RoundRecord) {
        val carsRecord = roundRecord.get()
        carsRecord.forEach { carRecord ->
            val carName = carRecord.carName
            var carGraph = if (carName.isNotBlank()) "$carName  : " else carName
            repeat(carRecord.distance) {
                carGraph += "-"
            }
            println(carGraph)
        }
    }

    private fun printWinCar(raceRecord: RaceRecord) {
        val winCarRecords = raceRecord.getWinCarRecords()
        var winCarNames = ""

        winCarRecords.forEachIndexed { index, carRecord ->
            if (index > 0) {
                winCarNames += ", "
            }
            winCarNames += carRecord.carName
        }

        println("$winCarNames 가 최종 우승했습니다.")
    }
}
