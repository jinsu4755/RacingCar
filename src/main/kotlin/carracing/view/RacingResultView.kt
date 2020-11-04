package carracing.view

import carracing.RacingMethod

class RacingResultView {
    fun resultOfRacing() {
        val racingMethod = RacingMethod()
        val roundNumber = InputView.racingInfoList[1]
        val numberOfCar = InputView.racingInfoList[0]

        repeat(roundNumber) {
            var roundResultList = racingMethod.raceEachRound()

            for (i in 0 until numberOfCar) {
                println("-".repeat(roundResultList[i]))
            }
            println("Round Result: $roundResultList")
        }
    }
}
