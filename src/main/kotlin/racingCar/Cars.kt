package racingCar

class Cars(
    private val cars: List<Car>
) {
    fun move() {
        cars.forEach { car ->
            car.move()
        }
    }

    fun getDistance(): Map<String, Int> {
        val distanceOfCars = mutableMapOf<String, Int>()
        cars.forEach { car ->
            distanceOfCars[car.getName()] = car.getDistance()
        }
        return distanceOfCars
    }
}
