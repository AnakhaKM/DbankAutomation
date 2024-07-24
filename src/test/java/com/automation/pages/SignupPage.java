package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {
    @FindBy(id = "title")
    WebElement titleField;

    @FindBy(xpath = "//select[@class='form-control']/option[3]")
    WebElement titleChoose;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//input[@value='F']")
    WebElement gender;

    @FindBy(id = "dob")
    WebElement dob;

    @FindBy(id = "ssn")
    WebElement ssn;

    @FindBy(id = "emailAddress")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement nextBtn;

    @FindBy(id = "address")
    WebElement address;

    @FindBy(id = "locality")
    WebElement locality;

    @FindBy(id = "region")
    WebElement region;

    @FindBy(id = "postalCode")
    WebElement postalCode;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "homePhone")
    WebElement homePhone;

    @FindBy(id = "mobilePhone")
    WebElement mobilePhone;

    @FindBy(id = "workPhone")
    WebElement workPhone;

    @FindBy(id = "agree-terms")
    WebElement terms;

    @FindBy(tagName = "button")
    WebElement button;

    @FindBy(className = "badge-success")
    WebElement successMsg;

    public void fillForm() {
//        Select titleDropDown=new Select(titleField);
//        titleDropDown.selectByValue("Ms.");
        titleField.click();
        titleChoose.click();
        firstNameField.sendKeys(ConfigReader.getConfigValue("bank.firstname"));
        lastName.sendKeys(ConfigReader.getConfigValue("bank.lastname"));
        gender.click();
        dob.sendKeys(ConfigReader.getConfigValue("bank.dob"));
        ssn.sendKeys(ConfigReader.getConfigValue("bank.ssn"));
        email.sendKeys(ConfigReader.getConfigValue("bank.email"));
        password.sendKeys(ConfigReader.getConfigValue("bank.password"));
        confirmPassword.sendKeys((ConfigReader.getConfigValue("bank.password")));
    }

    public void nxtClick() {
        nextBtn.click();

    }

    public void restForm(String address, String locality, String region, String post,
                         String country, String hPhone, String mPhone, String wPhone) {
        this.address.sendKeys(address);
        this.locality.sendKeys(locality);
        this.region.sendKeys(region);
        postalCode.sendKeys(post);
        this.country.sendKeys(country);
        homePhone.sendKeys(hPhone);
        mobilePhone.sendKeys(mPhone);
        workPhone.sendKeys(wPhone);
        terms.click();

    }

    public void clickRegister() {
        button.click();

    }

    public boolean isRegistrationSuccessFull() {
        return successMsg.isDisplayed();
    }
}
