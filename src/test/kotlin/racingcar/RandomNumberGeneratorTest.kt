package racingcar

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class RandomNumberGeneratorTest {
    @Test
    fun `주어진 범위 내에서 랜덤값이 잘 추출되는 지 확인`() {
        val max = 12

        val givenRandom = RandomNumberGenerator.get(max + 1)
        Assertions.assertThat((0..max+1).contains(givenRandom))
    }
}
