class StringCalculator {
    fun calculate(splitList: List<String>): Int {
        val numChecker = NumChecker()
        val firstString = splitList[0]
        var accumulateNum = numChecker.checkNum(firstString)
        for (i in 1 until splitList.size step 2) {
            val operator = splitList[i]
            val numString = splitList[i + 1]
            accumulateNum = Operator.findBySymbol(operator)
                .calculateStrategy(
                    accumulateNum,
                    numChecker.checkNum(numString)
                )
        }
        return accumulateNum
    }
}
