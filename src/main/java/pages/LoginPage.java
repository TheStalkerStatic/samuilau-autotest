package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_field")
    public WebElement emailField;

    @FindBy(id = "password_field")
    public WebElement passwordField;

    @FindBy(css = "button.button_wide.button_primary")
    public WebElement enterButton;

    @FindBy(className = "s-field")
    public WebElement error;

    @Step("Enter email")
    public LoginPage emailFieldSend(String mail) {
        emailField.sendKeys(mail);
        return this;
    }

    @Step("Enter password")
    public LoginPage passwordFieldSend(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    @Step("Log in")
    public HomePage enterButtonClick() {
        enterButton.click();
        return new HomePage(driver);
    }

    @Step("Log in fail")
    public LoginPage enterButtonClickFail() {
        enterButton.click();
        return this;
    }

    @Step("Error")
    public LoginPage checkInvalidMail() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOf(error));
        Assert.assertTrue(error.isDisplayed());
        return this;
    }

    @Step("Go to the previous page")
    public void goBackToHomePage(WebDriver driver) {
        JavascriptExecutor goBack = (JavascriptExecutor) driver;
        goBack.executeScript("window.history.go(-1)");
    }
}
//end