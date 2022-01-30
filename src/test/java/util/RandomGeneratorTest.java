package util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorTest {

    @Test
    void 랜덤값의_범위는_0부터_9() {
        // 랜덤 값은 테스트하기 어렵다.
        int result = RandomGenerator.generate();

        assertThat(result).isBetween(0, 9);
    }
}
