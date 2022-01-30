package racingcar.domain;

import java.util.*;

public class PlayReport {
    private Map<Name, List<Integer>> randoms;

    public PlayReport(List<Name> carNames) {
        randoms = new HashMap<>();
        carNames.forEach(e -> randoms.put(e, new ArrayList<>()));
    }

    public void reportRandom(Name name, int randomValue) {
        this.randoms.get(name).add(randomValue);
    }

    public Map<Name, List<Integer>> randoms() {
        return Collections.unmodifiableMap(randoms);
    }
}
