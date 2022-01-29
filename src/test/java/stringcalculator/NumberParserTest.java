package stringcalculator;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import stringcalculator.NumberParser;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NumberParserTest {

    @Test
    void parse_default_delimiter() {
        List<Integer> parsed = NumberParser.parse("1,2");

        assertThat(parsed).isEqualTo(Lists.list(1, 2));
    }

    @Test
    void parse_default_delimiter2() {
        List<Integer> parsed = NumberParser.parse("1:2");

        assertThat(parsed).isEqualTo(Lists.list(1, 2));
    }

    @Test
    void parse_default_delimiter3() {
        List<Integer> parsed = NumberParser.parse("1:2,3");

        assertThat(parsed).isEqualTo(Lists.list(1, 2, 3));
    }

    @Test
    void parse_custom_delimiter() {
        List<Integer> parsed = NumberParser.parse("//;\n1;2");

        assertThat(parsed).isEqualTo(Lists.list(1, 2));
    }

    @Test
    void other_delimiter_throws_exception() {
        assertThatThrownBy(() -> NumberParser.parse("1m2"))
                .isInstanceOf(NumberFormatException.class);
    }
}
