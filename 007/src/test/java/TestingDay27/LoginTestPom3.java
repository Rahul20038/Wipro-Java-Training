package TestingDay27;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestPom3 {
	WebDriver driver;
    LoginPagePom3 loginPage;

    @BeforeMethod
    public void setup() {
        driver = DriverSingleton3.getDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        loginPage = new LoginPagePom3(driver);
    }

    @Test
    public void testInvalidLogin() throws InterruptedException {
        loginPage.enterUsername("Tester");
        loginPage.enterPassword("test");
        loginPage.clickLogin();

        Thread.sleep(2000);

        String alertMsg = loginPage.handleAlert();
        System.out.println("Alert Message: " + alertMsg);
    }

    @AfterMethod
    public void tearDown() {
        DriverSingleton3.quitDriver();
    }
}
