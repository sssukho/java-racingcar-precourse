package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ForwardCountTest {

    @DisplayName("멈춤 테스트")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void failTest(int randomNum) {
        ForwardCount fc = new ForwardCount();
        fc.setForwardCountByRandomNum(randomNum);
        assertThat(fc.getForwardCount()).isEqualTo(0);
    }

    @DisplayName("전진 테스트")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void successTest(int randomNum) {
        ForwardCount fc = new ForwardCount();
        fc.setForwardCountByRandomNum(randomNum);
        assertThat(fc.getForwardCount()).isEqualTo(1);
    }

//    static List<RandomNum> StopRandomNumListProvider() {
//        return generateRandomNumList(0, 3);
//    }
//
//    static List<RandomNum> ForwardRandomNumListProvider() {
//        return generateRandomNumList(4, 9);
//    }
//
//    static List<RandomNum> generateRandomNumList(int startInclusive, int endInclusive) {
//        List<RandomNum> list = new ArrayList<>();
//        for (int i = startInclusive; i <= endInclusive; i++) {
//            list.add(new RandomNum(i));
//        }
//        return list;
//    }

}