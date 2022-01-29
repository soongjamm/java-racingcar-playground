package stringcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class NumberParser {
    private static final String DEFAULT_DELIMITER_REGEX = ",|:";

    public static List<Integer> parse(String target) {
        Matcher customDelimiterMatcher = matchCustomDelimiter(target);
        if (customDelimiterMatcher.find()) {
            String customDelimiter = customDelimiterMatcher.group(1);
            return doSplit(customDelimiterMatcher.group(2), customDelimiter);
        }
        return doSplit(target, DEFAULT_DELIMITER_REGEX);
    }

    private static Matcher matchCustomDelimiter(String target) {
        return Pattern.compile("//(.)\n(.*)").matcher(target);
    }

    private static List<Integer> doSplit(String target, String delimiter) {
        return Arrays.stream(target.split(delimiter)).map(Integer::parseInt).collect(toList());
    }
}
