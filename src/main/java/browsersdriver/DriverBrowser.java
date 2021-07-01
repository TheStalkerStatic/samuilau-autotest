package browsersdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.example.AppConfig;
import org.example.ReaderHelper;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DriverBrowser {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        AppConfig config = ReaderHelper.getConf();
        if (driver == null) {
            if (config.getBrowserName().equalsIgnoreCase(Browsers.chromeBrowser.getName())) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (config.getBrowserName().equalsIgnoreCase(Browsers.firefoxBrowser.getName())) {
                WebDriverManager.firefoxdriver().setup( );
                driver = new FirefoxDriver();
            } else {
                throw new IllegalArgumentException(config.getBrowserName() + " is not supported");
            }

            driver.manage().timeouts().pageLoadTimeout(config.getTimeoutPage(), TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(config.getTimeoutElement(), TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }
}