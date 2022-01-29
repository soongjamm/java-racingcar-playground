import java.util.Objects;

public class StringAddCalculator {
    public static int splitAndSum(String target) {
        if (Objects.isNull(target) || target.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(target);
    }
}
