package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automation.utils.Utils;

public class LoginPage {

    private final Utils utils;

    private final By loginPageImage = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/a/img");
    private final By emailField = By.id("username");
    private final By passwordField = By.id("password");
    private final By signInButton = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[2]/div/form/button");
    private final By logoImage = By.xpath("//*[@id='root']/div/aside/div[1]/a/img");

    public LoginPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public boolean isLoginPageImageDisplayed() {
        return utils.isElementDisplayed(loginPageImage);
    }

    public void inputEmail(String email) {
        utils.inputText(emailField, email);
    }

    public void inputPassword(String password) {
        utils.inputText(passwordField, password);
    }

    public void clickSignIn() {
        utils.click(signInButton);
    }

    public boolean isLogoDisplayed() {
        return utils.isElementDisplayed(logoImage);
    }
}

