package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WorkPlacementStep extends BaseTest {

    @When("user click employee")
    public void userClickEmployee() {
        workPlacementPage.clickEmployee();
    }

    @And("user click work placement")
    public void userClickWorkPlacement() {
        workPlacementPage.clickWorkPlacement();
    }

    @Then("user is on the work placement page")
    public void userIsOnTheWorkPlacementPage() {
        Assert.assertTrue(workPlacementPage.workPlacementListTableIsDisplayed());
    }

}
