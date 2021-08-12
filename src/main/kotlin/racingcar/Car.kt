package racingcar

import java.lang.IllegalArgumentException

class Car(
    private val carChecker: Checker
) {
    var distance = 0
        private set
    var name = ""
        private set

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

    constructor(carName: String, carChecker: Checker) : this(carChecker) {
        require(carName.length <= 5) {
            throw IllegalArgumentException("자동차의 이름은 5자 이하여야 합니다. 잘못된 자동차 이름: $carName")
        }
        this.name = carName
    }

    companion object {
        const val ONE_DISTANCE = 1
    }
}

interface Checker {
    fun checkIfRun(): Boolean
}
