package carracing.view

object InputView {
    var numberOfCar = 0
    var countOfRacing = 0

    fun inputRacingInfo() {
        println("자동차의 대수는 몇 대인가요?")
        numberOfCar = readLine()?.toInt() ?: throw NullPointerException("자동차 대수는 null값일 수 없습니다.")
        println("시도할 횟수는 몇 번인가요")
        countOfRacing = readLine()?.toInt() ?: throw NullPointerException("라운드 횟수는 null값일 수 없습니다.")
    }
}
