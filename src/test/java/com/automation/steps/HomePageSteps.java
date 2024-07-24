package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Then("Verify user on home page")
    public void verifyUserOnHomePage() {
        Assert.assertTrue(homePage.isHomePageIsDisplayed());

    }

    @When("user click new checking from checking")
    public void userClickNewCheckingFromChecking() {
        homePage.clickNewCheckingMenu();

    }

    @When("user click new savings account from savings menu")
    public void userClickNewSavingsAccountFromSavingsMenu() {
        homePage.clickNewSavingsMenu();
    }
}
