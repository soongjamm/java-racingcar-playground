package racingcar;

import java.util.Objects;

public class Name {
    private static int MAXIMUM_LENGTH = 5;

    private final String name;

    private Name(String name) {
        this.name = name;
    }

    public static Name of(String name) {
        if (name.length() > MAXIMUM_LENGTH) {
            throw new CarNameException(String.format("자동차의 이름은 %s 글자 이하여야 합니다.", MAXIMUM_LENGTH));
        }
        return new Name(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
