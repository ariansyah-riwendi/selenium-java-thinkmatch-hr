package com.automation.base;

import com.automation.pages.*;

public class BaseTest extends BaseSetup {

    protected static LoginPage loginPage;
    protected  static DashboardPage dashboardPage;
    protected static WorkPlacementPage workPlacementPage;
    protected static EmploymentStatusPage employmentStatusPage;
    protected static CompanyStructurePage companyStructurePage;
    protected static ListEmployeePage listEmployeePage;

    public static void setUpPageObjects() {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        workPlacementPage = new WorkPlacementPage(driver);
        employmentStatusPage = new EmploymentStatusPage(driver);
        companyStructurePage = new CompanyStructurePage(driver);
        listEmployeePage = new ListEmployeePage(driver);
    }

}
