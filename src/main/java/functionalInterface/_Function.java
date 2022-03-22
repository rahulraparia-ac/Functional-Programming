package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

        int multiplyBy10 = multiplyBy10Function.apply(increment);
        System.out.println(multiplyBy10);

        Function<Integer, Integer> addBy1andThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1andThenMultiplyBy10.apply(1));

    }
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;


}
