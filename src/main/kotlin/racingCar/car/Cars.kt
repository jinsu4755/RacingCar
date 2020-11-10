package racingCar.car

import racingCar.record.CapturedCar
import racingCar.record.CarsRecord

class Cars(private val cars: List<Car>) {
    fun move() {
        cars.forEach { car ->
            car.move()
        }
    }

    fun capture(): CarsRecord {
        val carsRecord = mutableListOf<CapturedCar>()
        cars.forEach { car ->
            carsRecord.add(CapturedCar(car.name, car.distance))
        }
        return CarsRecord(carsRecord)
    }
}
