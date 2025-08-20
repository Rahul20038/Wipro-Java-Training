package TestingDay27;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShotListener implements ITestListener {
	@Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = BaseTestListener.driver; // ✅ Make sure BaseTestListener sets this!
        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            // ✅ Create Screenshots folder if not exists
            File destDir = new File("Screenshots");
            if (!destDir.exists()) {
                destDir.mkdir();
            }

            // ✅ Add timestamp to avoid overwriting
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String fileName = result.getName() + "_" + timeStamp + ".png";

            File destFile = new File(destDir, fileName);
            try {
                FileUtils.copyFile(src, destFile);
                System.out.println("📸 Screenshot saved: " + destFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("⚠️ Driver was null, screenshot not captured!");
        }
    }
}
