package racingCar

class Car(
    private val name: String,
    private val accelerator: Accelerator
) {
    private var distance = 0
    fun getName(): String = name
    fun getDistance(): Int = distance
    fun move() {
        if (accelerator.canMove())
            distance++
    }
}

interface Accelerator {
    fun canMove(): Boolean
}

class RandomAccelerator : Accelerator {
    override fun canMove(): Boolean {
        return (0..MAX_RANDOM_NUMBER).random() > MOVE_CONDITION_NUMBER
    }

    companion object {
        private const val MAX_RANDOM_NUMBER = 9
        private const val MOVE_CONDITION_NUMBER = 4
    }
}
