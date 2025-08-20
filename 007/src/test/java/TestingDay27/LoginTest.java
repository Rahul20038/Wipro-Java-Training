package TestingDay27;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestingDay27.ScreenShotListener.class)
public class LoginTest extends BaseTestListener {
	@Test
    public void testLogin() {
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("wrongUser");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("wrongPass");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        // Intentionally failing assertion
        String errorMsg = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        Assert.assertEquals(errorMsg, "Invalid Login or Password.");  
    }
}
