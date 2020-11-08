# 요구사항 분석 및 구현할 기능 목록 정의
## 요구사항 분석
- 각 자동차에 이름이 부여될 수 있다. 자동차 이름은 5자를 초과하지 않는다.
- 전진하는 자동차를 출력할때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표를 기준으로 구분한다.
- 자동차 경주 게임을 완료한후 누가 우승했는지 알려준다. 우승자는 한명 이상일 수 있다.



## 구현할 기능 목록 정의

◾ Car -> 자동차 클래스

car name

car moving controller

car distance

fun validateName -> 이름이 5자 초과시 exception

fun move -> 컨트롤러에서 움직일 수 있다는 결과를 받으면 거리 1증가.



◾ MoveController -> 자동차 움직임 제어 인터페이스

fun movableStatus -> 움직일 수 있는지 없는지 뱉어냄.



◾ CarFactory -> 자동차 인스턴스 생성하여 레이싱 참여 자동차에 등록시켜주는 클래스

-> 생성 패턴으로 자동차 이름만 받으면 알아서 자동차를 만들어서 참여 자동차에 등록하여 자동차를 만드는 과정을 캡슐화 할 예정





◾ RacingParticipatingCars -> 레이싱 참여 자동차들

participatingCars -> 레이싱 참여 자동차 리스트

fun oneCycleOfRace -> 참여 자동차들의 1사이클 움직임 정의



◾RacingTracks -> 정해진 횟수만큼 트랙에서 반복하는 클래스

fun raceStart -> 주어진 횟수만큼 경주 시작.

fun getRacingResult