package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CompanyStructureStep extends BaseTest {

    @And("user click company structure")
    public void userClickCompanyStructure() {
        companyStructurePage.clickCompanyStructure();
    }

    @Then("user is on the company structure page")
    public void userIsOnTheCompanyStructurePage() {
        Assert.assertTrue(companyStructurePage.companyOrganizationalStructureTableIsDisplayed());
    }

}
