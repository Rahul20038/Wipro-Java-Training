package TestingDay27;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom3 {
	WebDriver driver;

    // Constructor
    public LoginPagePom3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators using PageFactory
    @FindBy(id = "ctl00_MainContent_username")
    WebElement usernameField;

    @FindBy(id = "ctl00_MainContent_password")
    WebElement passwordField;

    @FindBy(id = "ctl00_MainContent_login_button")
    WebElement loginButton;

    // Methods
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String handleAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            String text = alert.getText();
            alert.accept();
            return text;
        } catch (Exception e) {
            return "No Alert Present";
        }
    }
}
