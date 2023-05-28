@US011
  Feature: US_011 As a user, I would like to have a page on the homepage where I can schedule appointments for hospital services.

    Scenario: TC_01 There should be a redirect from the main page to the Appointment page.
      Given User goes to the home page
      Then Click the Appointment Button
      Then Verify that the URL of the Appointment page is correct
      And Close the web browser
