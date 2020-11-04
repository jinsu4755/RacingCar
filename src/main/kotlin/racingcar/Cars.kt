package racingcar

class Cars(carNum: Int) {
    private val carList = mutableListOf<Car>()

    init {
        createCar(carNum)
    }

    private fun createCar(carNum: Int) {
        repeat(carNum) {
            carList.add(Car())
        }
    }

    fun run() {
        carList.forEach { car ->
            car.run()
        }
    }

    fun getCars(): List<Car> = carList.toList()
}
