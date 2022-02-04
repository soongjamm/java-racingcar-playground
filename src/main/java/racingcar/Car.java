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

    public Position position() {
        return position;
    }

    public Name name() {
        return name;
    }
}
