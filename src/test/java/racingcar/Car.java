package racingcar;

public class Car {
    private Position position;

    public Car() {
        this.position = Position.of(0);
    }

    public Position position() {
        return this.position;
    }

    public void moveForward() {
        this.position = position.plus(1);
    }
}
