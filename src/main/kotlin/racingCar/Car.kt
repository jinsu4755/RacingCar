package racingCar

class Car {
    private var distance = 0
    fun getDistance(): Int = distance
    fun forward() = distance++
}
