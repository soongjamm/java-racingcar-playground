package racingcar;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Cars {

    private final List<Car> cars;

    public Cars(String names) {
        cars = Arrays.stream(names.split(","))
                .map(String::trim)
                .map(Car::new)
                .collect(toList());
    }

    public static List<Car> findWinners(List<Car> cars) {
        Position max = cars.stream().max(Comparator.comparing(Car::position)).orElseThrow(IllegalStateException::new).position();
        return cars.stream().filter(car -> car.isWinner(max)).collect(toList());
    }

    public List<Car> participants() {
        return Collections.unmodifiableList(cars);
    }
}
