package base;

import core.InitialDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(InitialDriver.getWebDriver(), this);
    }
}
