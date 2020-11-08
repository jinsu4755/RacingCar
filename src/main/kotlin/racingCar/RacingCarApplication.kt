package racingCar

import racingCar.view.getNumberOfCar
import racingCar.view.getNumberOfTry
import racingCar.view.printGameResult

fun main() {
    val carCount = getNumberOfCar()
    val raceCount = getNumberOfTry()
    val cars = CarFactory.create(carCount)
    val raceGame = RaceGame()
    raceGame.race(cars, raceCount)
    printGameResult(raceGame.getGameResult())
}

object CarFactory {
    fun create(carCount: Int): Cars {
        val cars = mutableListOf<Car>()
        repeat(carCount) {
            cars.add(Car(RandomAccelerator()))
        }
        return Cars(cars)
    }
}
