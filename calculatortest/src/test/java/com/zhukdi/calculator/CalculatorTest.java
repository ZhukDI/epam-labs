package com.zhukdi.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(calculator.add(3.0, 5.0), 8.0);
        Assert.assertEquals(calculator.add(0.0, -15.0), -15.0);
    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(calculator.subtract(-2.0, 4.0), -6.0);
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(calculator.multiply(5.0, 4.0), 20.0);

    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(calculator.divide(3.0, 4.0), 0.75);
    }

    @Test(expectedExceptions = java.lang.ArithmeticException.class)
    public void TestDivideByZero() {
        calculator.divide(3.0, 0.0);
    }

}