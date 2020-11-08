package racingCar

class RaceGame {
    private lateinit var raceResults: MutableList<List<Int>>

    fun race(cars: Cars, raceCount: Int) {
        raceResults = mutableListOf()
        repeat(raceCount) {
            cars.move()
            raceResults.add(cars.getDistance())
        }
    }

    fun getGameResult(): List<List<Int>> {
        return raceResults
    }
}
