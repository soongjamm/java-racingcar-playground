package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    void equals_name() {
        String name = "name";

        Name sut = Name.of(name);

        assertThat(sut).isEqualTo(Name.of(name));
    }

    @Test
    void 이름이_5글자를_넘으면_예외가_발생한다() {
        String name = "name_length_over_five";

        assertThatThrownBy(() -> Name.of(name))
                .isInstanceOf(CarNameException.class);
    }
}
