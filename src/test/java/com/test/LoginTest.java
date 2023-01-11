package com.test;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTests {
    private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void login() {
        String username = getPropertyValue("username").toString();
        String password = getPropertyValue("password").toString();
        loginPage.login(username, password);
    }
}
