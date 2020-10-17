import java.lang.IllegalArgumentException

fun main() {
    val inputData = readLine() ?: throw IllegalArgumentException()
    val splitedData = inputData.split(" ")
    checkCalculatable(splitedData)
}

fun checkCalculatable(splitedData: List<String>) {
    if (splitedData.contains("&")) {
        throw IllegalArgumentException("사칙연산 기호 쓰셔야 합니다!!!")
    }
    classify(splitedData)
}

fun classify(splitedData: List<String>) {

}

fun sumData(a: Int, b: Int): Int {
    return a + b
}

fun minusData(a : Int, b : Int) : Int{
    return a - b
}

fun multyplyData(a : Int, b : Int) : Int {
    return a * b
}

fun divideData(a : Int, b : Int) : Int {
    return a / b
}