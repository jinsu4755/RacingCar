package racingcar

class Race(private val cars: Cars, private val raceRound: Int) {
    fun start(): RaceGraph {
        val raceGraph = RaceGraph()
        repeat(raceRound) {
            runCars(cars)
            raceGraph.draw(cars)
        }
        return raceGraph
    }

    private fun runCars(cars: Cars) {
        repeat(cars.size()) { carIndex ->
            cars.run(carIndex)
        }
    }
}
