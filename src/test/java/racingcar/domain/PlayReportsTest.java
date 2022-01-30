package racingcar.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayReportsTest {

    @Test
    void getByName() {
        PlayReports sut = new PlayReports(Cars.from(Lists.list("a")));

        RandomNumbers result = sut.getBy(Name.of("a"));

        assertThat(result).isNotNull();
    }

    @Test
    void find_one_winner() {
        Cars cars = Cars.from(Lists.list("win", "lose"));
        Car winner = cars.participants().get(0);
        winner.moveForwardIfPossibleBy(9);
        PlayReports sut = new PlayReports(cars);

        List<Car> result = sut.findWinners();

        assertThat(result).isEqualTo(Lists.list(winner));
    }

    @Test
    void find_many_winners() {
        Cars cars = Cars.from(Lists.list("win", "lose"));
        List<Car> participants = cars.participants();
        PlayReports sut = new PlayReports(cars);

        List<Car> result = sut.findWinners();

        assertThat(result).isEqualTo(participants);
    }
}
