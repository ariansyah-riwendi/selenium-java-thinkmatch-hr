package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class EmploymentStatusStep extends BaseTest {

    @And("user click employment status")
    public void userClickEmploymentStatus() {
        employmentStatusPage.clickEmploymentStatus();
    }

    @Then("user is on the employment status page")
    public void userIsOnTheEmploymentStatusPage() {
        Assert.assertTrue(employmentStatusPage.employmentStatusTableIsDisplayed());
    }

}
