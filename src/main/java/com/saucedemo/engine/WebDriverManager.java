package com.saucedemo.engine;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class WebDriverManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initializeDriver(BrowserType browserType) {
        if(getDriver() == null) {
            WebDriver webDriver = DriverFactory.createDriver(browserType);
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            webDriver.manage().window().maximize();
            driver.set(webDriver);
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if(getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }
}
