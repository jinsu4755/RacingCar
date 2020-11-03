package racingCar

class Cars(
    private val cars: List<Car>
) {

    private fun isSatisfiedForwardCondition(number: Int): Boolean {
        return number >= 4
    }

    private fun getRandomNumber(): Int {
        return (0 until 10).random()
    }

    fun forwardCars() {
        cars.forEach { car ->
            if (isSatisfiedForwardCondition(getRandomNumber()))
                car.forward()
        }
    }

    fun printCarsState() {
        cars.forEach { car ->
            val distance = car.getDistance()
            println("-".repeat(distance))
        }
    }
}
