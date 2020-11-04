package racingcar

object RaceRule {
    private val randomRange = IntRange(0, 9)
    private const val RULE_NUMBER = 4

    fun checkIfCarRun(): Boolean {
        val randomNum = randomRange.random()
        return randomNum >= RULE_NUMBER
    }
}
