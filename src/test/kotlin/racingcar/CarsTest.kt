package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CarsTest {
    @ParameterizedTest
    @CsvSource("3")
    fun `자동차 추가하는 함수 체크`(carNum: Int) {
        // given
        val cars = Cars()

        // when
        repeat(carNum) {
            val car = Car(object : Checker {
                override fun checkIfRun() = true
            })
            cars.add(car)
        }

        // then
        assertThat(
            cars.get()
                .size
        ).isEqualTo(carNum)
    }

    @ParameterizedTest
    @CsvSource("5, 7")
    fun `자동차들의 달리기 함수 체크`(carNum: Int, runTime: Int) {
        // given
        val cars = Cars()

        // when
        repeat(carNum) {
            val car = Car(object : Checker {
                override fun checkIfRun() = true
            })
            car.run(runTime)
            cars.add(car)
        }

        val carsList = cars.get()

        // then

        carsList.forEach { car ->
            assertThat(car.distance)
                .isEqualTo(7)
        }
    }
}
