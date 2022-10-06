package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ForwardResultTest {

    @DisplayName("멈춤 테스트")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void StopTest(int randomNum) {
        ForwardResult fr = new ForwardResult();
        fr.setResultByRandomNum(randomNum);
        assertThat(fr.getResult()).isEqualTo("");
    }

    @DisplayName("전진 테스트")
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void ForwardTest(int randomNum) {
        ForwardResult fr = new ForwardResult();
        fr.setResultByRandomNum(randomNum);
        assertThat(fr.getResult()).isEqualTo(ForwardResult.FORWARD_CHARACTER);
    }
}