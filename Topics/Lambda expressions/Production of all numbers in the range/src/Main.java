import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (left, right) -> {
        long ans = 1;
        for (long start = left; start <= right; start++) {
            ans *= start;
        }
        return ans;
    };
}