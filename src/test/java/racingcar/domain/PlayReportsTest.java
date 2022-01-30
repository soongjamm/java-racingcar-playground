package racingcar.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayReportsTest {

    @Test
    void getByName() {
        PlayReports sut = new PlayReports(Lists.list(new Car("a")));

        PlayReport result = sut.getBy(Name.of("a"));

        assertThat(result).isNotNull();
    }
}
