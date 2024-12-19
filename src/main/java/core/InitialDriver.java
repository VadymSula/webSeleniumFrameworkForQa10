package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.log4testng.Logger;

import java.time.Duration;

public class InitialDriver {
    private static final Logger LOGGER = Logger.getLogger(InitialDriver.class);
    public static WebDriver webDriver;

    public static void initWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("disable-infobars");

        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)).pageLoadTimeout(Duration.ofSeconds(4));
        LOGGER.info("WebDriver was initialized");
    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            LOGGER.info("WebDriver is null");
            initWebDriver();
        }
        return webDriver;
    }
}
