package racingcar

import racingcar.view.InputView.inputCarNum
import racingcar.view.InputView.inputRaceNum
import racingcar.view.OutputView.printRaceResult

fun main() {
    val carNum = inputCarNum()
    val raceNum = inputRaceNum()

    val result = Race(carNum, raceNum).start()
    printRaceResult(result)
}
