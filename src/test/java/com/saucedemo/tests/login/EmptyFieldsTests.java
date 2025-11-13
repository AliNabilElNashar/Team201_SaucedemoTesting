package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyFieldsTests extends BaseTest {

    @Test(testName = "TC-3.1: Empty Fields Validation")
    public void testEmptyUsernameField() {
        loginPage.performLogin("", "secret_sauce");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }

    @Test(testName = "TC-3.2: Login Validation - Empty Username")
    public void testLoginValidationEmptyUsername() {
        loginPage.performLogin("", "secret_sauce");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }
}
