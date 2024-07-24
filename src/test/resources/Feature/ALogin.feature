Feature: Verify login functionality
  @login
  Scenario: Verify user can Sign up to the website
    Given user opens Website
    Then  Verify user on login page
    When  user clicks on sign up here button
    Then  Verify user is on signup page
    When  user fill the necessary credentials
    And   user clicks on next button
    And   user fills rest of the form
    And   user clicks on RegisterButton
    Then  Verify Registration is success full
    When  User login with valid credentials
    Then  Verify user on home page





