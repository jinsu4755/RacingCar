package racingcar

class RacingCarTracks {
    private val racingCarsOnTheTrack: MutableList<Car> = mutableListOf()

    fun prepareForRacingTrack(numberOfCar: Int) {
        for (i in 0 until numberOfCar) {
            val car = Car()
            racingCarsOnTheTrack.add(car)
        }
    }

    fun getRacingCarsOnTheTrack(): List<Car> {
        return racingCarsOnTheTrack.toList()
    }
}
