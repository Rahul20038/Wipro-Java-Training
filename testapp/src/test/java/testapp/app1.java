package testapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class app1 {
	WebDriver driver;
	@BeforeClass
	public void LaunchtheBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void RegisterNewUser() {
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register']"))).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("FirstName")).sendKeys("Nallamothu");
		driver.findElement(By.id("LastName")).sendKeys("Rahul");
		driver.findElement(By.id("Email")).sendKeys("rahulchowdarynallamothu@gmail.com");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("Password")).sendKeys("Rahul@demo1");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rahul@demo1");
		driver.findElement(By.id("register-button")).click();
	}
//	@AfterClass
//	public void tearDown() {
//		if(driver != null) {
//			driver.quit();
//		}
//	}
}
