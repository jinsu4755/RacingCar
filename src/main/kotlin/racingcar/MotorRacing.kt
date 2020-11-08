package racingcar

class MotorRacing(amountOfCars: Int, numberOfAttempts: Int) {
    private val racingCars = mutableListOf<RacingCar>()

    init {
        for (index in 0 until amountOfCars) {
            racingCars.add(RacingCar(numberOfAttempts))
        }
        carRacing()
    }

    private fun carRacing() {
        for (racingCar in racingCars) {
            racingCar.moveCar()
        }
    }

    fun getResultOfRacing(): MutableList<MutableList<Boolean>> {
        val resultOfRacingCars = mutableListOf<MutableList<Boolean>>()
        for (racingCar in racingCars)
            resultOfRacingCars.add(racingCar.getResultOfMoving())
        return resultOfRacingCars
    }
}
