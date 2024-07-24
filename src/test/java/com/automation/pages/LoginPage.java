package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    WebElement userInputField;

    @FindBy(id = "password")
    WebElement passwordInputField;

    @FindBy(xpath = "//a[text()=' Sign Up Here']")
    WebElement signupButton;

    @FindBy(id = "title")
    WebElement titleField;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "submit")
    WebElement signIn;

    public void openWebsite() {
        driver.get("https://dbank-qa.wedevx.co/bank/login");
    }

    public boolean isLoginPageIsDisplayed() {
        return isDisplay(userInputField) && isDisplay(passwordInputField);
    }

    public void clickSignUp() {
        signupButton.click();
    }

    public boolean isSignUpPageIsDisplayed() {
        return isDisplay(titleField) && isDisplay(firstNameField);
    }

    public void userLogin(String username, String password) {
        userInputField.clear();
        userInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        signIn.click();
    }

}
