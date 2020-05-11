package io.github.ainmax;

public class Factorial {
    static String calculate(String number) {
        if(number.equals("0")) {
            return "0";
        } else {
            String numberOnExit = "1";
            String i2 = "1";
            for (int i = 1; i <= Integer.parseInt(number); i++) {
                numberOnExit = Multiplity.willMultiply(numberOnExit, i2);
                i2 = Addition.addition(i2, "1");
            }
            return numberOnExit;
        }
    }
}
