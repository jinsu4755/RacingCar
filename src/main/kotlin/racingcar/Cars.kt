package racingcar

class Cars(carNum: Int) {
    private val carList = mutableListOf<Car>()

    init {
        createCar(carNum)
    }

    private fun createCar(carNum: Int) {
        for (i in 0 until carNum) {
            carList.add(Car())
        }
    }

    fun run(carIndex: Int) {
        carList[carIndex].run()
    }

    fun getDistanceGraph(): String {
        var distanceGraph = ""
        carList.forEach { car ->
            distanceGraph = distanceGraph + car.getDistanceGraph() + NEW_LINE
        }
        return distanceGraph
    }

    companion object {
        private const val NEW_LINE = "\n"
    }
}
