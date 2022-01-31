package racingcar;

import racingcar.domain.Cars;

import java.util.Arrays;
import java.util.Scanner;

public class GameService {
    private InputView inputView = new InputView(new Scanner(System.in));
    private ResultView resultView = new ResultView();

    public void play() {
        String names = "pobi,crong,honex";
        int numberOfTry = 5;
        Cars cars = Cars.from(Arrays.asList(names.split(",")));
        for (int idx = 1; idx < numberOfTry; idx++) {
            resultView.print(cars.play());
        }
        resultView.printWinner(cars.findFarthestCars());
    }

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.play();
    }
}
