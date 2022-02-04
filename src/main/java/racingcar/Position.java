package racingcar;

import java.util.Objects;

public class Position {

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
}
