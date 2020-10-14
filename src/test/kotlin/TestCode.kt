import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestCode {
    // test는 test폴더에 만들뿐이다.
    // Test를 하려면 어노테이션을 사용해야한다.
    @Test
    fun simpleTest() {
        val num = 3
        assert(num == 3) // junit의 사용법.

        assertThat(3 + 5).isEqualTo(8) // 가독성이 더 좋은 assertj 사용법. 3+5를 해보고 이게 8이냐?
    }

    /* @Test
    fun personSumTest(){
        val person = Person("jinsu",333)
        val sum = person.sumList() //처음에는 실패하도록 테스트에서 먼저 생각하고 만들도록한다.

        assertThat(sum).isEqualTo(9)
    }*/

    // 한번의 테스트코드를 만듦으로 아무리 person을 바꾸어도 해당 테스트가 통과한다면 해당 테스트만 돌아가면 person은 성공! 이런 느낌

    @Test
    fun personSumTest() {
        val person = Person("jinsu", 333)
        val list = (1..10).toList()
        val sum = person.sumList(list)

        assertThat(sum).isEqualTo(55)
    }
}
