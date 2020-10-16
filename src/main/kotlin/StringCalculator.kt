import java.lang.IllegalArgumentException

fun main() {
    val inputData = readLine() ?: throw IllegalArgumentException()
    val splitedData = inputData.split(" ")
    checkCalculatable(splitedData)
}
/**
 * 올바른 값 변환?
 */
fun checkCalculatable(splitedData : List<String>){
    if (splitedData.contains("&")){
        throw IllegalArgumentException("사칙연산 기호 쓰셔야 합니다!!!")
    }
    //TODO 숫자 변환 및 계산하기
}
