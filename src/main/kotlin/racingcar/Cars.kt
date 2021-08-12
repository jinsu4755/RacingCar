package racingcar

class Cars() {
    private val carList = mutableListOf<Car>()

    fun add(car: Car) {
        carList.add(car)
    }

    fun run() {
        carList.forEach { car ->
            car.run()
        }
    }

    fun get(): List<Car> = carList.toList()
}
