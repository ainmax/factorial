package io.github.ainmax;

public class Multiplication {
    static String calculate(String left, String right) {
        int resultBetween;
        String resultAll = "0";
        StringBuilder result = new StringBuilder();
        char[] leftArray = left.toCharArray();
        char[] rightArray = right.toCharArray();
        int balance;

        for (int i = right.length(); i > 0; i--) {
            balance = 0;
            char chari = (char)(rightArray[i-1] - 0x30);
            for (int j = left.length(); j > 0; j--) {
                char charj = (char)(leftArray[j-1] - 0x30);
                resultBetween = chari * charj + balance;
                balance = (resultBetween - resultBetween % 10) / 10;
                resultBetween %= 10;
                result.insert(0, resultBetween);
            }

            if (balance != 0) {
                result.insert(0, balance);
            }

            for (int y = right.length() - i; y > 0; y--) {
                result.append("0");
            }

            resultAll = Addition.calculate(result.toString(), resultAll);

            result = new StringBuilder();
        }

        return resultAll;
    }
}
