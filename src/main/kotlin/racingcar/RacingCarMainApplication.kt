package racingcar

import racingcar.view.InputRacingInfo
import racingcar.view.RacingResult

fun main() {
    val inputRacingInfo = InputRacingInfo()
    val racingCarTracks = RacingCarTracks()

    val numberOfRacingCar = inputRacingInfo.getNumberOfRacingCar()
    val numberOfAttempt = inputRacingInfo.getNumberOfAttempt()

    racingCarTracks.prepareForRacingTrack(numberOfRacingCar)

    RacingResult().show(racingCarTracks.getRacingCarsOnTheTrack(), numberOfAttempt)
}
