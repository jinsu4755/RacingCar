import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTestCode {
    // test가 tdd는 아니다! tdd는 개발 방법론중 하나다!
    @Test
    fun personTest() {
        val person = Person("jinsu", 22)
        person.changeNameTo("jinsu4755")
        assertThat(person.name).isEqualTo("jinsu4755")
    }
}
