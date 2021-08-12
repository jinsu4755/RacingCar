package racingcar

class RaceRecord {
    private val roundsRecord = mutableListOf<RoundRecord>()

    fun add(roundRecord: RoundRecord) {
        roundsRecord.add(roundRecord)
    }

    fun get() = roundsRecord.toList()

    fun getWinCarRecords(): List<CarRecord> {
        val lastRoundRecord = roundsRecord.last()
        val carRecords = lastRoundRecord.get()
        var winCarRecords = mutableListOf<CarRecord>()
        var maxDistance = -1
        carRecords.forEach { carRecord ->
            if (maxDistance < carRecord.distance) {
                maxDistance = carRecord.distance
                winCarRecords.removeAll(carRecords)
            }
            if (maxDistance == carRecord.distance) {
                winCarRecords.add(carRecord)
            }
        }
        return winCarRecords
    }
}

class RoundRecord {
    private val roundRecord = mutableListOf<CarRecord>()

    fun record(cars: Cars) {
        val carList = cars.get()
        carList.forEach { car ->
            val carRecord = CarRecord(car)
            roundRecord.add(carRecord)
        }
    }

    fun get() = roundRecord.toList()
}

data class CarRecord(
    val carName: String,
    val distance: Int
) {
    constructor(car: Car) : this(car.name, car.distance)
}
