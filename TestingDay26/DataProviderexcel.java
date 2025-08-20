package TestingDay26;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderexcel {
    WebDriver driver;

    @Test(dataProvider="getdata", dataProviderClass = ExcelDataProvider.class)
    public void login(String userName, String password) throws InterruptedException {
        System.out.println("Launching the browser.");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        System.out.println("Logging with: " + userName + " / " + password);
        WebElement usernameField = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.name("username")));
        usernameField.clear();
        usernameField.sendKeys(userName);

        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        try {
            // Successful login → Dashboard visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
            System.out.println("✅ Login successful for user: " + userName);
        } catch (Exception e) {
            // Failed login → capture error
            WebElement errorElement = wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//p[contains(text(),'Invalid credentials')]")));
            String errorMsg = errorElement.getText();
            System.out.println("❌ Login failed for user: " + userName + " | Message: " + errorMsg);

            Assert.fail("Login failed for user: " + userName);
        } finally {
            driver.quit();
        }
    }
}
