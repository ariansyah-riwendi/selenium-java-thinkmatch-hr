package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.When;

public class DashboardStep extends BaseTest {

    @When("user click web logo")
    public void userClickWebLogo() {
        dashboardPage.clickLogoImage();
    }

}
