import java.util.Objects;

public class StringAddCalculator {
    public static int splitAndSum(String target) {
        if (isBlank(target)) {
            return 0;
        }

        Numbers numbers = new Numbers(target);
        if (numbers.hasNegative()) {
            throw new RuntimeException();
        }

        return numbers.sum();
    }

    private static boolean isBlank(String target) {
        return Objects.isNull(target) || target.isEmpty();
    }
}
