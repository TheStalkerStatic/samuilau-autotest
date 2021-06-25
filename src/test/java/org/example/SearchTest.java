package org.example;

import jdk.jfr.Description;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  SearchTest extends BaseTest {

    HomePage homePage;
    SearchPage searchPage;
    String searchWord = "Selenium";

    @Test(priority = 2)
    @Description("Тест работы поиска")
    public void testSearch() {
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        homePage.searchButton.click();
        homePage.searchField.sendKeys(searchWord, Keys.ENTER);
        Assert.assertTrue(searchPage.found.isDisplayed());
        System.out.println("Тест пройден, поиск работает.");
    }
}
//    @Test(description = "Тест работы поиска", priority = 2)
//    public void testSearch() {
//        WebElement searchButton = driver.findElement(By.id("search-form-btn"));
//        searchButton.click();
//        WebElement search = driver.findElement(By.id("search-form-field"));
//        search.sendKeys("Selenium", Keys.ENTER);
//        WebElement seleniumPage = driver.findElement(By.cssSelector(".page__body"));
//        Assert.assertTrue(seleniumPage.isDisplayed());
//        System.out.println("Тест пройден, поиск работает.");
//    }

