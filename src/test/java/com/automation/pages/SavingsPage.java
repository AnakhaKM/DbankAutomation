package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SavingsPage extends BasePage {
    @FindBy(id = "Savings")
    WebElement savingsAccountType;

    @FindBy(id = "Individual")
    WebElement savingsAccountOwnerShip;

    @FindBy(id = "name")
    WebElement savingsAccountName;

    @FindBy(id = "openingBalance")
    WebElement savingsAmountDeposit;

    @FindBy(id = "newSavingsSubmit")
    WebElement savingBtn;

    @FindBy(id = "new-account-msg")
    WebElement savingsAccountSuccessMsg;

    @FindBy(xpath = "//div[@class='h4 m-0']")
    List<WebElement> name;

    @FindBy(xpath = "//div[@class='h4 m-0']")
    List<WebElement> amount;

    @FindBy(xpath = "//small[@class='text-light']")
    List<WebElement> accountTypeAndOwnerShip;

    public void createNewSavingAccount(String name, String amount) {
        savingsAccountType.click();
        savingsAccountOwnerShip.click();
        savingsAccountName.sendKeys(name);
        savingsAmountDeposit.sendKeys(amount);
        savingBtn.click();
    }

    public String verifySavingAccountCreated() {
        return savingsAccountSuccessMsg.getText();
    }

    public String verifySavingAccountName() {
        return name.get(0).getText();
    }

    public String verifySavingsAccountAmount() {
//        System.out.println(amount.get(0).getText().split("\\$")[1]);
        return amount.get(1).getText().split("\\$")[1];
    }

    public String verifySavingsAccountType() {
        return accountTypeAndOwnerShip.get(0).getText().split(" ")[1];
    }

    public String verifySavingsAccountOwnerShip() {
        return accountTypeAndOwnerShip.get(1).getText().split(" ")[1];
    }

}
