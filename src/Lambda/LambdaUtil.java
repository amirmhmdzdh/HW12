package Lambda;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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

        return (str, number) -> {

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < number; i++) {
                stringBuilder.append(str);
            }
            return stringBuilder.toString();

        };
    }

        // * Q4 *

        public static Function<BigDecimal, String> toDollarStringFunction() {

            DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
            return decimalFormat::format;
            //(BigDecimal value) -> decimalFormat.format(value);
        }


    }
