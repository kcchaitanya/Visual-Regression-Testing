package tests;

import com.applitools.eyes.selenium.Eyes;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import support.DriverInit;

public class BaseTest {
    DriverInit driverInit = new DriverInit();
    Eyes eye = new Eyes();

    @BeforeSuite
    public void setUp() {

        eye.setApiKey("YOUR_API_KEY");
        driverInit.getBrowser();
        eye.open(driverInit.getWebDriver(), "PersonalWebsite" , "Landing Page");

    }

    @AfterSuite
    public void closeBrowser() {
        eye.close();
        driverInit.closeBrowser();

    }
}
