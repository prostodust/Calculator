package tests;

import module.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    Calculator calculator;

    @BeforeMethod
    public void initTest() {
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
    }
}
