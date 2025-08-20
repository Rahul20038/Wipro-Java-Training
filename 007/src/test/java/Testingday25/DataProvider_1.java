package Testingday25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 {

    @Test(dataProvider = "logInTestData", threadPoolSize = 2)
    public void logIn(String userName, String password) throws InterruptedException {
        System.out.println("Launching new browser for user: " + userName);

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']"))).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        Thread.sleep(3000);

        driver.quit();
        System.out.println("Browser closed for user: " + userName);
    }

    @DataProvider(name = "logInTestData", parallel = true)
    public Object[][] logInData() {
        return new Object[][] {
            {"Admin", "admin123"},
            {"Admin", "admin123"}
        };
    }
}
