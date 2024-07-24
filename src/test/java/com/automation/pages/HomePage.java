package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "page-title")
    WebElement dashBoard;

    @FindBy(id = "checking-menu")
    WebElement checkingMenu;

    @FindBy(id = "new-checking-menu-item")
    WebElement newCheckingMenu;

    @FindBy(id = "savings-menu")
    WebElement savingsMenu;

    @FindBy(id = "new-savings-menu-item")
    WebElement newSavingsMenu;

    public boolean isHomePageIsDisplayed() {
        return dashBoard.isDisplayed();
    }

    public void clickNewCheckingMenu() {
        checkingMenu.click();
        newCheckingMenu.click();
    }

    public void clickNewSavingsMenu() {
        savingsMenu.click();
        newSavingsMenu.click();

    }
}
