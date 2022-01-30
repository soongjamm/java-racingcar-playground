package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    void equals_positions() {
        Position sut = Position.of(0);

        assertThat(sut).isEqualTo(Position.of(0));
    }

    @Test
    void move() {
        Position sut = Position.of(0);

        Position result = sut.plus(1);

        assertThat(result).isEqualTo(Position.of(1));
    }
}
