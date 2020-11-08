package racingcar

class RacingCar(private val carName: String, numberOfAttempts: Int, private val movingCondition: MovingCondition) {
    private val carMotionStatus = MutableList(numberOfAttempts) { true }

    fun moveCar() {
        for (index in carMotionStatus.indices) {
            carMotionStatus[index] = movingCondition.satisfy()
        }
    }

    fun getResultOfMoving(): MutableList<Boolean> {
        val copyOfCarMotionStatus = mutableListOf<Boolean>()
        copyOfCarMotionStatus.addAll(carMotionStatus)
        return copyOfCarMotionStatus
    }

    fun getCarName(): String = carName

    fun getNumOfAttempts(): Int = carMotionStatus.size
}
