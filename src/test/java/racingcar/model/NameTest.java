package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NameTest {

    @DisplayName("자동차 이름 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"abcdef", "", "       ", "임석호임석호"})
    void IllegalArgumentExceptionTest(String name) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Name(name));
    }

    @DisplayName("자동차 이름 null 예외 테스트")
    @Test
    void NullTest() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Name(null));
    }

    @DisplayName("자동차 이름 성공 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"abcde", "jack", "임석호", " ", "k", "임석호석호"})
    void SuccessTest(String name) {
        assertThat(new Name(name).getName()).isEqualTo(name);
    }
}