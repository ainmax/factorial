package io.github.ainmax;

public class Factorial {
    static String calculate(Long number) {
        if (number == null || number == 0)
            return "0";

        String result = "1";
        for (long i = 1; i <= number; i++) {
            result = Multiplication.calculate(result, Long.toString(i));
        }

        return result;
    }
}
