package racingcar

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class InputValidationTest {
    @Test
    fun `입력값으로 0을 집어넣을 경우`() {
        val given = 0
        Assertions.assertThatThrownBy { InputValidation.validateAmountInput(given) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("입력값은 0이 될 수 없습니다.")
    }

    @Test
    fun `입력값으로 음수 집어넣를을 경우`() {
        val given = -3
        Assertions.assertThatThrownBy { InputValidation.validateAmountInput(given) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("음수를 입력하면 안됩니다.")
    }
}
