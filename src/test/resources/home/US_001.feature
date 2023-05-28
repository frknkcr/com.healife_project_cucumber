@US001
Feature: US_001 As a user, I must be able to access the website in order to use the site.

  Scenario: TC_01 The website must be accessible from the browser by the user
    Given User goes to the home page
    Then Verify that the URL of the website is correct
    And Close the web browser


  Scenario: TC_02 The home page must be visible when accessing the website
      Given User goes to the home page
      Then Verify that home page is visible
      And Close the web browser