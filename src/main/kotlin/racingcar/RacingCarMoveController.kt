package racingcar

class RacingCarMoveController : MoveController {
    override fun movableStatus(): Boolean {
        return (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random() > MOVABLE_CONDITION_NUMBER
    }

    companion object {
        private const val MAX_RANDOM_NUMBER = 9
        private const val MIN_RANDOM_NUMBER = 0
        private const val MOVABLE_CONDITION_NUMBER = 4
    }
}
