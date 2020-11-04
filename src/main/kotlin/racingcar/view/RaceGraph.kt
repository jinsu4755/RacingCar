package racingcar.view

import racingcar.Cars

class RaceGraph {
    private var raceGraph = ""

    fun record(cars: Cars) {
        val carList = cars.getCars()
        for (car in carList) {
            var carDistance = ""
            repeat(car.getDistance()) {
                carDistance += ONE_DISTANCE_GRAPH
            }
            raceGraph = raceGraph + carDistance + NEW_LINE
        }
        raceGraph += NEW_LINE
    }

    fun getFinalGraph(): String {
        val finalGraph = raceGraph
        raceGraph = ""
        return finalGraph
    }

    companion object {
        private const val ONE_DISTANCE_GRAPH = "-"
        private const val NEW_LINE = "\n"
    }
}
