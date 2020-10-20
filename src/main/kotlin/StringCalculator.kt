class StringCalculator {
    fun calculate(splitList: List<String>): Int {
        var resultNum = splitList[0].toInt()
        for (i in 1 until splitList.size step 2) {
            val operator = splitList[i]
            val numString = splitList[i+1]
            when (operator) {
                "+" -> { resultNum += numString.toInt() }
                "-" -> { resultNum -= numString.toInt() }
                "*" -> { resultNum *= numString.toInt() }
                "/" -> { resultNum /= numString.toInt() }
            }
        }
        return resultNum
    }
}


