package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {

    @DataProvider(name = "dataForAddition")
    public Object[][] asd() {
        return new Object[][]{
                {2, 5},
                {0, 4},
                {-3, 8},
                {-5, -9},
                {0, 0},
                {3.14, 4.62}
        };
    }

    @Test(description = "Addition of numbers", dataProvider = "dataForAddition")
    public void additionNumbers(double firstTerm, double secondTerm) throws Exception {
        Assert.assertEquals(calculator.sum(firstTerm, secondTerm), firstTerm + secondTerm);
    }
}
