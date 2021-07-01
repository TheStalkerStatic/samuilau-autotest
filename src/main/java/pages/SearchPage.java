package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".page__body")
    WebElement found;

    @Step("A block with found news")
    public SearchPage foundNews() {
        Assert.assertTrue(found.isDisplayed());
        return this;
    }
}
