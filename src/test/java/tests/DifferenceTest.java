package tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferenceTest extends BaseTest {

    @Parameters({"8.78", "3"})
    @Test(description = "Subtracting numbers via parameters")
    public void subtractingNumbersParametersTest(@Optional("5") double p1, @Optional("4") double p2) throws Exception {
        Assert.assertEquals(calculator.difference(p1, p2), p1 - p2);
    }

    @Test(description = "Subtraction of numbers")
    public void differenceTest() throws Exception {
        Assert.assertEquals(calculator.difference(6, 3), 3);
    }
}
