package Testingday25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // ✅ wait until login page is ready
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }

    @Test(dataProvider = "logInTestData")
    public void logIn(String userName, String password) throws InterruptedException {
        System.out.println("Testing with username: " + userName + " and password: " + password);

        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
        usernameField.clear();
        usernameField.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        // ✅ wait for dashboard page (after login)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));

        // simulate some action (wait briefly)
        Thread.sleep(2000);

        // ✅ logout to return back to login page
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']"))).click();

        // ✅ wait until login page reappears for next test
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "logInTestData")
    public Object[][] logInData() {
        return new Object[][] {
            {"Admin", "admin123"},
            {"Admin", "admin123"}
        };
    }
}
