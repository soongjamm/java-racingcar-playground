package racingcar.domain;

public class Car {
    private Name name;
    private Position position;

    public Car() {
        this.position = Position.of(0);
    }

    public Car(String name) {
        this.name = Name.of(name);
        this.position = Position.of(0);
    }

    public Name name() {
        return this.name;
    }

    public Position position() {
        return this.position;
    }

    public void moveForward() {
        this.position = position.plus(1);
    }
}
