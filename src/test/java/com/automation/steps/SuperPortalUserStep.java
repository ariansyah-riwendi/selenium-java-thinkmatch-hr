package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SuperPortalUserStep extends BaseTest {

    @When("user click super portal user")
    public void userClickSuperPortalUser() {
        superPortalUserPage.clickSuperPortalUserUserSideBar();
    }

    @Then("user is on the super portal user page")
    public void userIsOnTheSuperPortalUserPage() {
        Assert.assertTrue(superPortalUserPage.allSuperPortalUserTableIsDisplayed());
    }
}
