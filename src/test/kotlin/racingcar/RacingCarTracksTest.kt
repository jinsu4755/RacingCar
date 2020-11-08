package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RacingCarTracksTest {

    @Test
    fun `자동차 트렉이 준비가 잘 되는지 확인`() {
        // given
        val numberOfTrack = 3
        // when
        val racingTrack = RacingCarTracks()
        racingTrack.prepareForRacingTrack(numberOfTrack)
        val preparedTrack = racingTrack.getRacingCarsOnTheTrack()
        // than
        assertThat(preparedTrack.size)
            .isEqualTo(3)
    }

    @Test
    fun `리스트 내부에 Car 클래스가 잘 들어간지 확인`() {
        // given
        val numberOfTrack = 3
        // when
        val racingTrack = RacingCarTracks()
        racingTrack.prepareForRacingTrack(numberOfTrack)
        val preparedTrack = racingTrack.getRacingCarsOnTheTrack()
        // than
        assertThat(preparedTrack[0]::class.java)
            .isEqualTo(Car::class.java)
    }
}
