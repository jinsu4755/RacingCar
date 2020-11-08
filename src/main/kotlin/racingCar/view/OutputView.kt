package racingCar.view

fun printGameWinner(winners: Set<String>) {
    println(winners.joinToString(separator = ", ") + "가 최종 우승했습니다.")
}

fun printGameResult(gameResult: List<Map<String, Int>>) {
    gameResult.forEach { raceResult ->
        println()
        printRaceResult(raceResult)
    }
}

fun printRaceResult(raceResult: Map<String, Int>) {
    raceResult.forEach { distanceOfCar ->
        println(distanceOfCar.key + ":" + distanceToLine(distanceOfCar.value))
    }
}

fun distanceToLine(distance: Int): String {
    return "-".repeat(distance)
}
