package racingcar

import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun `레이스 시작 함수가 정해진 형식대로 출력이 되는지 확인`() {
        // given
        val race = Race(3, 5)
        // when
        val result = race.start()
        // then
        print(result)
    }
}
