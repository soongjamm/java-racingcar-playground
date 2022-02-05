package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.MovingStrategy;
import racingcar.domain.RandomStrategy;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.Scanner;

public class RacingGame {
    private final InputView inputView;
    private final ResultView resultView;

    public RacingGame(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }

    public void play(MovingStrategy movingStrategy) {
        Cars cars = new Cars(inputView.getCarNames());
        int tryNo = inputView.getTryNo();
        for (int i = 0; i < tryNo; i++) {
            resultView.printCurrent(cars.moveForward(movingStrategy));
        }
        resultView.printWinners(cars.findWinners());
    }

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame(new InputView(new Scanner(System.in)), new ResultView());
        racingGame.play(new RandomStrategy());
    }
}
