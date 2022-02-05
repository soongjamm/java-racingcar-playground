package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Name;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class ResultView {
    public void printCurrent(List<Car> aRound) {
        aRound.forEach(x -> System.out.println(String.format("%s: %s", x.name(), x.position())));
        System.out.println();
    }

    public void printWinners(List<Car> winners) {
        String names = winners.stream().map(Car::name).map(Name::toString).collect(joining(", "));
        System.out.println(String.format("%s가 우승하였습니다.", names));
    }
}
