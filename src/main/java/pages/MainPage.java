package pages;

import base.BasePage;
import core.InitialDriver;
import elements.Element;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//*[@id = \"text1\"]")
    public WebElement nameTextField;

    @FindBy(xpath = "//*[@class = \"date-header\"]")
    public WebElement dateHeaderField;

    @Step
    public MainPage sendTextToHiddenTextField(String text) {
        Element.scrollAndSendKeysToElement(nameTextField, text);
        return this;
    }

    @Step
    public String getTextFromDateHeaderField() {
        return Element.scrollAndGetTextFromElement(dateHeaderField);
    }
}
