package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarMoverTest {
    @Test
    fun canMoveTest() {
        // given
        val carMover = CarMover()
        // when
        val randomNum = carMover.canMove()
        // then
        assertThat(randomNum).isLessThan(10)
        assertThat(randomNum).isGreaterThan(-1)
    }
}