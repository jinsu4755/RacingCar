package racingcar

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class RacingCarTest {

    @ParameterizedTest
    @CsvSource("1, 1", "2, 2", "3, 3", "4, 4", "5, 5")
    fun `무조건 한 칸 전진`(step: Int, expectation: Int) {
        val myCar = RacingCar("붕붕이", step) { true }
        myCar.moveCar()
        Assertions.assertThat(myCar.getResultOfMoving().count { it } == expectation)
    }

    @ParameterizedTest
    @CsvSource("1, 0", "2, 0", "3, 0", "4, 0", "5, 0")
    fun `무조건 안 움직임`(step: Int, expectation: Int) {
        val myCar = RacingCar("붕붕이", step) { false }
        myCar.moveCar()
        Assertions.assertThat(myCar.getResultOfMoving().count { it } == expectation)
    }
}
