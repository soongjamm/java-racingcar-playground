package stringcalculator;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NumberParserTest {

    @Test
    void parse_by_default_delimiter_1() {
        List<Integer> parsed = NumberParser.parse("1,2");

        assertThat(parsed).isEqualTo(Lists.list(1, 2));
    }

    @Test
    void parse_by_default_delimiter_2() {
        List<Integer> parsed = NumberParser.parse("1:2");

        assertThat(parsed).isEqualTo(Lists.list(1, 2));
    }

    @Test
    void parse_by_combined_default_delimiter() {
        List<Integer> parsed = NumberParser.parse("1:2,3");

        assertThat(parsed).isEqualTo(Lists.list(1, 2, 3));
    }

    @Test
    void parse_by_custom_delimiter() {
        String customDelimiter = ";";
        List<Integer> parsed = NumberParser.parse("//" + customDelimiter + "\n1;2");

        assertThat(parsed).isEqualTo(Lists.list(1, 2));
    }

    @Test
    void other_delimiter_throw_exception() {
        assertThatThrownBy(() -> NumberParser.parse("1m2"))
                .isInstanceOf(NumberFormatException.class);
    }
}
