package stringcalculator;

import java.util.List;
import java.util.stream.Stream;

public class Numbers {
    private List<Integer> numbers;

    public Numbers(String numbers) {
        this.numbers = NumberParser.parse(numbers);
    }

    public boolean hasNegative() {
        return stream().anyMatch(e -> e < 0);
    }

    public int sum() {
        return stream().mapToInt(Integer::intValue).sum();
    }

    private Stream<Integer> stream() {
        return numbers.stream();
    }
}
