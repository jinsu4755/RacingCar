package racingcar

import racingcar.view.InputView
import racingcar.view.ResultView

fun main() {
    val inputView = InputView()
    val carsWithName = inputView.getCarsWithName()
    val numOfTry = inputView.getNumOfTry()

    val carFactory = CarFactory()
    val racingCars = carFactory.makeCars(carsWithName)

    val racingZone = RacingZone()
    val carMover = CarMover()
    val resultOfRace = racingZone.startRaceAndGetResult(racingCars, numOfTry, carMover)

    val resultView = ResultView()
    val numOfCar = carsWithName.size
    resultView.showResult(resultOfRace, numOfCar)
}
