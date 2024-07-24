package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TransferPage extends BasePage {
    @FindBy(id = "transfer-menu-item")
    WebElement transferOption;

    @FindBy(id = "fromAccount")
    WebElement fromAccount;

    @FindBy(id = "toAccount")
    WebElement toAccount;

    @FindBy(id = "amount")
    WebElement amountTransfer;

    @FindBy(xpath = "//button[contains(@class,'btn-primary ')]")
    WebElement btnSubmit;

    @FindBy(xpath = "//div[@class='h4 m-0']")
    List<WebElement> balanceAmountSavings;

    public void chooseTransferOption(){
        transferOption.click();
    }
    public  void fillTransferDetails(String amount){
        Select chooseFromOption=new Select(fromAccount);
//        choose.selectByVisibleText("sample (Standard Checking)");
        chooseFromOption.selectByValue("34125");
        Select chooseToOption=new Select(toAccount);
        chooseToOption.selectByValue("34122");
        amountTransfer.sendKeys(amount);
        btnSubmit.click();
    }
    public Double verifyTransactionDoneSuccessfullyFromCheckingToSavings(){

        return Double.parseDouble(balanceAmountSavings.get(1).getText().split("\\$")[1]);

    }
}
