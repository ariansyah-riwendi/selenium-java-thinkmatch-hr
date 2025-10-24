package com.automation.base;

import com.automation.pages.*;

public class BaseTest extends BaseSetup {

    protected static LoginPage loginPage;
    protected  static DashboardPage dashboardPage;
    protected static ListCompanyPage listCompanyPage;
    protected static ListUserPage listUserPage;
    protected static SuperPortalUserPage superPortalUserPage;

    public static void setUpPageObjects() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        listCompanyPage = new ListCompanyPage(driver);
        listUserPage = new ListUserPage(driver);
        superPortalUserPage = new SuperPortalUserPage(driver);
    }

}
