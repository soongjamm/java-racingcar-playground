package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차의_초기_위치는_0_이다() {
        Car sut = new Car();

        assertThat(sut.position()).isEqualTo(Position.of(0));
    }

    @Test
    void 자동차가_전진하면_위치가_1_증가한다() {
        Car sut = new Car();

        sut.moveForward();

        assertThat(sut.position()).isEqualTo(Position.of(1));
    }
}
