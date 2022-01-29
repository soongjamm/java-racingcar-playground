package stringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersTest {

    @Test
    void sum1() {
        Numbers sut = new Numbers("1,2");

        int result = sut.sum();

        assertThat(result).isEqualTo(3);
    }

    @Test
    void sum2() {
        Numbers sut = new Numbers("//;\n1;2");

        int result = sut.sum();

        assertThat(result).isEqualTo(3);
    }

    @Test
    void hasNegative_false() {
        Numbers sut = new Numbers("//;\n1;2;3");

        boolean result = sut.hasNegative();

        assertThat(result).isFalse();
    }

    @Test
    void hasNegative_true() {
        Numbers sut = new Numbers("//;\n-1;2;3");

        boolean result = sut.hasNegative();

        assertThat(result).isTrue();
    }

}
