package com.zhukdi.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RPNCalculatorTest {

    private RPNCalculator calculator;

    @BeforeClass
    public void setUp() throws Exception {
        calculator = new RPNCalculator();
    }

    @Test
    public void testSum() {
        Assert.assertEquals(calculator.calculate("30 + 25"), 55.0);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calculator.calculate("42 - 12"), 30.0);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(calculator.calculate("4 * 25"), 100.0);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calculator.calculate("3 / 4"), 0.75);
    }

    @Test(expectedExceptions = java.lang.ArithmeticException.class)
    public void testDivideByZero() {
        calculator.calculate("3.5 / 0");
    }

    @Test
    public void testComplexExpression() {
        double result = calculator.calculate("45 / (9 - 4) * 8 + 15/3");
        double answer = 77.0;
        Assert.assertEquals(result, answer);
    }
}