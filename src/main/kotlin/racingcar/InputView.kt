package racingcar

class InputView {
    companion object {
        fun askAmountTry(): Int {
            println("시도할 횟수는 몇 회인가")
            val amount = readIntData()
            InputValidation.validateIntInput(amount)
            return amount
        }

        fun askCarsName(): String {
            println("경주할 자동차 이름을 입력하세요(쉼표를 구준으로 구분)")
            val carsName = readStringData()
            return carsName
        }

        fun splitInpuutByComma(inputValue: String): MutableList<String> {
            val splitInput = inputValue.split(",").map { it.trim() }
            return splitInput.toMutableList()
        }

        private fun readIntData() = readLine()?.toInt() ?: throw IllegalArgumentException("Null이 입력으로 들어왔습니다.")
        private fun readStringData() = readLine() ?: throw IllegalArgumentException("Null이 입력으로 들어왔습니다.")
    }
}
