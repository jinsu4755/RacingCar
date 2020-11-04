package racingcar

class Car {
    private var distance = 0

    fun run() {
        if (RaceRule.checkIfCarRun()) {
            distance += ONE_DISTANCE
        }
    }

    fun getDistance() = distance

    companion object {
        const val ONE_DISTANCE = 1
    }
}
