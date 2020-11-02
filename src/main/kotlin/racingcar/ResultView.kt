package racingcar

class ResultView {
    companion object {
        const val NEWLINE_DELIMITER = "<------------------------------------------>"

        fun printResultOfMotorRacing(resultOfRacing: MutableList<MutableList<Boolean>>) {
            println("결과 발표")
            println(NEWLINE_DELIMITER)
            val carMovementStatus = convertBooleanDataToVisibleData(resultOfRacing)
            for (stage in carMovementStatus.indices) {
                printResultCorrespondingStage(carMovementStatus[stage])
                println(NEWLINE_DELIMITER)
            }
        }

        private fun convertBooleanDataToVisibleData(resultOfRacing: MutableList<MutableList<Boolean>>): MutableList<MutableList<String>> {
            val carMovementDataStorage = CarMovementStorage(resultOfRacing)
            return carMovementDataStorage.getCarMovementStringData()
        }

        private fun printResultCorrespondingStage(carMovementStatus: MutableList<String>) {
            for (singleCarMovement in carMovementStatus)
                println(singleCarMovement)
        }
    }
}
