package racingcar.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayReportTest {

    @Test
    void Car의_랜덤값을_저장한다() {
        Name carName = Name.of("a");
        PlayReport sut = new PlayReport(Lists.list(carName));

        sut.reportRandom(carName, 4);

        assertThat(sut.randoms().get(carName)).isEqualTo(Lists.list(4));
    }
}
