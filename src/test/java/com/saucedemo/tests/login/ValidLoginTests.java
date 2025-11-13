package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTests extends BaseTest {

    @Test(testName = "TC-1.1: Valid Login")
    public void testValidLogin() {
        loginPage.performLogin("standard_user", "secret_sauce");

        Assert.assertEquals(loginPage.getPageTitle(), "Swag Labs");
        Assert.assertTrue(loginPage.getCurrentURL().contains("/inventory.html"));
    }

    @Test(testName = "TC-1.2: Successful Login with Standard User")
    public void testSuccessfulLoginWithStandardUser() {
        loginPage.performLogin("standard_user", "secret_sauce");

        Assert.assertEquals(loginPage.getPageTitle(), "Swag Labs");
        Assert.assertTrue(loginPage.getCurrentURL().contains("/inventory.html"));
    }
}