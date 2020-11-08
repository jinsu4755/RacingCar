// package racingcar
//
// import org.assertj.core.api.Assertions.assertThat
// import org.junit.jupiter.api.Test
//
// class CarsTest {
//     @Test
//     fun `자동차들의 달리기 함수 체크`() {
//         // given
//         val cars = Cars(3)
//         // when
//         for (i in 0 until 3) {
//             cars.run(i)
//         }
//         val result = cars.getDistanceGraph()
//         // then
//         assertThat(result)
//             .isEqualTo("-\n-\n-\n")
//     }
//
//     @Test
//     fun `자동차들의 현재 기록 반환함수`() {
//         // given
//         val cars = Cars(3)
//         // when
//         for (i in 0 until 3) {
//             cars.run(i)
//         }
//         val result = cars.getDistanceGraph()
//         // then
//         assertThat(result)
//             .isEqualTo("-\n-\n-\n")
//     }
// }
