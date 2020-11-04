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

    fun run(carIndex: Int) {
        carList[carIndex].run()
    }

    fun getCars(): List<Car> = carList.toList()

    fun size() = carList.size
}
