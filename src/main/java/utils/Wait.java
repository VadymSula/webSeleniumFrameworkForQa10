package utils;

import core.InitialDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Wait {
    private static final Duration DURATION_FOR_TIMEOUT = Duration.ofSeconds(15);

    public static WebElement waitForElementClickable(WebElement webElement) {
        return waiter(DURATION_FOR_TIMEOUT).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static WebElement waitForElementVisibility(WebElement webElement) {
        return waiter(DURATION_FOR_TIMEOUT).until(ExpectedConditions.visibilityOf(webElement));
    }

    private static FluentWait<WebDriver> waiter(Duration duration) {
        return new FluentWait<>(InitialDriver.getWebDriver())
                .withTimeout(duration)
                .pollingEvery(Duration.ofSeconds(1L))
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }
}
