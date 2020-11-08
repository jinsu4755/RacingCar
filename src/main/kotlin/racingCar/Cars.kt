package racingCar

class Cars(
    private val cars: List<Car>
) {
    fun move() {
        cars.forEach { car ->
            car.move()
        }
    }

    fun getDistance(): List<Int> {
        val distanceOfCars = mutableListOf<Int>()
        cars.forEach { car ->
            distanceOfCars.add(car.getDistance())
        }
        return distanceOfCars
    }
}
