package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MovingStrategyTest {

    @Test
    void 랜덤값이_4이상이면_움직일_수_있다() {
        MovingStrategy sut = new RandomStrategy() {
            @Override
            int getRandomNumber() {
                return 4;
            }
        };

        boolean result = sut.movable();

        assertThat(result).isTrue();
    }

    @Test
    void 랜덤값이_4미만이면_움직일_수_없다() {
        MovingStrategy sut = new RandomStrategy() {
            @Override
            int getRandomNumber() {
                return 3;
            }
        };

        boolean result = sut.movable();

        assertThat(result).isFalse();
    }
}