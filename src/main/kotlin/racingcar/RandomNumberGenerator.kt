package racingcar

import java.util.Random

class RandomNumberGenerator {
    private val randomNumberGenerator = Random()

    fun sendRandomNumber(): Int {
        return randomNumberGenerator.nextInt(MAX_NUMBER + 1)
    }

    companion object {
        private const val MAX_NUMBER = 9
    }
}
