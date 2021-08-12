package racingCar.racing

import racingCar.record.CapturedCar
import racingCar.record.CarsRecord

class GameResult(
    val record: List<CarsRecord>
) {
    fun getWinner(): List<CapturedCar> {
        val result = record[record.lastIndex]
        return result.getMaxDistanceCars()
    }
}
