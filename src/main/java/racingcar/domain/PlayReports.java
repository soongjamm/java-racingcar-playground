package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayReports {

    private final Map<Name, PlayReport> playReports;

    public PlayReports(List<Car> cars) {
        this.playReports = new HashMap<>();
        cars.forEach(car ->  playReports.put(car.name(), new PlayReport(car)));
    }

    public PlayReport getBy(Name name) {
        return playReports.get(name);
    }
}
