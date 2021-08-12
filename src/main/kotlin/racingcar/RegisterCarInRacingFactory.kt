package racingcar

object RegisterCarInRacingFactory {
    fun registerRacingParticipationCars(registeredNames: List<String>): RacingParticipatingCars {
        return RacingParticipatingCars(
            registeredNames.map { name -> Car(name, RacingCarMoveController()) }
        )
    }
}
