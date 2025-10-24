package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ListCompanyStep extends BaseTest {

    @When("user click company")
    public void userClickCompany() {
        listCompanyPage.clickCompanySideBar();
    }

    @And("user click list company")
    public void userClickListCompany() {
        listCompanyPage.clickListCompanySideBar();
    }

    @Then("user is on the list company page")
    public void userIsOnTheListCompanyPage() {
        Assert.assertTrue(listCompanyPage.allCompanyTableIsDisplayed());
    }
}
