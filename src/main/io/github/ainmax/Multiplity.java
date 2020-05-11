package io.github.ainmax;

public class Multiplity {
    static String willMultiply(String number1, String number2) {
        Integer resultBetween = 0;
        String resultAll = "0";
        String result = "";
        String char1 = "";
        String char2 = "";
        Integer balance;
        for (int i = number2.length(); i > 0; i--) {
            balance = 0;
            char1 = number2.substring(i - 1, i);
            for (int j = number1.length(); j > 0; j--) {
                resultBetween = 0;
                char2 = number1.substring(j - 1, j);
                resultBetween = Integer.parseInt(char1) * Integer.parseInt(char2) + balance;
                balance = (resultBetween - resultBetween % 10) / 10;
                resultBetween %= 10;
                result = resultBetween.toString() + result;
            }

            if(result.substring(0, 1) == "0") result = "0";

            if(balance != 0) {
                result = balance + result;
            }

            for (int y = number2.length() - i; y > 0; y--) {
                result += "0";
            }

            if(comparsion(result, resultAll)) {
                resultAll = Addition.addition(result, resultAll);
            } else {
                resultAll = Addition.addition(resultAll, result);
            }

            result = "";
        }
        return resultAll;
    }

    static boolean comparsion(String number1, String number2) {
        boolean number = false;
        if(number1.length() < number2.length()) {
            number = false;
        } else if(number1.length() == number2.length()) {
            number = false;
        } else {
            number = true;
        }
        return number;
    }
}
