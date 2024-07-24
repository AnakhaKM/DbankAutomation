package com.automation.steps;

import com.automation.pages.SignupPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignupSteps {
    SignupPage signupPage = new SignupPage();

    @When("user fill the necessary credentials")
    public void userFillTheNecessaryCredentials() {
        signupPage.fillForm();
    }

    @And("user clicks on next button")
    public void userClicksOnNextButton() {
        signupPage.nxtClick();
    }

    @And("user fills rest of the form")
    public void userFillsRestOfTheForm() {
        signupPage.restForm(ConfigReader.getConfigValue("bank.address"), ConfigReader.getConfigValue("bank.locality"), ConfigReader.getConfigValue("bank.region"),
                ConfigReader.getConfigValue("bank.postcode"), ConfigReader.getConfigValue("bank.country"), ConfigReader.getConfigValue("bank.home"),
                ConfigReader.getConfigValue("bank.work"), ConfigReader.getConfigValue("bank.mobile"));


    }

    @And("user clicks on RegisterButton")
    public void userClicksOnRegisterButton() {
        signupPage.clickRegister();
    }

    @Then("Verify Registration is success full")
    public void verifyRegistrationIsSuccessFull() {
        Assert.assertTrue(signupPage.isRegistrationSuccessFull());

    }

}
