package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayReports {

    private final Cars cars;
    private final Map<Name, RandomNumbers> playReports;

    public PlayReports(Cars cars) {
        this.cars = cars;;
        this.playReports = new HashMap<>();
        cars.participants().forEach(car ->  playReports.put(car.name(), new RandomNumbers()));
    }

    public RandomNumbers getBy(Name name) {
        return playReports.get(name);
    }

    public List<Car> findWinners() {
        return this.cars.findFarthestCars();
    }
}
