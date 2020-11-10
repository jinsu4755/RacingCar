package racingCar

import racingCar.car.CarFactory
import racingCar.racing.RacingGame
import racingCar.view.getNamesOfCar
import racingCar.view.getRaceCount
import racingCar.view.printGameResult

fun main() {
    val carNames = getNamesOfCar()
    val raceCount = getRaceCount()

    val cars = CarFactory.create(carNames)
    val result = RacingGame.race(cars, raceCount)

    printGameResult(result)
}
