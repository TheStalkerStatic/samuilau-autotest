package logs;

import browsersdriver.DriverBrowser;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

    private Screenshot() {
    }

    public static void makeScreenshot() {
        new Screenshot().saveScreenshot();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        WebDriver driver = DriverBrowser.getDriver();
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
//end