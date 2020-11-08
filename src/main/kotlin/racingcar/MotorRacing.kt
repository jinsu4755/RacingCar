package racingcar

class MotorRacing(namesOfCar: MutableList<String>, numberOfAttempts: Int) {
    private val racingCars = mutableListOf<RacingCar>()

    init {
        for (index in 0 until namesOfCar.size) {
            racingCars.add(
                RacingCar(
                    namesOfCar[index],
                    numberOfAttempts,
                    object : MovingCondition {
                        override fun satisfy() = RandomNumberGenerator.get(MAX_NUMBER + 1) > MOVE_FLAG
                    }
                )
            )
        }
        carRacing()
    }

    private fun carRacing() {
        for (racingCar in racingCars) {
            racingCar.moveCar()
        }
    }

    fun getResultOfCarList(): MutableList<RacingCar> {
        val copyCarList = mutableListOf<RacingCar>()
        copyCarList.addAll(racingCars)
        return copyCarList
    }

    companion object {
        private const val MOVE_FLAG = 4
        private const val MAX_NUMBER = 9
    }
}
