class StringCalculator {
    fun calculate(keyboardInputString: String): Int {
        val splitList = keyboardInputString.split(" ")
        CalculateChecker().checkCalculable(splitList)
        var resultNum = splitList[0].toInt()
        for (i in 1 until splitList.size step 2) {
            when (splitList[i]) {
                "+" -> {
                    resultNum += splitList[i + 1].toInt()
                }
                "-" -> {
                    resultNum -= splitList[i + 1].toInt()
                }
                "*" -> {
                    resultNum *= splitList[i + 1].toInt()
                }
                "/" -> {
                    resultNum /= splitList[i + 1].toInt()
                }
            }
        }
        return resultNum
    }
}


