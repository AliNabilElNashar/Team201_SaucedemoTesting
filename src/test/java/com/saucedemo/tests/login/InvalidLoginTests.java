package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTests extends BaseTest {

    @Test(testName = "TC-2.1: Invalid Login")
    public void testInvalidLogin() {
        loginPage.performLogin("invalid_user", "secret_sauce");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }

    @Test(testName = "TC-2.2: Failed Login with Invalid Credentials")
    public void testFailedLoginWithInvalidCredentials() {
        loginPage.performLogin("wrong_user", "wrong_password");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }
}