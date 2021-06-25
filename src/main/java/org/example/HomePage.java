package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage  {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login")
    WebElement logInButton;

    @FindBy(id = "search-form-btn")
    WebElement searchButton;

    @FindBy(id = "search-form-field")
    WebElement searchField;

    @FindBy(css = "button.btn_navbar_user-dropdown")
    WebElement profile;

    @FindBy(css = ".page-header.page-header_110")
    WebElement headerText;

    @FindBy(css = "button.btn.btn_medium.btn_navbar_lang.js-show_lang_settings")
    WebElement langButton;

    @FindBy(xpath = "//label[text()='English']")
    WebElement eng;

    @FindBy(css = "button.btn.btn_blue.btn_huge.btn_full-width.js-popup_save_btn")
    WebElement changeLang;

    @Step("Перейти к вводу почты и пароля")
    HomePage logInButton() {
        logInButton.click();
        return this;
    }

    @Step("Открыть строку поиска")
    HomePage searchButton() {
        searchButton.click();
        return this;
    }

    @Step("Выбрать строку поиска")
    HomePage searchField() {
        searchField.sendKeys("Selenium");
        return this;
    }

    @Step("Открытие профиля пользователя")
    HomePage profile() {
        profile.isEnabled();
        return this;
    }

    @Step("Текст в заголовке на главной странице")
    HomePage headerText() {
        headerText.getText();
        return this;
    }

    @Step("Перейти к выбору языка")
    HomePage langButton() {
        langButton.click();
        return this;
    }

    @Step("Выбрать английский язык")
    HomePage eng() {
        eng.click();
        return this;
    }

    @Step("Применить изменение языка")
    HomePage changeLang() {
        changeLang.click();
        return this;
    }
}
