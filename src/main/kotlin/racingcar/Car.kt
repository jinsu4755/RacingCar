package racingcar

import kotlin.random.Random

class Car {
    private var movementDistance: Int = 0

    fun movingController(movementDeterminant: Int) {
        if (movementDeterminant >= 4) {
            movementDistance += 1
        }
    }

    private fun randomMoving(): Int {
        return Random.nextInt(10)
    }

    fun move() {
        val movementDeterminant = randomMoving()
        movingController(movementDeterminant)
    }

    fun getMovementDistance(): Int {
        return movementDistance
    }
}
