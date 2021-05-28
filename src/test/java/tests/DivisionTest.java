package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {

    @Test(description = "Dividing integers")
    public void dividingIntegersTest() throws Exception {
        Assert.assertEquals(calculator.division(8, 4),8 / 4);
    }

    @Test(description = "Dividing fractional numbers")
    public void dividingFractionalTest() throws Exception {
        Assert.assertEquals(calculator.division(5.12, 2), 5.12 / 2);
    }
}
