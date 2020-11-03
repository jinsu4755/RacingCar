package carracing

import carracing.view.InputView
import kotlin.random.Random

class RacingMethod {
    var eachCarList = MutableList(InputView.numberOfCar, { i -> 0 })

    fun raceEachRound(): MutableList<Int> {
        val numberOfCar = InputView.numberOfCar

        for (i in 0..numberOfCar - 1) {
            var racingDistance = Random.nextInt(9)
            if (racingDistance >= 4) eachCarList[i]++
        }
        return eachCarList
    }
}
