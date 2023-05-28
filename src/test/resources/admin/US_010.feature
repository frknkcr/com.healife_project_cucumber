Feature: US_010 As a user, I would like to have a "Complain" section where I can report my requests and complaints.

  Background: common steps
    * Launch browser.
    * Go to "homepageUrl"
    * Go to the home page footer section.


  Scenario: TC01 Verify that the "Complain" title and icon are visible in the home page bottom bar.

    And Verify that the complain button and icon are visible.
    And Close browser


  Scenario: TC02 It should be verified that the "Complain" title and icon in the bottom bar of the home page are directed to the relevant page when clicked.

    And Click on the complainIcon
    And Verify that it redirects to the "complainUrl" page.
    And Close browser