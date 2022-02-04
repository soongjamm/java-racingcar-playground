package racingcar.domain;

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

    @Test
    void 자동차를_전진시킨다() {
        Car sut = new Car("mycar");

        sut.moveForward(() -> true);

        assertThat(sut.position()).isEqualTo(new Position(1));
    }

    @Test
    void 자동차를_전진시키지_않는다() {
        Car sut = new Car("mycar");

        sut.moveForward(() -> false);

        assertThat(sut.position()).isEqualTo(new Position(0));
    }

    @Test
    void 우승자_판단() {
        Car sut = new Car("mycar", new Position(10));
        Position max = new Position(10);

        boolean result = sut.isWinner(max);

        assertThat(result).isTrue();
    }
}
