package stringcalculator;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersTest {

    Numbers sut;

    @Test
    void sum() {
        sut = new Numbers(Lists.newArrayList(1, 2));

        int result = sut.sum();

        assertThat(result).isEqualTo(3);
    }

    @Test
    void hasNegative_false() {
        sut = new Numbers(Lists.newArrayList(1, 2));

        boolean result = sut.hasNegative();

        assertThat(result).isFalse();
    }

    @Test
    void hasNegative_true() {
        sut = new Numbers(Lists.newArrayList(-1, 2));

        boolean result = sut.hasNegative();

        assertThat(result).isTrue();
    }

}
