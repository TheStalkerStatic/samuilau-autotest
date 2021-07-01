package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage  {

    @FindBy(id = "login")
    public WebElement logInButton;

    @FindBy(id = "search-form-btn")
    public WebElement searchButton;

    @FindBy(id = "search-form-field")
    public WebElement searchField;

    @FindBy(css = "button.btn_navbar_user-dropdown")
    public WebElement profile;

    @FindBy(css = ".page-header.page-header_110")
    public WebElement headerText;

    @FindBy(css = "button.btn.btn_medium.btn_navbar_lang.js-show_lang_settings")
    public WebElement langButton;

    @FindBy(xpath = "//label[text()='English']")
    public WebElement eng;

    @FindBy(css = "button.btn.btn_blue.btn_huge.btn_full-width.js-popup_save_btn")
    public WebElement changeLang;

    @FindBy(xpath = "//*[@role='menu']/ul/li[7]")
    public WebElement exitProfile;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open the login page.")
    public LoginPage logInButtonClick() {
        logInButton.click();
        return new LoginPage(driver);
    }

    @Step("Open the search bar.")
    public HomePage searchButtonClick() {
        searchButton.click();
        return this;
    }

    @Step("Select the search bar and enter the desired word.")
    public SearchPage searchFieldSend(String searchWord) {
        searchField.sendKeys(searchWord, Keys.ENTER);
        return new SearchPage(driver);
    }

    @Step("Open a user profile.")
    public void profileEnabled() {
        Assert.assertTrue(profile.isEnabled());
    }

    @Step("The text in the title on the main page.")
    public String headerTextGet() {
        return headerText.getText();
    }

    @Step("Go to the language selection.")
    public HomePage langButtonClick() {
        langButton.click();
        return this;
    }

    @Step("Select \"English\" language")
    public HomePage engClick() {
        eng.click();
        return this;
    }

    @Step("Apply language changes")
    public HomePage changeLangClick() {
        changeLang.click();
        return this;
    }

    @Step("Log out of the profile")
    public HomePage exitProf() {
        exitProfile.click();
        return this;
    }

    @Step("Open a profile")
    public HomePage openProfile() {
        profile.click();
        return this;
    }

    @Step("Checking the successful exit from the profile")
    public void checkExit() {
        Assert.assertTrue(logInButton.isDisplayed());
    }
}
//end