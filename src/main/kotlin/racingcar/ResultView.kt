package racingcar

typealias CarStatus = Pair<MutableList<String>, MutableList<MutableList<Boolean>>>

class ResultView {
    companion object {
        const val NEWLINE_DELIMITER = "<------------------------------------------>"

        fun printCarListResult(resultOfRacing: MutableList<RacingCar>) {
            println("결과 발표")
            println(NEWLINE_DELIMITER)

            val attempts = resultOfRacing[0].getNumOfAttempts()
            val carName = getCarNameList(resultOfRacing)
            val resultList = getRacingResult(resultOfRacing)
            val pairCarString: CarStatus = Pair(carName, resultList)

            repeat(attempts) { stage ->
                printCarStageResult(pairCarString, stage)
                println(NEWLINE_DELIMITER)
            }
        }

        private fun printCarStageResult(resultOfRacing: CarStatus, stage: Int) {
            repeat(resultOfRacing.second.size) { car ->
                val subList = resultOfRacing.second[car].subList(0, stage + 1)
                print(resultOfRacing.first[car])
                print("\t")
                print("-".repeat(subList.count { it }))
                println("")
            }
        }

        private fun getCarNameList(resultOfRacing: MutableList<RacingCar>): MutableList<String> {
            val carNameList = mutableListOf<String>()
            for (car in resultOfRacing) {
                carNameList.add(car.getCarName())
            }
            return carNameList
        }

        private fun getRacingResult(resultOfRacing: MutableList<RacingCar>): MutableList<MutableList<Boolean>> {
            val resultList = mutableListOf<MutableList<Boolean>>()
            for (car in resultOfRacing) {
                resultList.add(car.getResultOfMoving())
            }
            return resultList
        }
    }
}
