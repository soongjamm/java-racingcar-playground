package racingcar.domain;

import java.util.Random;

public class RandomStrategy implements MovingStrategy {
    private static final int FORWARD_NO = 4;

    @Override
    public boolean movable() {
        if (getRandomNumber() >= FORWARD_NO) {
            return true;
        }
        return false;
    }

    int getRandomNumber() {
        return new Random().nextInt(10);
    }
}
