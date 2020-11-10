package racingCar.car

class Car(
    val name: String,
    private val accelerator: Accelerator
) {
    var distance = 0
        private set

    fun move() {
        if (accelerator.canMove())
            distance++
    }
}
