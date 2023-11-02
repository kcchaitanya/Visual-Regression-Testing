package tests;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifySearchAndClickOnProduct() throws InterruptedException {
        eye.checkWindow("Landing Page");
    }
}
