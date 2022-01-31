package racingcar;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collector;

import static java.util.stream.Collectors.joining;

public class ResultView {

    public void print(List<Car> play) {
        for (Car car : play) {
            System.out.println(String.format("%s : %s", car.name(), car.position()));
        }
        System.out.println();
    }

    public void printWinner(List<Car> farthestCars) {
        String winners = farthestCars.stream().map(x -> x.name().toString()).collect(joining(", "));
        System.out.println(winners + "가 우승했습니다.");
    }
}
