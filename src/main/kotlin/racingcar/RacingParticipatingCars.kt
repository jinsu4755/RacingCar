package racingcar

class RacingParticipatingCars(
    private val participatingCars: List<Car>
) {
    fun oneCycleOfRace() {
        participatingCars.forEach { it.move() }
    }

    fun raceStatus(): List<Car> {
        return participatingCars
    }

    fun getRacingWinner(): List<String> {
        val mostMovingDistance = findMostMovingDistanceOfCar()
        return participatingCars
            .filter { car -> car.movementDistance == mostMovingDistance }
            .map { car -> car.name }
    }

    private fun findMostMovingDistanceOfCar() = participatingCars.map { car -> car.movementDistance }.maxOrNull()
}
