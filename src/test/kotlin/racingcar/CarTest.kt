package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun `달리기 함수 테스트`() {
        // given
        val car = Car()
        // when
        car.run()
        // then
        assertThat(car.getDistanceGraph())
            .isEqualTo("-")
    }

    @Test
    fun `출력 함수 테스트`() {
        // given
        val car = Car()
        // when
        car.run()
        car.run()
        car.run()
        car.run()
        // then
        assertThat(car.getDistanceGraph())
            .isEqualTo("----")
    }
}
