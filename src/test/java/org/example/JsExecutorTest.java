package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class JsExecutorTest extends BaseTest {

    @Test(priority = 6)
    @Description("Test jsExecutor.")
    public void testJsExecutor() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("function createDoc(){var w = window.open(); w.document.open(); w.document.write('<h1>Page with text</class>');" +
                " w.document.close();}; createDoc();");
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        String secondTab = windows.get(1);
        driver.switchTo().window(secondTab);
        WebElement testText = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(testText.getText(), "Page with text");
    }
}
