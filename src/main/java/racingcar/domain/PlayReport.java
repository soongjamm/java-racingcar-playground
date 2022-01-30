package racingcar.domain;

import java.util.*;

public class PlayReport {
    private final Car car;
    private final List<Integer> randoms;

    public PlayReport(Car car) {
        this.car = car;
        this.randoms = new ArrayList<>();
    }

    public List<Integer> randoms() {
        return Collections.unmodifiableList(randoms);
    }

    public void putRandom(int randomValue) {
        this.randoms.add(randomValue);
    }
}
