package racingcar

import kotlin.random.Random

class CarMover {
    fun canMove(): Int {
        return Random.nextInt(MAX_RANDOM_NUM)
    }

    companion object {
        const val MAX_RANDOM_NUM = 9
    }
}
