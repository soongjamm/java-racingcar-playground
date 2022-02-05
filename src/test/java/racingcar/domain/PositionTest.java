package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    void 생성() {
        Position sut = new Position();

        int result = sut.get();

        assertThat(result).isEqualTo(0);
    }

    @Test
    void 생성2() {
        Position sut = new Position(3);

        int result = sut.get();

        assertThat(result).isEqualTo(3);
    }

    @Test
    void 동등성() {
        Position sut = new Position();

        assertThat(sut).isEqualTo(new Position(0));
    }

    @Test
    void 위치_증가() {
        Position sut = new Position(0);

        Position result = sut.increase();

        assertThat(result).isEqualTo(new Position(1));
    }

    @Test
    void to_string() {
        Position sut = new Position(5);

        String result = sut.toString();

        assertThat(result).isEqualTo("-----");
    }
}
