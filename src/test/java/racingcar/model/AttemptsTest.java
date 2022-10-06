package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AttemptsTest {

    @DisplayName("시도 횟수 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"asdf", "-1", "-123", "0", "1a", "12fv", "fv12"})
    void fail(String attempts) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Attempts(attempts));
    }

    @DisplayName("시도 횟수 성공 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4", "01"})
    void successString(String attempts) {
        assertThat(new Attempts(attempts).getAttempts()).isEqualTo(Integer.parseInt(attempts));
    }
}
