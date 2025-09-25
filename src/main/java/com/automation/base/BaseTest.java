package com.automation.base;

import com.automation.pages.LoginPage;

public class BaseTest extends BaseSetup {

    protected static LoginPage loginPage;

    public static void setUpPageObjects() {
        loginPage = new LoginPage(driver);
    }

}
