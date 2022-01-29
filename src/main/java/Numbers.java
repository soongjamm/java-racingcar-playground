import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Numbers {
    private static final String DEFAULT_DELIMITER = ",|:";

    private List<Integer> numbers;

    public Numbers(String numbers) {
        this.numbers = getTokens(numbers);
    }

    public boolean hasNegative() {
        return stream().anyMatch(e -> e < 0);
    }

    public int sum() {
        return stream().mapToInt(Integer::intValue).sum();
    }

    private List<Integer> getTokens(String target) {
        Matcher customDelimiterMatcher = matchCustomDelimiter(target);
        if (customDelimiterMatcher.find()) {
            String customDelimiter = customDelimiterMatcher.group(1);
            return doSplit(customDelimiterMatcher.group(2), customDelimiter);
        }
        return doSplit(target, DEFAULT_DELIMITER);
    }

    private Matcher matchCustomDelimiter(String target) {
        return Pattern.compile("//(.)\n(.*)").matcher(target);
    }

    private List<Integer> doSplit(String target, String delimiter) {
        return Arrays.stream(target.split(delimiter)).map(Integer::parseInt).collect(toList());
    }

    private Stream<Integer> stream() {
        return numbers.stream();
    }
}
