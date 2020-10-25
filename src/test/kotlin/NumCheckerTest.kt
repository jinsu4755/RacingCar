import org.assertj.core.api.AssertionsForClassTypes
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class NumCheckerTest {
    @Test
    fun checkNumTest() {
        AssertionsForClassTypes.assertThatThrownBy { NumChecker().checkNum("e") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("해당 문자는 숫자로 변환할 수 없습니다.")
    }
}
