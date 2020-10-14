import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestCode {

    @Test
    fun simpleTest() {
        assertThat(3 + 5).isEqualTo(8)
    }

    @Test
    fun PersonTest() {
        val person1 = Person("평화", 25)
        person1.changeName("Peace")

        assertThat(person1.name).isEqualTo("Peace")
    }

    @Test
    fun personSumTest() {
        val person = Person("", 123)
        val list = (1..10).toList()
        val sum = person.sumList(list)

        assertThat(sum).isEqualTo(55)
    }
}
