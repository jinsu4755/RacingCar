package racingcar

import racingcar.view.InputView.getCarNum
import racingcar.view.InputView.getRaceNum
import racingcar.view.OutputView.printRaceResult

fun main() {
    val carNum = getCarNum()
    val raceNum = getRaceNum()
    val cars = Cars(carNum)
    val raceGraph = Race(
        cars,
        raceNum
    ).start()
    printRaceResult(raceGraph.getFinalGraph())
}
