package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RacingParticipatingCarsTest {
    @Test
    fun `참가 자동차들의 각 결과마다의 승자가 잘 뽑히는지 확인`() {
        // given
        val testCars = listOf(
            Car("1") { true },
            Car("2") { false },
        )
        // when
        val racingParticipatingCars = RacingParticipatingCars(testCars)
        // than
        assertThat(racingParticipatingCars.getRacingWinner()[0]).isEqualTo(testCars[0].name)
    }
}
