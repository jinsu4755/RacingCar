package carracing.view

import carracing.RacingMethod

class RacingResultView {

    fun resultOfRacing() {
        val racingMethod = RacingMethod()
        val roundNumber = InputRacingInfoView.countOfRacing
        val numberOfCar = InputRacingInfoView.numberOfCar

        repeat(roundNumber) {
            var eachCarList = racingMethod.raceEachRound()
            for (i in 0 until numberOfCar) {
                println("-".repeat(eachCarList[i]))
            }
            println("Round Result: $eachCarList")
        }
    }
}
