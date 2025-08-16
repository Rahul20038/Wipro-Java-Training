package testingDay25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider_1 {
	WebDriver driver;
	
	public void launchbrowser() {
		System.out.println("Launching the browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	}
}
