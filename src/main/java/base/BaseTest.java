package base;

import core.InitialDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeSuite
    public void setUp() {
        webDriver = InitialDriver.getWebDriver();
        webDriver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html?");
    }
}
