package com.automation.steps;

import com.automation.pages.TransferPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TransferSteps {
    TransferPage transferPage=new TransferPage();

    @When("User clicks on Transfer Options")
    public void userClicksOnTransferOptions() {
        transferPage.chooseTransferOption();

    }

    @And("User fill the appropriate transfer details")
    public void userFillTheAppropriateTransferDetails() {
        transferPage.fillTransferDetails(ConfigReader.getConfigValue("bank.transfer"));
    }

    @Then("Verify transaction done successfully")
    public void verifyTransactionDoneSuccessfully() {
        Double totalBalance=Double.parseDouble(ConfigReader.getConfigValue("bank.savingsAmountDeposit"))+
                           Double.parseDouble(ConfigReader.getConfigValue("bank.transfer"));
        Assert.assertEquals(totalBalance,transferPage.verifyTransactionDoneSuccessfullyFromCheckingToSavings());

    }
}
