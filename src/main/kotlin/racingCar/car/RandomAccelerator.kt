package racingCar.car

class RandomAccelerator : Accelerator {
    override fun canMove(): Boolean {
        return (0..MAX_RANDOM_NUMBER).random() > MOVE_CONDITION_NUMBER
    }

    companion object {
        private const val MAX_RANDOM_NUMBER = 9
        private const val MOVE_CONDITION_NUMBER = 4
    }
}
