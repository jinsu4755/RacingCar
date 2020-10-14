import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestCode {
    @Test
    fun simpleTest() {
        val num = 3
        assert(num == 2)
    }

    @Test
    fun simpleTestWithJupiter() {
        assertThat(3 + 5).isEqualTo(8)
    }

    @Test
    fun personTest() {
        val person1 = Person("채원", 22)
        person1.changeNameTo("짱졸귀챙챙이")

        assertThat(person1.name).isEqualTo("채원")
    }

    @Test
    fun personSumTest() {
        val person1 = Person(" ", 1000)
        val list = (1..10).toList()
        val sum = person1.sumList(list)

        assertThat(sum).isEqualTo(55)
    }
}
