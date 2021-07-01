package org.example;

import browsersdriver.DriverBrowser;
import logs.DefListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(DefListener.class)
public class BaseTest {
    WebDriver driver;
    private final String startUrl = ReaderHelper.getConf().getLink();

    @BeforeClass
    public void setUp() {
        driver = DriverBrowser.getDriver();
        driver.get(startUrl);
    }

    @AfterSuite
    public void quit() {
        driver.quit();
    }
}
//end