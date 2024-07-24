
Feature: Verify account functionality
  Background:
    Given user opens Website
    Then  Verify user on login page
   @check
  Scenario: Verify user can create checking account
    When User login with valid credentials
    Then Verify user on home page
    When user click new checking from checking
    And  create new checking account
    Then verify checking account is created
    And  verify created checking account details


  Scenario: Verify user can create savings account
    When User login with valid credentials
    Then Verify user on home page
    When user click new savings account from savings menu
    And create new savings account
    Then verify savings account is created
    And verify created account details