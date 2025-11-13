package com.saucedemo.base;

import com.saucedemo.engine.BrowserType;
import com.saucedemo.engine.WebDriverManager;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.initializeDriver(BrowserType.CHROME);
        driver = WebDriverManager.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
