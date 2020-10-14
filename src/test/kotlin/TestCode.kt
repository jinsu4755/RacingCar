import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestCode {

    @Test
    fun simpleTest() {
        assertThat(3 + 5).isEqualTo(8)
    }

    @Test
    fun personTest() {
        val myPerson = Person("이현우", 24)
        assertThat(myPerson.name).isEqualTo("이현우")

        myPerson.changeNameTo("최호준")
        assertThat(myPerson.name).isEqualTo("이현우")
        assertThat(myPerson.name).isEqualTo("최호준")
    }

    @Test
    fun personSumTest() {
        val person = Person("", 23232)
        val list = (1..10).toList()
        val sum = person.sumList(list)

        assertThat(sum).isEqualTo(55)
    }
}