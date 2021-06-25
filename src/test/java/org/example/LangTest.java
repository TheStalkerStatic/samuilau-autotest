package org.example;

import jdk.jfr.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LangTest extends BaseTest {

    HomePage homePage;

    @Test(priority = 3)
    @Description("Тест смены локализации")
    public void testLang() {
        homePage = new HomePage(driver);
        homePage.langButton.click();
        homePage.eng.click();
        homePage.changeLang.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.urlToBe("https://habr.com/en/"));
        Assert.assertEquals(homePage.headerText.getText(), "All streams");
        System.out.println("Тест пройден, локализация изменена.");
    }
}
//    @Test(description = "Тест смены локализации", priority = 3)
//    public void testLang() {
//        WebElement langButton = driver.findElement(By.cssSelector("button.btn.btn_medium.btn_navbar_lang.js-show_lang_settings"));
//        langButton.click();
//        WebElement eng = driver.findElement(By.xpath("//label[text()='English']"));
//        eng.click();
//        WebElement changeLang = driver.findElement(By.cssSelector("button.btn.btn_blue.btn_huge.btn_full-width.js-popup_save_btn"));
//        changeLang.click();
//        new WebDriverWait(driver, 5)
//                .until(ExpectedConditions.urlToBe("https://habr.com/en/"));
//        WebElement engText = driver.findElement(By.cssSelector(".page-header.page-header_110"));
//        Assert.assertEquals(engText.getText(), "All streams");
//        System.out.println("Тест пройден, локализация изменена.");
//    }

