package io.github.ainmax;

public class Main {

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        System.out.println(Factorial.calculate(Long.parseLong(args[0])));
        long now = System.currentTimeMillis();
        System.out.println("Seconds elapsed: " + (now-before)/1000F + " seconds." );
    }
}
