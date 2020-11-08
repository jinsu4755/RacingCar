package racingCar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarTest {
    @DisplayName("랜덤값이 모두 조건을 만족할 때 차가 움직이는지 테스트")
    @Test
    fun moveSuccessTest() {
        val car = Car(
            "testCar",
            object : Accelerator {
                override fun canMove(): Boolean {
                    return true
                }
            }
        )
        repeat(3) { car.move() }
        assertThat(car.getDistance()).isEqualTo(3)
    }

    @DisplayName("랜덤값이 모두 조건을 만족하지 못할 때 차가 움직이는지 테스트")
    @Test
    fun moveFailTest() {
        val car = Car(
            "testCar",
            object : Accelerator {
                override fun canMove(): Boolean {
                    return false
                }
            }
        )
        repeat(5) { car.move() }
        assertThat(car.getDistance()).isEqualTo(0)
    }
}
