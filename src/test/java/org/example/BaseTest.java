package org.example;

import BrowsersDriver.DriverBrowser;
import logs.ShittyListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(ShittyListener.class)
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