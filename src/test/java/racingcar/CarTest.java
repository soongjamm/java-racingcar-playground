package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 차의_첫_위치는_0이다() {
        Car sut = new Car();

        Position result = sut.position();

        assertThat(result).isEqualTo(new Position(0));
    }
}
