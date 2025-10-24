package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ListEmployeeStep extends BaseTest {

    @And("user click list employee")
    public void userClickListEmployee() {
        listEmployeePage.clickListEmployee();
    }

    @Then("user is on the list employee page")
    public void userIsOnTheListEmployeePage() {
        Assert.assertTrue(listEmployeePage.allEmployeeTableIsDisplayed());
    }

}
