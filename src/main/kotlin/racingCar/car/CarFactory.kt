package racingCar.car

object CarFactory {
    fun create(carNames: List<String>): Cars {
        val cars = mutableListOf<Car>()
        carNames.forEach { name ->
            cars.add(Car(name, RandomAccelerator()))
        }
        return Cars(cars)
    }
}
