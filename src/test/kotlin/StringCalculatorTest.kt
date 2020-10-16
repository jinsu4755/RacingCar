import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.junit.platform.commons.util.StringUtils
import java.lang.IllegalArgumentException

class StringCalculatorTest {
    /**
     * 공백 검사 제대로 작동?
     * 사칙연산 외 기호 예외처리 작동?
     * 올바른 값 변환?
     */
    @Test
    fun sumTest(){
        assertThat(1+2).isEqualTo(3)
    }

    @Test
    fun minusTest(){
        assertThat(3-2).isEqualTo(1)
    }

    @Test
    fun multiplyTest(){
        assertThat(3*2).isEqualTo(6)
    }

    @Test
    fun divideTest(){
        assertThat(6/2).isEqualTo(3)
    }

    @Test
    fun checkCalculableTest() {
        assertThatThrownBy {
            checkCalculatable(listOf("&"))
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("사칙연산 기호 쓰셔야 합니다!!!")
    }

    @Test
    fun calculateTest() {

    }

    // 연습용
    @ParameterizedTest
    @ValueSource(strings = ["", " "])
    fun isBlank_ShouldReturnTrueForNullOrBlankStrings(input: String) {
        assertTrue(StringUtils.isBlank(input))
    }
}