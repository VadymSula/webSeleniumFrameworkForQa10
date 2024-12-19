package elements;

import core.InitialDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.Wait;

public class Element {
    public static void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) InitialDriver.getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public static void scrollAndClickOnElement(WebElement webElement) {
        scrollToElement(webElement);
        Wait.waitForElementClickable(webElement).click();
    }

    public static String scrollAndGetTextFromElement(WebElement webElement) {
        scrollToElement(webElement);
        return Wait.waitForElementVisibility(webElement).getText();
    }

    public static void scrollAndSendKeysToElement(WebElement webElement, String text) {
        scrollToElement(webElement);
        Wait.waitForElementVisibility(webElement).sendKeys(text);
    }
}
