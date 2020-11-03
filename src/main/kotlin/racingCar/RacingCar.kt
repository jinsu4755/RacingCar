package racingCar

class RacingCar(
    private val cars: Cars,
    private val numberOfTry: Int,
) {
    fun race() {
        repeat(numberOfTry) {
            cars.forwardCars()
            cars.printCarsState()
            println()
        }
    }
}
