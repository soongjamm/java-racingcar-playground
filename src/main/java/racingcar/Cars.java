package racingcar;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Cars {
    public static List<Car> findWinners(List<Car> cars) {
        Position max = cars.stream().max(Comparator.comparing(Car::position)).orElseThrow(IllegalStateException::new).position();
        return cars.stream().filter(car -> car.isWinner(max)).collect(toList());
    }
}
