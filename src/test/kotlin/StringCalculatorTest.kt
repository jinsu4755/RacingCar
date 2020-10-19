import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

class StringCalculatorTest {
    @Test
    fun calculateTest() {
        assertThat(StringCalculator().calculate("1 + 8 / 3 * 2 - 1"))
            .isEqualTo(5)
    }
}