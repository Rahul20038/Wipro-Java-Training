package TestingDay27;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsExtentReport4 extends ExtentReport4 {

    @Test(priority = 1)
    public void loginTest() {
        test = extent.createTest("Login Test");

        try {
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
            driver.findElement(By.id("ctl00_MainContent_login_button")).click();

            String title = driver.getTitle();
            Assert.assertTrue(title.contains("Web Orders"));
            test.pass("Login successful").addScreenCaptureFromPath(captureScreenshot("LoginSuccess"));

        } catch (Exception e) {
            test.fail("Login failed").addScreenCaptureFromPath(captureScreenshot("LoginFail"));
        }
    }

    @Test(priority = 2, dependsOnMethods = {"loginTest"})
    public void viewAllOrders() {
        test = extent.createTest("View All Orders");

        try {
            driver.findElement(By.linkText("View all orders")).click();
            String header = driver.findElement(By.tagName("h2")).getText();
            Assert.assertTrue(header.contains("List of All Orders"));
            test.pass("Viewed all orders").addScreenCaptureFromPath(captureScreenshot("OrdersPage"));
        } catch (Exception e) {
            test.fail("Failed to view orders").addScreenCaptureFromPath(captureScreenshot("OrdersFail"));
        }
    }

    @Test(priority = 3, dependsOnMethods = {"viewAllOrders"})
    public void viewAllProducts() {
        test = extent.createTest("View All Products");

        try {
            driver.findElement(By.linkText("View all products")).click();
            String header = driver.findElement(By.tagName("h2")).getText();
            Assert.assertTrue(header.contains("List of Products"));
            test.pass("Viewed all products").addScreenCaptureFromPath(captureScreenshot("ProductsPage"));
        } catch (Exception e) {
            test.fail("Failed to view products").addScreenCaptureFromPath(captureScreenshot("ProductsFail"));
        }
    }
    
    @Test(priority = 4, dependsOnMethods = {"viewAllProducts"})
    public void orderPageTest() {
        test = extent.createTest("Order Page Test");

        try {
            driver.findElement(By.linkText("Orders")).click();
            String header = driver.findElement(By.tagName("h2")).getText();
            Assert.assertTrue(header.contains("Order")); // The header text is "Order"
            test.pass("Opened Order page").addScreenCaptureFromPath(captureScreenshot("OrderPage"));
        } catch (Exception e) {
            test.fail("Failed to open Order page").addScreenCaptureFromPath(captureScreenshot("OrderFail"));
        }
    }

    @Test(priority = 5, dependsOnMethods = {"orderPageTest"})
    public void logoutTest() {
        test = extent.createTest("Logout Test");

        try {
            driver.findElement(By.id("ctl00_logout")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("Login"));
            test.pass("Logout successful").addScreenCaptureFromPath(captureScreenshot("LogoutSuccess"));
        } catch (Exception e) {
            test.fail("Logout failed").addScreenCaptureFromPath(captureScreenshot("LogoutFail"));
        }
    }
}
