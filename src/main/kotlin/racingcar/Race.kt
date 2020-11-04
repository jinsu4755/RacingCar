package racingcar

import racingcar.view.RaceGraph

class Race(private val cars: Cars, private val raceRound: Int) {
    fun start(): RaceGraph {
        val raceGraph = RaceGraph()
        repeat(raceRound) {
            cars.run()
            raceGraph.record(cars)
        }
        return raceGraph
    }
}
