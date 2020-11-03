package racingCar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarTest {
    @DisplayName("전진했을때 거리가 증가하는지 테스트")
    @Test
    fun forwardTest() {
        val car = Car()
        repeat(3) { car.forward() }
        assertThat(car.getDistance()).isEqualTo(3)
    }
}
