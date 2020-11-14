package racingcar.view

import racingcar.KeyboardInputChanger

class InputView {
    private val keyboardInputChanger = KeyboardInputChanger()
    fun getCarsWithName(): List<String> {
        print("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.")
        return keyboardInputChanger.loadCarNames(readLine())
    }

    fun getNumOfTry(): Int {
        print("시도할 횟수는 몇 회인가요?")
        return keyboardInputChanger.stringToNum(readLine())
    }
}
