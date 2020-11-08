package racingCar.view

fun printGameResult(gameResult: List<List<Int>>) {
    gameResult.forEach { raceResult ->
        println()
        printRaceResult(raceResult)
    }
}

fun printRaceResult(raceResult: List<Int>) {
    raceResult.forEach { distanceOfCar ->
        println(distanceToLine(distanceOfCar))
    }
}

fun distanceToLine(distance: Int): String {
    return "-".repeat(distance)
}
