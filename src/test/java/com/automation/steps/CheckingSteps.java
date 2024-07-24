package com.automation.steps;

import com.automation.pages.CheckingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckingSteps {
    CheckingPage checkingPage = new CheckingPage();

    @And("create new checking account")
    public void createNewCheckingAccount() {
        checkingPage.createNewCheckingAccount(ConfigReader.getConfigValue("bank.checkingName"), ConfigReader.getConfigValue("bank.amountDeposit"));


    }

    @Then("verify checking account is created")
    public void verifyCheckingAccountIsCreated() {
        Assert.assertEquals("Successfully created new Standard Checking account named sample", checkingPage.verifyCheckingAccountCreated());

    }

    @And("verify created checking account details")
    public void verifyCreatedCheckingAccountDetails() {
        Assert.assertEquals(ConfigReader.getConfigValue("bank.checkingName"), checkingPage.verifyCheckingAccountName());
        Assert.assertEquals("Standard",checkingPage.verifyCheckingAccountType());
        Assert.assertEquals("Individual",checkingPage.verifyCheckingAccountOwnerShip());
        Assert.assertEquals(String.format("%.2f",(Double.parseDouble(ConfigReader.getConfigValue("bank.amountDeposit")))), checkingPage.verifyCheckingAmount());
    }
}
