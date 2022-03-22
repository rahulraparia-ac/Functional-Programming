package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

        int multiplyBy10 = multiplyBy10Function.apply(increment);
        System.out.println(multiplyBy10);

        //BiFunction takes two arguments and produces one result
        System.out.println(incrementByOneAndMultiplyFunction.apply(4,500));

    }
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number +1) * numToMultiplyBy;
    }


}
