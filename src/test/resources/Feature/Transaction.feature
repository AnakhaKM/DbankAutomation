Feature: Verify Transaction Functionality
  Background:
    Given user opens Website
    Then  Verify user on login page

  Scenario: Verify user can transfer some amount
    When User login with valid credentials
    Then Verify user on home page
    When User clicks on Transfer Options
    And  User fill the appropriate transfer details
    Then  Verify transaction done successfully

