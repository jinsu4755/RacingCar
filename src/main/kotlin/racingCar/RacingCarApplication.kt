package racingCar

import racingCar.view.getNumberOfCar
import racingCar.view.getNumberOfTry

fun main() {
    val numberOfCar = getNumberOfCar()
    val numberOfTry = getNumberOfTry()
    val cars = makeCars(numberOfCar)
    val racingCar = RacingCar(cars, numberOfTry)
    println("실행결과")
    racingCar.race()
}

fun makeCars(numberOfCar: Int): Cars {
    val cars = mutableListOf<Car>()
    repeat(numberOfCar) {
        cars.add(Car())
    }
    return Cars(cars)
}
