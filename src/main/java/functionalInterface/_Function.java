package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        Function<Integer, Integer> incrementByOneFunction = number -> number++;

        int incriment2 = incrementByOneFunction.apply(1);
        System.out.println(incriment2);

        int increment = incrementByOne(0);
        System.out.println(increment);





    }

    static int incrementByOne(int number) {
        return number +1;
    }


}
