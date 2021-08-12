package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegisterCarInRacingFactoryTest {
    @Test
    fun `자동차 이름 입력 만큼 생성되는지 확인하는 테스트`() {
        // given
        val carNames = listOf("a", "b")
        val participatingCars = RegisterCarInRacingFactory.registerRacingParticipationCars(carNames)
        // than
        assertThat(participatingCars.raceStatus().size).isEqualTo(carNames.size)
    }
}
