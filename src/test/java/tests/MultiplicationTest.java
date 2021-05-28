package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest {

    @Test(description = "Positive numbers", invocationCount = 4, threadPoolSize = 2)
    public void positiveNumbersTest() throws Exception {
        Assert.assertEquals(calculator.multiplication(6, 3), 18);
    }

    @Test(description = "Fractional numbers")
    public void fractionalNumbersTest() throws Exception {
        Assert.assertEquals(calculator.multiplication(3.56, 3.23), 11.4988);
    }

    @Test(description = "Positive and negative number")
    public void positiveNegativeNumberTest() throws Exception {
        Assert.assertEquals(calculator.multiplication(7, -5), -35);
    }

    @Test(description = "Positive number and zero")
    public void positiveNumberZeroTest() throws Exception {
        Assert.assertEquals(calculator.multiplication(2, 0), 0);
    }

    @Test(description = "Negative number and zero")
    public void negativeNumberZeroTest() throws Exception {
        Assert.assertEquals(calculator.multiplication(-8, 0), 0);
    }
}
