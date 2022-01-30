package util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

    private static final int MINIMUM_VALUE = 0;
    private static final int MAXIMUM_VALUE = 9;

    public static int generate() {
        return ThreadLocalRandom.current().nextInt(MINIMUM_VALUE, MAXIMUM_VALUE + 1);
    }
}
