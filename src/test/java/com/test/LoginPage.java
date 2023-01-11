package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    private WebElement usernameField = driver.findElement(By.id("user-name"));
    private WebElement passwordField = driver.findElement(By.id("password"));
    private WebElement loginBtn = driver.findElement(By.id("login-button"));

    public void login(String username,String password) {
        usernameField.sendKeys(username);
        usernameField.sendKeys(username);
        loginBtn.click();
    }
}
