package racingCar

class RaceGame {
    private lateinit var raceResults: MutableList<Map<String, Int>>

    fun race(cars: Cars, raceCount: Int) {
        raceResults = mutableListOf()
        repeat(raceCount) {
            cars.move()
            raceResults.add(cars.getDistance())
        }
    }

    fun getGameResult(): List<Map<String, Int>> {
        return raceResults
    }

    fun getGameWinner(): Set<String> {
        var lastRace = raceResults[raceResults.size - 1]
        val maxDistance = lastRace.maxByOrNull { it.value }!!.value
        return lastRace.filterValues { distance -> distance == maxDistance }.keys
    }
}
