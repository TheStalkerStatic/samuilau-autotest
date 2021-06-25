package org.example;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    private String mail = "yatestinggmail@yandex.by";
    private String pass = "7ye8#D7-4kLa-fC";

    @Test(priority = 1)
    @Description("Тест аутентификации")
    public void testLogin() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.logInButton.click();
        loginPage.emailField.sendKeys(mail);
        loginPage.passwordField.sendKeys(pass);
        loginPage.enterButton.click();
        Assert.assertTrue(homePage.profile.isEnabled());
        System.out.println("Тест пройден, вход выполнен.");
    }
}
//    @Test(description = "Тест аутентификации", priority = 1)
//    public void testLogin() {
//        WebElement login = driver.findElement(By.id("login"));
//        login.click();
//        WebElement email = driver.findElement(By.id("email_field"));
//        WebElement password = driver.findElement(By.id("password_field"));
//        WebElement enterButton = driver.findElement(By.cssSelector("button.button_wide.button_primary"));
//        new Actions(driver)
//                .sendKeys(email, mail)
//                .sendKeys(password, pass)
//                .click(enterButton)
//                .build()
//                .perform();
//        WebElement profile = driver.findElement(By.cssSelector("button.btn_navbar_user-dropdown"));
//        Assert.assertTrue(profile.isEnabled());
//        System.out.println("Тест пройден, вход выполнен.");
//    }


