package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automation.utils.Utils;

public class LoginPage {

    private final Utils utils;

    private final By loginPageImage = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[1]");
    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    private final By logoImage = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img");

    public LoginPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void isLoginPageImageDisplayed() {
        utils.isElementDisplayed(loginPageImage);
    }

    public void inputUsername(String username) {
        utils.inputText(usernameField, username);
    }

    public void inputPassword(String password) {
        utils.inputText(passwordField, password);
    }

    public void clickLogin() {
        utils.click(loginButton);
    }

    public boolean isLogoDisplayed() {
        return utils.isElementDisplayed(logoImage);
    }
}

