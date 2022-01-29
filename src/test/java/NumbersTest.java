import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumbersTest {

    @Test
    void default_delimiter() {
        Numbers sut = new Numbers("1,2");

        int result = sut.sum();

        assertThat(result).isEqualTo(3);
    }

    @Test
    void custom_delimiter() {
        Numbers sut = new Numbers("//;\n1;2");

        int result = sut.sum();

        assertThat(result).isEqualTo(3);
    }

    @Test
    void hasNegative() {
        Numbers sut = new Numbers("//;\n1;2;3");

        boolean result = sut.hasNegative();

        assertThat(result).isFalse();
    }

    @Test
    void hasNegative2() {
        Numbers sut = new Numbers("//;\n-1;2;3");

        boolean result = sut.hasNegative();

        assertThat(result).isTrue();
    }

}
