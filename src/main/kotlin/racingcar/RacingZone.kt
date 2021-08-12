package racingcar

class RacingZone {

    private val resultOfRace = mutableListOf<Pair<String, Int>>()
    fun startRaceAndGetResult(carList: List<RacingCar>, numOfTry: Int, carMover: CarMover): List<Pair<String, Int>> {
        repeat(numOfTry) {
            runOneCycle(carList, carMover)
        }
        return resultOfRace
    }

    private fun runOneCycle(carList: List<RacingCar>, carMover: CarMover) {
        carList.forEach { racingCar ->
            racingCar.tryGoForward(carMover.canMove())
            val carName = racingCar.getCarName()
            val carStep = racingCar.carStep
            resultOfRace.add(Pair(carName, carStep))
        }
    }
}
