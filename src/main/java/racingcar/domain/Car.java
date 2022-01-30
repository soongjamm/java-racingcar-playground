package racingcar.domain;

import java.util.Objects;

public class Car {
    public static int DEFAULT_MOVABLE_FROM = 4;

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

    public void moveForwardIfPossibleBy(int randomValue) {
        if (canMoveBy(randomValue)) {
            this.position = position.plus(1);
        }
    }

    private boolean canMoveBy(int randomValue) {
        return randomValue >= DEFAULT_MOVABLE_FROM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
