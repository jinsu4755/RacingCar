package racingCar

import racingCar.view.getNamesOfCar
import racingCar.view.getRaceCount
import racingCar.view.printGameResult
import racingCar.view.printGameWinner

fun main() {
    val carNames = getNamesOfCar()
    val raceCount = getRaceCount()

    val cars = CarFactory.create(carNames)
    val raceGame = RaceGame()
    raceGame.race(cars, raceCount)

    printGameResult(raceGame.getGameResult())
    printGameWinner(raceGame.getGameWinner())
}

object CarFactory {
    fun create(carNames: List<String>): Cars {
        val cars = mutableListOf<Car>()
        carNames.forEach { name ->
            cars.add(Car(name, RandomAccelerator()))
        }
        return Cars(cars)
    }
}
