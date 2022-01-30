package racingcar.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayReportTest {

    @Test
    void Car의_랜덤값을_저장한다() {
        Car car = new Car("a");
        PlayReport sut = new PlayReport(car);

        sut.putRandom(1);

        assertThat(sut.randoms()).isEqualTo(Lists.list(1));
    }
}
