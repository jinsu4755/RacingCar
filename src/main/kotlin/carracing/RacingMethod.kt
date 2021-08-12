package carracing

import carracing.view.InputView
import kotlin.random.Random

class RacingMethod {
    val numberOfCar = InputView.inputRacingInfo()[0]
    val eachCarList = MutableList(numberOfCar, { i -> 0 })

    fun raceEachRound(): List<Int> {

        for (i in 0 until numberOfCar) {
            var racingDistance = Random.nextInt(MAX_RANDOM_DISTRANCE)
            if (racingDistance >= MIN_DINTANCE_FOR_GO) eachCarList[i]++
        }
        return eachCarList
    }

    companion object {
        val MAX_RANDOM_DISTRANCE = 9
        val MIN_DINTANCE_FOR_GO = 4
    }
}
