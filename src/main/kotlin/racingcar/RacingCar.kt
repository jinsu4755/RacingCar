package racingcar

class RacingCar(
    private val carName: String
) {
    var carStep = 0
        private set

    fun tryGoForward(randomNum: Int) {
        if (randomNum > CAN_MOVE_NUM) carStep++
    }

    fun getCarName(): String {
        return carName
    }

    companion object {
        const val CAN_MOVE_NUM = 4
    }
}
