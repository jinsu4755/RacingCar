package racingcar.view

import racingcar.Car

class RacingResult {
    fun show(tracks: List<Car>, numberOfAttempt: Int) {
        println("실행 결과")
        for (i in 0 until numberOfAttempt) {
            oneCycleOnRaceTrack(tracks)
        }
    }

    private fun oneCycleOnRaceTrack(tracks: List<Car>) {
        println()
        for (carInTrack in tracks) {
            carInTrack.move()
            printCarMovingResult(carInTrack.getMovementDistance())
        }
    }

    private fun printCarMovingResult(distance: Int) {
        var lineStatus = ""
        for (i in 0 until distance) {
            lineStatus = "$lineStatus-"
        }
        println(lineStatus)
    }
}
