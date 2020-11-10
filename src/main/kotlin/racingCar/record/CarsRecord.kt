package racingCar.record

import kotlin.math.max

class CarsRecord(val carsRecord: List<CapturedCar>) {
    fun getMaxDistanceCars(): List<CapturedCar> {
        val max = findMaxDistance()
        return carsRecord.filter { capturedCar -> capturedCar.distance == max }
    }

    private fun findMaxDistance(): Int {
        var max = 0
        carsRecord.forEach { capturedCar ->
            max = max(capturedCar.distance, max)
        }
        return max
    }
}
