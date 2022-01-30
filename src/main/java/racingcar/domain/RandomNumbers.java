package racingcar.domain;

import java.util.*;

public class RandomNumbers {
    private final List<Integer> randoms;

    public RandomNumbers() {
        this.randoms = new ArrayList<>();
    }

    public List<Integer> randoms() {
        return Collections.unmodifiableList(randoms);
    }

    public void putRandom(int randomValue) {
        this.randoms.add(randomValue);
    }
}
