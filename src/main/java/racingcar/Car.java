package racingcar;

public class Car {

    private Position position;
    private Name name;

    Car() {
        this.position = new Position();
    }

    public Car(String name) {
        this();
        this.name = new Name(name);
    }

    Car(String name, Position position) {
        this(name);
        this.position = position;
    }

    public Position position() {
        return position;
    }

    public Name name() {
        return name;
    }

    public void moveForward(MovingStrategy strategy) {
        if (strategy.movable()) {
            this.position = position.increase();
        }
    }

    public boolean isWinner(Position max) {
        return position.equals(max);
    }
}
