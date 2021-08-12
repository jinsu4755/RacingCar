package racingcar.view

import racingcar.Car

class RacingResult {

    fun showOneCycleResult(racingCars: List<Car>) {
        println("------")
        racingCars.forEach {
            println("${it.name} : ${"-".repeat(it.movementDistance)}")
        }
    }

    fun showRacingWinner(racingWinners: List<String>) {
        print("우승자는! :")
        racingWinners.forEach {
            print(it)
        }
    }
}
