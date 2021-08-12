package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class CarTest {

    @ParameterizedTest
    @CsvSource("true,1", "false,0")
    fun `움직이는 조건이 맞으면 자동차가 움직이는지 테스트`(movableStatus: Boolean, changedDistance: Int) {
        // given
        val car = Car("12345") { movableStatus }
        // when
        car.move()
        // than
        assertThat(car.movementDistance).isEqualTo(changedDistance)
    }

    @Test
    fun `자동차 이름이 5자를 초과하면 Exception 이 뜨는지 확인`() {
        // given
        val carName = "123456"
        // than
        assertThatThrownBy { Car(carName, RacingCarMoveController()) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("자동차 이름으로 ${Car.MAX_CAR_LENGTH}자를 넘길 수 없습니다. $carName 은/는 ${carName.length} 글자 입니다.")
    }
}
