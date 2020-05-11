package io.github.ainmax;

public class Addition {
    static String calculate(String left, String right) {
        StringBuilder result = new StringBuilder();
        int resultBetween = 0;
        int balance = 0;

        char[] longer;
        char[] shorter;
        if (left.length() < right.length()) {
            longer = right.toCharArray();
            shorter = left.toCharArray();
        } else {
            longer = left.toCharArray();
            shorter = right.toCharArray();
        }

        for (int i = longer.length; i > 0; i--) {
            if (longer.length - shorter.length < i) {
                char longerDigit = (char) (longer[i - 1] - 0x30);
                char shorterDigit = (char) (shorter[shorter.length - (longer.length - i) - 1] - 0x30);
                resultBetween = longerDigit + shorterDigit + balance;
                balance = (resultBetween - resultBetween % 10) / 10;
                resultBetween %= 10;
                result.insert(0, resultBetween);
            } else {
                char longerDigit = (char) (longer[i - 1] - 0x30);
                resultBetween = longerDigit + balance;
                balance = (resultBetween - resultBetween % 10) / 10;
                resultBetween %= 10;
                result.insert(0, resultBetween);
            }
        }

        if (balance != 0) {
            result.insert(0, balance);
        }

        return result.toString();
    }
}
