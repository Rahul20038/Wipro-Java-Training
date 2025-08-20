package TestingDay27;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginwithAlert2 {
	WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    }

    @Test
    public void loginAndHandleErrorMessage_InvalidCredentials() throws InterruptedException {
        // enter wrong username & password
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        Thread.sleep(2000);

        // instead of alert, capture error message on the page
        try {
            WebElement errorMsg = driver.findElement(By.id("ctl00_MainContent_status"));
            if (errorMsg.isDisplayed()) {
                System.out.println("Login Failed! Error Message: " + errorMsg.getText());
            } else {
                System.out.println("No error message displayed.");
            }
        } catch (Exception e) {
            System.out.println("Error message element not found.");
        }
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}