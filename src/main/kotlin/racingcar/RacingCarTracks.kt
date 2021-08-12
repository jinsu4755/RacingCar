package racingcar

import racingcar.view.RacingResult

class RacingCarTracks(
    private val racingParticipatingCars: RacingParticipatingCars
) {
    fun race(numberOfAttempt: Int) {
        repeat(numberOfAttempt) {
            racingParticipatingCars.oneCycleOfRace()
            RacingResult().showOneCycleResult(racingParticipatingCars.raceStatus())
        }
        RacingResult().showRacingWinner(racingParticipatingCars.getRacingWinner())
    }
}
