import java.util.Objects;

public class StringAddCalculator {
    public static int splitAndSum(String target) {
        if (Objects.isNull(target) || target.isEmpty()) {
            return 0;
        }
        String[] tokens = target.split(",|:");
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
