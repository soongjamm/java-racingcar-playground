package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void 자동차는_이름을_갖는다() {
        String name = "name";

        Car sut = new Car(name);

        assertThat(sut.name()).isEqualTo(Name.of(name));
    }

    @Test
    void 자동차의_초기_위치는_0_이다() {
        Car sut = new Car();

        assertThat(sut.position()).isEqualTo(Position.of(0));
    }

    @Test
    void 랜덤값이_4이상이면_자동차_위치가_1_증가한다() {
        Car sut = new Car();

        sut.moveForwardIfPossibleBy(4);

        assertThat(sut.position()).isEqualTo(Position.of(1));
    }

    @Test
    void 랜덤값이_4미만이면_자동차_위치가_그대로다() {
        Car sut = new Car();

        sut.moveForwardIfPossibleBy(3);

        assertThat(sut.position()).isEqualTo(Position.of(0));
    }
}
