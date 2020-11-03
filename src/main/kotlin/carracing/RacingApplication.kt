package carracing

import carracing.view.InputView
import carracing.view.RacingResultView

fun main() {
    val racingResultView = RacingResultView()
    InputView.inputRacingInfo()
    racingResultView.resultOfRacing()
}
