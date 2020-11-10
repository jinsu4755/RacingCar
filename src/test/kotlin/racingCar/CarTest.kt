package racingCar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import racingCar.car.Accelerator
import racingCar.car.Car

class CarTest {
    @DisplayName("조건에 따라서 차가 움직이는지 테스트")
    @ParameterizedTest
    @CsvSource("true,3", "false,0")
    fun moveSuccessTest(canMove: Boolean, moveCount: Int) {
        val car = Car(
            "testCar",
            object : Accelerator {
                override fun canMove(): Boolean {
                    return canMove
                }
            }
        )
        car.move()
        car.move()
        car.move()
        assertThat(car.getDistance()).isEqualTo(moveCount)
    }
}
