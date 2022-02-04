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

    @Test
    void 자동차는_이름을_갖는다() {
        Car sut = new Car("mycar");

        Name result = sut.name();

        assertThat(result).isEqualTo(new Name("mycar"));
    }
}
