package racingcar

class Car(
    private val carChecker: Checker
) {
    private var distance = 0

    fun run() {
        if (carChecker.checkIfRun()) {
            distance += ONE_DISTANCE
        }
    }

    fun run(time: Int) {
        repeat(time) {
            run()
        }
    }

    fun getDistance() = distance

    companion object {
        const val ONE_DISTANCE = 1
    }
}

interface Checker {
    fun checkIfRun(): Boolean
}
