import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestCode {
    @Test
    fun simpleTest() {
        assertThat(3 + 5).isEqualTo(8)
    }

    @Test
    fun personTest() {
        val person1 = Person("수현", 24)
        person1.changeNameTo("RoadtoS7")
        assertThat(person1.name).isEqualTo("수현")
    }

    @Test
    fun personSumTest(){
        val person = Person("", 12345)
        val list = (1..10).toList()
        val sum = person.sumList(list)
        assertThat(sum).isEqualTo(55)
    }
}