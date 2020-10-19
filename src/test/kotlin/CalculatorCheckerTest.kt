import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class CalculatorCheckerTest {
    @Test
    fun checkCalculableTest() {
        Assertions.assertThatThrownBy { CalculateChecker().checkCalculable(listOf("&")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("사칙 연산기호가 아닙니다.")
        Assertions.assertThatThrownBy { CalculateChecker().checkCalculable(listOf("1", "*", "/", "5")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("연산자")
    }
}