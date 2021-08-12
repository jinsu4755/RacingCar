package racingcar

import racingcar.view.InputView.getCarNames
import racingcar.view.InputView.getRaceNum
import racingcar.view.OutputView.printRaceResult

fun main() {
    val carNames = getCarNames()
    val raceNum = getRaceNum()
    val cars = Cars()
    repeat(carNames.size) {
        val car = Car(
            carNames[it],
            object : Checker {
                override fun checkIfRun(): Boolean {
                    return RaceRule.getRandomNum() > RaceRule.RULE_NUMBER
                }
            }
        )
        cars.add(car)
    }
    val raceRecord = Race.start(
        cars,
        raceNum
    )

    printRaceResult(raceRecord)
}
