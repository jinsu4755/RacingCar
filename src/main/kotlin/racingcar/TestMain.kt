package racingcar

fun main() {
    val nameOfCars = InputView.askCarsName()
    val amountOfTry = InputView.askAmountTry()
    val carNameList = InputView.splitInpuutByComma(nameOfCars)
    val motorRacing = MotorRacing(carNameList, amountOfTry)
    val carResult = motorRacing.getResultOfCarList()
    ResultView.printCarListResult(carResult)
}
