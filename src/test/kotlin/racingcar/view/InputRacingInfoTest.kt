package racingcar.view

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

internal class InputRacingInfoTest {

    @Test
    fun `입력 받은 값이 숫자가 아닐때`() {
        // given
        val value = "one"
        // than
        assertThatThrownBy { InputRacingInfo().validateNumber(value) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("입력받은 $value 은 숫자가 아닙니다, 숫자를 입력해주세요.")
    }
}
