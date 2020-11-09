package racingcar

import java.lang.IllegalArgumentException

class CarMovementStorage(resultOfRacing: MutableList<MutableList<Boolean>>) {
    private val carMovement = mutableListOf<MutableList<String>>()

    init {
        for (stage in resultOfRacing[0].indices) {
            val racingStatusAtCorrespondingStage =
                makeRacingDataAtCorrespondingStage(resultOfRacing, stage)
            reflectMovementState(racingStatusAtCorrespondingStage, stage)
        }
    }

    private fun makeRacingDataAtCorrespondingStage(
        resultOfRacing: MutableList<MutableList<Boolean>>,
        stage: Int
    ): MutableList<Boolean> {
        val statusReport = mutableListOf<Boolean>()
        for (resultOfSingleCar in resultOfRacing) {
            statusReport.add(resultOfSingleCar[stage])
        }
        return statusReport
    }

    private fun reflectMovementState(
        racingStatusAtCorrespondingStage: MutableList<Boolean>,
        stage: Int
    ) {
        reflectLastStatus(racingStatusAtCorrespondingStage.size, stage)
        for (index in racingStatusAtCorrespondingStage.indices) {
            if (racingStatusAtCorrespondingStage[index]) carMovement[stage][index] += "-"
        }
    }

    private fun reflectLastStatus(amountOfCars: Int, stage: Int) {
        when {
            stage > 0 -> {
                val copyLastStatus = mutableListOf<String>()
                copyLastStatus.addAll(carMovement[stage - 1])
                carMovement.add(copyLastStatus)
            }
            stage == 0 -> carMovement.add(MutableList<String>(amountOfCars) { START_STATE })
            else -> throw IllegalArgumentException("Indexing이 잘못 이뤄지고 있습니다.")
        }
    }

    fun getCarMovementStringData(): MutableList<MutableList<String>> {
        val copyCarMovement = mutableListOf<MutableList<String>>()
        copyCarMovement.addAll(carMovement)
        return copyCarMovement
    }

    companion object {
        private const val START_STATE = ""
    }
}
