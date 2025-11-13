package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialUsersTests extends BaseTest {

    @Test(testName = "TC-5.1: Special Users Login")
    public void testSpecialUsersLogin() {
        loginPage.performLogin("problem_user", "secret_sauce");

        Assert.assertTrue(loginPage.getCurrentURL().contains("/inventory.html"));
    }

    @Test(testName = "TC-5.2: Login with Performance Glitch User")
    public void testPerformanceGlitchUserLogin() {
        loginPage.performLogin("performance_glitch_user", "secret_sauce");

        Assert.assertTrue(loginPage.getCurrentURL().contains("/inventory.html"));
    }
}