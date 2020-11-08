package racingcar

object RaceRule {
    private val RANDOM_RANGE = IntRange(0, 9)
    const val RULE_NUMBER = 4

    fun getRandomNum() = RANDOM_RANGE.random()
}
