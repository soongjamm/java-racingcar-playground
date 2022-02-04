package racingcar.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void find_winners() {
        Car a = new Car("a");
        Car b = new Car("b");
        Car c = new Car("c");

        List<Car> result = Cars.findWinners(Lists.newArrayList(a, b, c));

        assertThat(result).containsExactly(a, b, c);
    }

    @Test
    void find_a_winner() {
        Car winner = new Car("win", new Position(4));
        Car loser = new Car("lose", new Position(3));

        List<Car> result = Cars.findWinners(Lists.newArrayList(winner, loser));

        assertThat(result).containsExactly(winner);
    }

    @Test
    void 생성() {
        Cars sut = new Cars("a,b,c,d,e");

        List<Car> result = sut.participants();

        assertThat(result).hasSize(5);
    }

    @Test
    void find_winners_() {
        Cars sut = new Cars("a,b,c,d,e");

        List<Car> result = sut.findWinners();

        assertThat(result).hasSize(5);
    }

    @Test
    void move_forward() {
        Cars sut = new Cars(Lists.newArrayList(new Car("a", new Position(0))));

        List<Car> result = sut.moveForward(new RandomStrategy() {
            @Override
            int getRandomNumber() {
                return 4;
            }
        });

        assertThat(result.get(0).position()).isEqualTo(new Position(1));
    }
}
