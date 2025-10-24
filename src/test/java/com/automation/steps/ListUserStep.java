package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ListUserStep extends BaseTest {

    @And("user click list user")
    public void userClickListUser() {
        listUserPage.clickListUserSideBar();
    }

    @Then("user is on the list user page")
    public void userIsOnTheListUserPage() {
        Assert.assertTrue(listUserPage.allUserFromCompanyTableIsDisplayed());
    }
}
