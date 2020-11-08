package racingcar

object Race {
    fun start(cars: Cars, raceRound: Int): RaceRecord {
        val raceRecord = RaceRecord()
        repeat(raceRound) {
            cars.run()
            val roundRecord = RoundRecord()
            roundRecord.record(cars)
            raceRecord.add(roundRecord)
        }
        return raceRecord
    }
}
