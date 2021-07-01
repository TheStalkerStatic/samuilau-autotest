package org.example;

import browsersdriver.DriverBrowser;
import logs.ThisListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(ThisListener.class)
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