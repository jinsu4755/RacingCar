package racingCar

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import racingCar.view.SplitString
import java.lang.IllegalArgumentException

class SplitStringTest {
    @DisplayName("5글자 이상의 이름을 넣었을 때 오류가 나는지 테스트")
    @Test
    fun checkNameTest() {
        val name = "chaewon"
        Assertions.assertThatThrownBy { SplitString.getSplitNames(name) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}
