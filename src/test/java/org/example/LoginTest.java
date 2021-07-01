package org.example;

import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {
    private final String mail = ReaderHelper.getConf().getMail();
    private final String password = ReaderHelper.getConf().getPassword();

    @Test(priority = 1)
    @Description("Authentication test.")
    //@Severity(SeverityLevel.BLOCKER)
    public void testLogin() {
        new HomePage(driver)
                .logInButtonClick()
                .emailFieldSend(mail)
                .passwordFieldSend(password)
                .enterButtonClick()
                .profileEnabled();
    }

    @Test(priority = 2)
    @Description("Checking the logout")
    public void testExitProfile() {
        new HomePage(driver)
                .openProfile()
                .exitProf()
                .checkExit();
    }

    @DataProvider(name = "TestMail")
    public static Object[] invalidEmails() {
        return new Object[]{"andreymail.com", "12345678910", "thebesttestever"};
    }

    @Test(priority = 3, dataProvider = "TestMail")
    @Description("Checking the operation of invalid mail.")
    public void testLoginMail(String invalidMail) {
        new HomePage(driver)
                .logInButtonClick()
                .emailFieldSend(invalidMail)
                .passwordFieldSend(password)
                .enterButtonClickFail()
                .checkInvalidMail()
                .goBackToHomePage(driver);
    }
}
//end



