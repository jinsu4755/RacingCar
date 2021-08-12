package racingcar.view

class ResultView {
    fun showResult(result: List<Pair<String, Int>>, numOfCar: Int) {
        val resultPerOneCycle = result.chunked(numOfCar)
        for (i in resultPerOneCycle.indices) {
            printOneCycle(resultPerOneCycle[i])
            print(LINE_SPACE)
        }
    }

    private fun printOneCycle(resultPerOneCycle: List<Pair<String, Int>>) {
        for (i in resultPerOneCycle.indices) {
            val carName = resultPerOneCycle[i].first
            val carStepNum = resultPerOneCycle[i].second
            val carStep = getCarStep(carStepNum)
            println("$carName : $carStep")
        }
    }

    private fun getCarStep(carStepNum: Int): String {
        var carStep = ""
        for (i in 1..carStepNum) {
            carStep += "-"
        }
        return carStep
    }

    companion object {
        const val LINE_SPACE = "\n"
    }
}
