package racingcar.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차_이름_목록만큼_자동차가_생성된다() {
        Cars sut = Cars.from(Lists.list("a", "b", "c", "d", "e"));

        assertThat(sut.participants()).hasSize(5);
    }

    @Test
    void 주어진_수만큼_전진을_시도한다() {
        int tryCount = 5;
        Cars sut = Cars.from(Lists.list("a"));

        PlayReport result = sut.play(tryCount);

        assertThat(result.randoms().get(Name.of("a"))).hasSize(tryCount);
    }

    @Test
    void 전진_회수는_4이상의_랜덤숫자길이와_같다() {
        int tryCount = 5;
        Cars sut = Cars.from(Lists.list("a"));

        PlayReport result = sut.play(tryCount);

        Position sutPosition = sut.participants().get(0).position();
        assertThat(sutPosition).isEqualTo(Position.of(getMovableCount(result)));

    }

    private int getMovableCount(PlayReport result) {
        return (int) result.randoms().get(Name.of("a")).stream().filter(e -> e >= Car.DEFAULT_MOVABLE_FROM).count();
    }
}
