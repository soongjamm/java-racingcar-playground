package racingcar.domain;

import util.RandomGenerator;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars from(List<String> list) {
        return new Cars(list.stream().map(Car::new).collect(toList()));
    }

    public List<Car> participants() {
        return Collections.unmodifiableList(cars);
    }

    public PlayReports play(int tryCount) {
        PlayReports playReports = new PlayReports(cars);
        for (int i = 1; i <= tryCount; i++) {
            moveAndReport(playReports);
        }
        return playReports;
    }

    private void moveAndReport(PlayReports playReports) {
        for (Car car : cars) {
            int random = RandomGenerator.generate();
            PlayReport report = playReports.getBy(car.name());
            car.moveForwardIfPossibleBy(random);
            report.putRandom(random);
        }
    }

    private List<Name> carNames() {
        return cars.stream().map(Car::name).collect(toList());
    }

}
