package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarFactoryTest {
    @Test
    fun makeCarsTest() {
        // given
        val carFactory = CarFactory()
        val carsWithName = listOf("a", "b", "c")
        // when

        // then
        assertThat(carFactory.makeCars(carsWithName).size).isEqualTo(3)
    }
}