package racingcar

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.util.stream.Stream
import kotlin.random.Random

internal class CarTest {

    @ParameterizedTest
    @CsvSource("0", "1", "2", "3")
    fun carControlCaseMoveForward(controlNumber: Int) {
        // given
        val testCar = Car()
        val movementDistance = testCar.move()
    }

    @TestFactory
    fun `랜덤한 값이 4 이상이면 자동차가 움직이는지 확인`(): Stream<DynamicTest> {
        val car = Car()
        val inputGenerator = object : Iterator<Int> {
            var current = 0
            var distance = 0

            override fun hasNext(): Boolean {
                current = Random.nextInt(10)
                car.movingController(current)
                return current >= 4
            }

            override fun next(): Int {
                return ++distance
            }
        }
        val displayNameGenerator: (a: Int) -> String = { input -> "input:$input" }
        val testExecutor: (a: Int) -> Unit = { input ->
            assertTrue(car.getMovementDistance() == input)
        }

        return DynamicTest.stream(inputGenerator, displayNameGenerator, testExecutor)
    }
}
