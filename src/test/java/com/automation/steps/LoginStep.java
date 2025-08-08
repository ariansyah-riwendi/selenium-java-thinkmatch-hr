package com.automation.steps;

import com.automation.base.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStep extends BaseSetup {

    @Given("user is on the login page")
    public void userIsOnTheLoginPage(){
        loginPage.isLoginPageImageDisplayed();
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click login")
    public void userClickLogin() {
        loginPage.clickLogin();
    }

    @Then("user is on the dashboard")
    public void userIsOnTheDashboard() {
        Assert.assertTrue(loginPage.isLogoDisplayed());
    }

}
