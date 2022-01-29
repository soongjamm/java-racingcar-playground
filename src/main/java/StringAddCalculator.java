import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String target) {
        if (Objects.isNull(target) || target.isEmpty()) {
            return 0;
        }
        int sum = 0;

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(target);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens = m.group(2).split(customDelimiter);
            for (String token : tokens) {
                sum += Integer.parseInt(token);
            }
        } else {
            String[] tokens = target.split(",|:");
            for (String token : tokens) {
                sum += Integer.parseInt(token);
            }
        }
        return sum;
    }
}
