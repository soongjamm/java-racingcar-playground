package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    void 생성() {
        Name sut = new Name("mycar");

        String result = sut.get();

        assertThat(result).isEqualTo("mycar");
    }

    @Test
    void 이름은_5자를_초과할_수_없다() {
        assertThatThrownBy(() -> new Name("it's_6"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void 동등성() {
        Name sut = new Name("mycar");

        assertThat(sut).isEqualTo(new Name("mycar"));
    }
}
