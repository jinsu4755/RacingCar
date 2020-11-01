package racingcar

class Race(private val carNum: Int, private val raceNum: Int) {
    fun start(): String {
        val cars = Cars(carNum)
        var fullRecord = ""
        for (i in 0 until raceNum) {
            runCars(cars)
            fullRecord = fullRecord + cars.getDistanceGraph() + NEW_LINE
        }
        return fullRecord
    }

    private fun runCars(cars: Cars) {
        for (carIndex in 0 until carNum) {
            if (RaceRule.checkIfCarRun()) {
                cars.run(carIndex)
            }
        }
    }

    companion object {
        private const val NEW_LINE = "\n"
    }
}
