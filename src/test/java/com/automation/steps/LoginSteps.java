package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user opens Website")
    public void user_opens_website() {
        loginPage.openWebsite();
    }

    @Then("Verify user on login page")
    public void verify_user_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageIsDisplayed());
    }

    @When("user clicks on sign up here button")
    public void userClicksOnSignUpHereButton() {
        loginPage.clickSignUp();
    }

    @Then("Verify user is on signup page")
    public void verify_user_is_on_signup_page() {
        loginPage.isSignUpPageIsDisplayed();
    }


    @When("User login with valid credentials")
    public void userLoginWithValidCredentials() {
        loginPage.userLogin(ConfigReader.getConfigValue("bank.email"), ConfigReader.getConfigValue("bank.password"));

    }
}
