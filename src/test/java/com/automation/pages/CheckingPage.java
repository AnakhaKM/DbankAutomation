package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckingPage extends BasePage {

    @FindBy(id = "Standard Checking")
    WebElement standardChecking;

    @FindBy(id = "Individual")
    WebElement accountOwnerShip;

    @FindBy(id = "name")
    WebElement checkingAccountName;

    @FindBy(id = "openingBalance")
    WebElement amountDeposit;

    @FindBy(id = "newCheckingSubmit")
    WebElement checkingBtn;

    @FindBy(id = "new-account-msg")
    WebElement checkingAccountSuccessMsg;

    @FindBy(xpath = "//div[@class='h4 m-0']")
    List<WebElement> nameAmount;


    @FindBy(xpath = "//small[@class='text-light']")
    List<WebElement> accountTypeAndOwnerShip;

    public void createNewCheckingAccount(String name, String amount) {
        standardChecking.click();
        accountOwnerShip.click();
        checkingAccountName.sendKeys(name);
        amountDeposit.sendKeys(amount);
        checkingBtn.click();
    }

    public String verifyCheckingAccountCreated() {
        return checkingAccountSuccessMsg.getText();
    }

    public String verifyCheckingAccountName() {
        return nameAmount.get(0).getText();
    }

    public String verifyCheckingAmount() {
        return nameAmount.get(1).getText().split("\\$")[1];
    }
    public String verifyCheckingAccountType() {
        return accountTypeAndOwnerShip.get(0).getText().split(" ")[1];
    }

    public String verifyCheckingAccountOwnerShip() {
        return accountTypeAndOwnerShip.get(1).getText().split(" ")[1];
    }
}
