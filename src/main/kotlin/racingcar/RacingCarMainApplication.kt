package racingcar

import racingcar.view.InputRacingInfo

fun main() {
    val inputRacingInfo = InputRacingInfo()

    val raceParticipation = RegisterCarInRacingFactory.registerRacingParticipationCars(inputRacingInfo.getCarNames())
    val racingCarTracks = RacingCarTracks(raceParticipation)
    racingCarTracks.race(inputRacingInfo.getNumberOfAttempt())
}
