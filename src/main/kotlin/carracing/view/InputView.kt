package carracing.view

object InputView {
    lateinit var racingInfoList: MutableList<Int>

    fun inputRacingInfo(): List<Int> {
        racingInfoList = mutableListOf()
        println("자동차의 대수는 몇 대인가요?")
        racingInfoList.add(readLine()?.toInt() ?: throw NumberFormatException("자동차 대수는 null값일 수 없습니다."))
        println("시도할 횟수는 몇 번인가요")
        racingInfoList.add(readLine()?.toInt() ?: throw NumberFormatException("라운드 횟수는 null값일 수 없습니다."))

        return racingInfoList
    }
}
