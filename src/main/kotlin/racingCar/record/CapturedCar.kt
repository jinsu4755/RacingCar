package racingCar.record

class CapturedCar(
    val name: String,
    var distance: Int
) {
    override fun toString(): String {
        return name
    }
}
