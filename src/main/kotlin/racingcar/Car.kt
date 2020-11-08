package racingcar

class Car(
    val name: String,
    private val moveController: MoveController
) {
    init {
        validateCarName(name)
    }

    var movementDistance: Int = 0
        private set

    private fun validateCarName(carName: String) {
        require(name.length <= MAX_CAR_LENGTH) {
            throw IllegalArgumentException("자동차 이름으로 ${MAX_CAR_LENGTH}자를 넘길 수 없습니다. $carName 은/는 ${carName.length} 글자 입니다.")
        }
    }

    fun move() {
        if (moveController.movableStatus()) {
            movementDistance++
        }
    }

    companion object {
        const val MAX_CAR_LENGTH = 5
    }
}
