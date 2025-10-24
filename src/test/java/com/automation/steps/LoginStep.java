package com.automation.steps;

import com.automation.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStep extends BaseTest {

    @Given("user is on the login page")
    public void userIsOnTheLoginPage(){
        Assert.assertTrue(loginPage.isLoginPageImageDisplayed());
    }

    @When("user input email {string}")
    public void userInputEmail(String email) {
        loginPage.inputEmail(email);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click sign in")
    public void userClickSignIn() {
        loginPage.clickSignIn();
    }

    @Then("user is on the dashboard")
    public void userIsOnTheDashboard() {
        Assert.assertTrue(loginPage.isLogoDisplayed());
    }

}
