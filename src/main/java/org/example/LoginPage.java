package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_field")
    WebElement emailField;

    @FindBy(id = "password_field")
    WebElement passwordField;

    @FindBy(css = "button.button_wide.button_primary")
    WebElement enterButton;
}
