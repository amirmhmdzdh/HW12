package Lambda;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Random;
import java.util.function.*;

public class LambdaUtil {

    // * Q1 *
    public static Supplier<String> helloSupplier() {

        return () -> "HellO";
    }


    // * Q2 *

    public static Predicate<String> isEmptyPredicate() {
        return str -> str.length() == 0;
    }


    // * Q3 *

    public static BiFunction<String, Integer, String> stringMultiplier() {

        return String::repeat;
       // return (str, Integer) -> str.repeat(Integer);

    }

    // * Q4 *

    public static Function<BigDecimal, String> toDollarStringFunction() {

        return bigDecimal -> "$" + bigDecimal;

    }


    // * Q5 *

    public static Predicate<String> lengthInRangePredicate(int min, int max) {

        return str -> str.length() >= min && str.length() <= max;
    }


    // * Q6 *

    public static IntSupplier randomIntSupplier() {

        Random random = new Random();
        return random::nextInt;
//        return () -> random.nextInt();

    }

    // * Q7 *

    public static IntUnaryOperator boundedRandomIntSupplier() {

        Random random = new Random();
        return operand -> random.nextInt(operand);
    }


    // * Q8 *

    public static IntUnaryOperator intSquareOperation() {

        return number -> number * number;

    }


    // * Q9 *

    public static LongBinaryOperator longSumOperation() {

        return Long::sum;
        // return (a, b) -> a + b;

    }

    // * Q10 *

    public static ToIntFunction<String> stringToIntConverter() {

        return Integer::parseInt;
//        return (str) -> Integer.parseInt(str);

    }

    // * Q11 *

    public static Supplier<IntUnaryOperator> nMultiplyFunctionSupplier(int n) {

        return () -> num -> num * n;
    }

    // * Q12 *
    public static Supplier<Supplier<Supplier<String>>> trickyWellDoneSupplier() {

        return () -> () -> () -> "WELL DONE!";
    }

    // * Q13 *

    public static UnaryOperator<Function<String, String>> composeWithTrimFunction() {
        return func -> str -> func.apply(str.trim());
    }
    // * Q14 *

    public static BiFunction<IntUnaryOperator, IntPredicate, IntUnaryOperator> functionToConditionalFunction() {

        return (operator, predicate) -> num -> predicate.test(num) ? operator.applyAsInt(num) : num;
    }

    // * Q15 *

    public static BiFunction<Map<String, IntUnaryOperator>, String, IntUnaryOperator> functionLoader() {

        return (functionMap, key) -> functionMap.getOrDefault(key, x -> x);

    }
}