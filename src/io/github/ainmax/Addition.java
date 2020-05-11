package io.github.ainmax;

public class Addition {
    static String addition(String number1, String number2) {
        String char1 = "";
        String char2 = "";
        String result = "";
        Integer resultBetween = 0;
        Integer balance = 0;
        for (int i = number1.length(); i > 0; i--) {
            if(number1.length() - number2.length() < i) {
                char1 = number1.substring(i - 1, i);
                char2 = number2.substring(number2.length() - (number1.length() - i) - 1, number2.length() - (number1.length() - i));
                resultBetween = Integer.parseInt(char1) + Integer.parseInt(char2) + balance;
                balance = (resultBetween - resultBetween % 10) / 10;
                resultBetween %= 10;
                result = resultBetween.toString() + result;
            } else {
                char1 = number1.substring(i - 1, i);
                resultBetween = Integer.parseInt(char1) + balance;
                balance = (resultBetween - resultBetween % 10) / 10;
                resultBetween %= 10;
                result = resultBetween.toString() + result;
            }
        }
        if(balance != 0) {
            result = balance.toString() + result;
        }
        return result;
    }
}
