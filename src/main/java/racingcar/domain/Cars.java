package racingcar.domain;

import util.RandomGenerator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Cars {
    private List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars from(List<String> list) {
        return new Cars(list.stream().map(Car::new).collect(toList()));
    }

    public List<Car> participants() {
        return Collections.unmodifiableList(cars);
    }

    public List<Car> play() {
        for (Car car : cars) {
            car.moveForwardIfPossibleBy(RandomGenerator.generate());
        }
        return Collections.unmodifiableList(cars);
    }

    public List<Car> findFarthestCars() {
        Position max = cars.stream()
                .max(Comparator.comparing(Car::position))
                .orElseThrow(IllegalArgumentException::new)
                .position();
        return cars.stream().filter(e -> e.position().equals(max)).collect(toList());
    }
}
