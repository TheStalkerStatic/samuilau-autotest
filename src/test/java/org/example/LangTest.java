package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LangTest extends BaseTest {

    @Test(priority = 5, enabled = true)//enabled = true необязательный аргумент; enabled = false позволяет пропустить тест.
    @Description("Localization change Test.")
    public void testLang() {
                HomePage homePage = new HomePage(driver)
                .langButtonClick()
                .engClick()
                .changeLangClick();
                new WebDriverWait(driver, 5)
                        .until(ExpectedConditions.urlToBe("https://habr.com/en/"));
                Assert.assertEquals(homePage.headerTextGet(), "All streams");
    }
}
//end