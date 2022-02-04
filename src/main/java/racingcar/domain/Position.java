package racingcar.domain;

import java.util.Objects;

public class Position implements Comparable<Position> {

    private final int value;

    public Position() {
        this(0);
    }

    public Position(int value) {
        this.value = value;
    }

    int get() {
        return value;
    }

    public Position increase() {
        return new Position(value + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Position other) {
        return this.value - other.value;
    }
}
