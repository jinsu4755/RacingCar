import java.lang.IllegalArgumentException

fun main() {
    val inputData = readLine() ?: throw IllegalArgumentException()
    val splitData = inputData.split(" ")
    checkCalculable(splitData)
}

fun checkCalculable(splitData: List<String>) {
    if (splitData.contains("&")) {
        throw IllegalArgumentException("사칙연산 기호 쓰셔야 합니다!!!")
    }
    calculate(splitData)
}

fun calculate(splitData: List<String>): Int {
    var resultNum = 0
    for (i in splitData.indices) {
        when (i % 2) {
            0 -> if (i == 0) {
                resultNum = splitData[i].toInt()
            }
            1 -> when (splitData[i]) {
                "+" -> {
                    resultNum = sumData(resultNum, splitData[i + 1].toInt())
                }
                "-" -> {
                    resultNum = minusData(resultNum, splitData[i + 1].toInt())
                }
                "*" -> {
                    resultNum = multiplyData(resultNum, splitData[i + 1].toInt())
                }
                "/" -> {
                    resultNum = divideData(resultNum, splitData[i + 1].toInt())
                }
            }
        }
    }
    print("계산값은 ${resultNum}입니다.")
    return resultNum
}

fun changeToInt(number: String): Int {
    return number.toInt()
}

fun sumData(a: Int, b: Int): Int {
    return a + b
}

fun minusData(a: Int, b: Int): Int {
    return a - b
}

fun multiplyData(a: Int, b: Int): Int {
    return a * b
}

fun divideData(a: Int, b: Int): Int {
    return a / b
}