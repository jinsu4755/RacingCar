import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class CalculatorCheckerTest {

    @Test
    fun checkCalculableTest() {
        assertThatThrownBy { CalculateChecker().checkCalculable(listOf("1", "*", "9", "/", "3", "*", "*")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("숫자가 입력되어야 합니다.")
        assertThatThrownBy { CalculateChecker().checkCalculable(listOf("1", "*", "9", "/", "3", "&", "7")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("사칙연산 기호만 입력할 수 있습니다.")
        assertThatThrownBy { CalculateChecker().checkCalculable(listOf("1", "*")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("계산 식이 아닙니다.")
    }

    @Test
    fun checkSizeTest() {
        assertThatThrownBy { CalculateChecker().checkSize(listOf("1", "*")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("계산 식이 아닙니다.")
    }

    @Test
    fun checkNumberTest() {
        assertThatThrownBy { CalculateChecker().checkNum("*") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("숫자가 입력되어야 합니다.")
    }

    @Test
    fun checkOperator() {
        assertThatThrownBy { CalculateChecker().checkOperator("&") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("사칙연산 기호만 입력할 수 있습니다.")
    }
}