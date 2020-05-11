package io.github.ainmax;

public class SumLogicTest {

    @org.junit.Test
    public void willMultiply() {
         if(Factorial.willFactorial("1").equals("1")) {
             System.out.println("True");
         } else {
             System.out.println("False");
         }

        if(Factorial.willFactorial("2").equals("2")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if(Factorial.willFactorial("0").equals("0")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if(Factorial.willFactorial("7").equals("5040")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if(Factorial.willFactorial("3").equals("6")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if(Factorial.willFactorial("6").equals("720")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}