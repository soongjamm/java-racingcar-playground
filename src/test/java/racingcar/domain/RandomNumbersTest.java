package racingcar.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumbersTest {

    @Test
    void Car의_랜덤값을_저장한다() {
        RandomNumbers sut = new RandomNumbers();

        sut.putRandom(1);

        assertThat(sut.randoms()).isEqualTo(Lists.list(1));
    }
}
