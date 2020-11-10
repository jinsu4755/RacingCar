package racingCar.racing

import racingCar.record.CarsRecord
import racingCar.car.Cars

object RacingGame {
    fun race(cars: Cars, round: Int): GameResult {
        var record = mutableListOf<CarsRecord>()
        repeat(round) {
            cars.move()
            record.add(cars.capture())
        }
        return GameResult(record)
    }
}
