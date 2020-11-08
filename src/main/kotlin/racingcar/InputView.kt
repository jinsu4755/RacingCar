package racingcar

class InputView {
    companion object {
        fun startCarRacing(): MutableList<MutableList<Boolean>> {
            val amountOfCars = askAmountOfCars()
            val numberOfAttempts = askNumberOfAttempts()
            val motorRacing = MotorRacing(amountOfCars, numberOfAttempts)
            return motorRacing.getResultOfRacing()
        }

        private fun askAmountOfCars(): Int {
            println("자동차 대수는 몇 대인가요?")
            val amountOfCars = readLine()?.toInt()
            return InputValidation.validateAmountInput(amountOfCars)
        }

        private fun askNumberOfAttempts(): Int {
            println("시도할 횟수는 몇 회인가?")
            val numberOfAttempts = readLine()?.toInt()
            return InputValidation.validateAmountInput(numberOfAttempts)
        }
    }
}
