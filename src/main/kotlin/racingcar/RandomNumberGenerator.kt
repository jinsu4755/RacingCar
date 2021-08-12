package racingcar

import java.util.Random

object RandomNumberGenerator {
    private val randomNumberGenerator = Random()

    fun get(max: Int): Int {
        return randomNumberGenerator.nextInt(max)
    }
}
