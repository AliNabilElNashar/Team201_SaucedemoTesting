package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LockedUserTests extends BaseTest {

    @Test(testName = "TC-4.1: Locked User Login")
    public void testLockedUserLogin() {
        loginPage.performLogin("locked_out_user", "secret_sauce");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test(testName = "TC-4.2: Login with Locked Out User")
    public void testLoginWithLockedOutUser() {
        loginPage.performLogin("locked_out_user", "secret_sauce");

        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Sorry, this user has been locked out.");
    }
}