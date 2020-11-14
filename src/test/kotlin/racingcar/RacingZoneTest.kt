package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RacingZoneTest {
    @DisplayName("레이스 한 결과를 반환")
    @Test
    fun startRaceAndGetResultTest() {
        //given
        val racingZone = RacingZone()
        val carList = mutableListOf(RacingCar("A"), RacingCar("B"))
        val numOfTry = 2
        //when

        //then
        assertThat(
            racingZone.startRaceAndGetResult(carList, numOfTry, CarMover())
                    [0].first
        ).isEqualTo("A")
    }
}