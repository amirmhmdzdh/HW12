package Lambda;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //* Q1 *

        Supplier<String> helloSupplier = LambdaUtil.helloSupplier();
        System.out.println(helloSupplier.get());//Hello


        //* Q2 *

        Predicate<String> isEmptyPredicate = LambdaUtil.isEmptyPredicate();

        System.out.println(isEmptyPredicate.test("java"));//false
        System.out.println(isEmptyPredicate.test(""));//true

       // * Q3 *


        BiFunction<String , Integer , String> stringMultiplier = LambdaUtil.stringMultiplier();
        System.out.println(stringMultiplier.apply("Hi", 3));//HiHiHi


        // * Q4 *

        Function<BigDecimal, String> toDollarStringFunction = LambdaUtil.toDollarStringFunction();
        String tenDollarStr = toDollarStringFunction.apply(BigDecimal.TEN.setScale(2));
        System.out.println(tenDollarStr);//$10.00


    }
}
