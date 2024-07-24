package com.automation.steps;

import com.automation.pages.SavingsPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;

public class SavingsSteps {
    SavingsPage savingsPage = new SavingsPage();

    @And("create new savings account")
    public void createNewSavingsAccount() {
        savingsPage.createNewSavingAccount(ConfigReader.getConfigValue("bank.savingsAccountName"), ConfigReader.getConfigValue("bank.savingsAmountDeposit"));

    }

    @Then("verify savings account is created")
    public void verifySavingsAccountIsCreated() {
        Assert.assertEquals("Successfully created new Savings account named savings", savingsPage.verifySavingAccountCreated());

    }

    @And("verify created account details")
    public void verifyCreatedAccountDetails() {
        Assert.assertEquals(ConfigReader.getConfigValue("bank.savingsAccountName"), savingsPage.verifySavingAccountName());
        Assert.assertEquals("Savings",savingsPage.verifySavingsAccountType());
        Assert.assertEquals("Individual",savingsPage.verifySavingsAccountOwnerShip());
        Assert.assertEquals(String.format("%.2f",(Double.parseDouble(ConfigReader.getConfigValue("bank.savingsAmountDeposit")))), savingsPage.verifySavingsAccountAmount());

    }
}
