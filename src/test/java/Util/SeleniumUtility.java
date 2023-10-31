package Util;

import Setup.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {
    private WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(5));
    public void click (By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void sendText (By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
}










