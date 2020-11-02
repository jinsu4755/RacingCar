package racingcar

class RacingCar(numberOfAttempts: Int) {
    private val carMotionStatus = MutableList(numberOfAttempts) { true }

    private fun decideMoveOrStay(randomNumber: Int): Boolean = randomNumber >= MOVE_FLAG

    private fun decideCarStatus(): Boolean {
        val randomNumberGenerator = RandomNumberGenerator()
        val givenRandomNumber = randomNumberGenerator.sendRandomNumber()
        require(givenRandomNumber in 0..9) { "무작위로 주어진 값이 잘못 설정되었습니다." }
        return decideMoveOrStay(givenRandomNumber)
    }

    fun moveCar() {
        for (index in carMotionStatus.indices) {
            carMotionStatus[index] = decideCarStatus()
        }
    }

    fun getResultOfMoving(): MutableList<Boolean> {
        val copyOfCarMotionStatus = mutableListOf<Boolean>()
        copyOfCarMotionStatus.addAll(carMotionStatus)
        return copyOfCarMotionStatus
    }

    companion object {
        private const val MOVE_FLAG = 4
    }
}
