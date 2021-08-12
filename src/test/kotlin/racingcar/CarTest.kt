package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.lang.IllegalArgumentException

class CarTest {
    @ParameterizedTest
    @CsvSource("5", "7")
    fun `달리기 함수 테스트`(distance: Int) {
        // given
        val car = Car(object : Checker {
            override fun checkIfRun(): Boolean {
                return true
            }
        })
        // when
        car.run(distance)
        // then
        assertThat(car.distance).isEqualTo(distance)
    }

    @ParameterizedTest
    @CsvSource("Christopher", "Alexandria")
    fun `이름이 다섯자 넘었을 때 예외던지는지 테스트`(carName: String) {
        // given
        val carChecker = object : Checker {
            override fun checkIfRun(): Boolean {
                return true
            }
        }

        // then
        assertThatThrownBy { Car(carName, carChecker) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("자동차의 이름은 5자 이하여야 합니다. 잘못된 자동차 이름: $carName")
    }
}
