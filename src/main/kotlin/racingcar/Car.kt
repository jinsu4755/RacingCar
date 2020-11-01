package racingcar

class Car {
    private var distanceGraph: String = ""

    fun run() {
        if (RaceRule.checkIfCarRun()) {
            distanceGraph += ONE_DISTANCE
        }
    }

    fun getDistanceGraph() = distanceGraph

    companion object {
        const val ONE_DISTANCE = "-"
    }
}
