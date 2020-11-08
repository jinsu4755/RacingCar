package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RaceRecordTest {
    @ParameterizedTest
    @CsvSource("3, 5")
    fun `RoundRecord의 record함수 테스트`(carNum: Int, round: Int) {
        // given
        val cars = Cars()
        val expectedRoundRecord = mutableListOf<CarRecord>()
        repeat(carNum) {
            expectedRoundRecord.add(CarRecord("", round))
        }

        val roundRecord = RoundRecord()
        repeat(carNum) {
            val car = Car(object : Checker {
                override fun checkIfRun() = true
            })
            car.run(round)
            cars.add(car)
        }

        // when
        roundRecord.record(cars)
        val carRecords = roundRecord.get()

        // then
        assertThat(carRecords)
            .isEqualTo(
                expectedRoundRecord.toList()
            )
    }

    @ParameterizedTest
    @CsvSource("2, 5, b")
    fun `RaceRecord의 승자반환 함수 테스트`(firstCarDistance: Int, secondCarDistance: Int, winCar: String) {
        // given
        val firstCar = Car(
            "a",
            object : Checker {
                override fun checkIfRun() = true
            }
        )
        firstCar.run(firstCarDistance)

        val secondCar = Car(
            "b",
            object : Checker {
                override fun checkIfRun() = true
            }
        )
        secondCar.run(secondCarDistance)

        val cars = Cars()
            .also {
                it.add(firstCar)
                it.add(secondCar)
            }

        val roundRecord = RoundRecord()
        roundRecord.record(cars)
        val raceRecord = RaceRecord()
        raceRecord.add(roundRecord)

        // then
        val winCars = raceRecord.getWinCarRecords()
        val winCarName = winCars.last()
            .carName
        // then
        assertThat(winCarName).isEqualTo(winCar)
    }
}
