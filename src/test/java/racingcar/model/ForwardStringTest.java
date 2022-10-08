package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.enumeration.CarStatus;

class ForwardStringTest {
    @DisplayName("멈춤 테스트")
    @Test
    void stop() {
        ForwardString fs = new ForwardString(5);
        fs.setCountByCarStatus(CarStatus.STOP);
        assertThat(fs.getString()).isEqualTo("");
    }

    @DisplayName("전진 테스트")
    @Test
    void forward() {
        ForwardString fs = new ForwardString(5);
        fs.setCountByCarStatus(CarStatus.FORWARD);
        assertThat(fs.getString()).isEqualTo("-");
    }
}