package io.github.ainmax;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void calculate() {
        assert Factorial.calculate("1").equals("1");

        assert Factorial.calculate("2").equals("2");

        assert Factorial.calculate("0").equals("0");

        assert Factorial.calculate("7").equals("5040");
    }
}