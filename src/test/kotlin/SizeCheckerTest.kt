import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.AssertionsForClassTypes
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class SizeCheckerTest {

    @Test
    fun checkSizeTest() {
        assertThatThrownBy { SizeChecker().checkSize(listOf("1", "*")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("계산 식이 아닙니다.")
    }
}
