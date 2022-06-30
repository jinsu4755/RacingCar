package firstweekstringcalculator.fix

object InputView{
    fun readCalculationString: String =  readLine() ?: throw IllegalArgumentException("입력 받은 값이 Null 일 수 없습니다.")
}