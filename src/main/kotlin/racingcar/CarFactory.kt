package racingcar

class CarFactory {
    fun makeCars(carsWithName: List<String>): List<RacingCar> {
        val racingCars = mutableListOf<RacingCar>()
        repeat(carsWithName.size) {
            val racingCar = RacingCar(carsWithName[it])
            racingCars.add(racingCar)
        }
        return racingCars
    }
}
