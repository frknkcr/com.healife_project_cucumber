Feature: US_036 As an administrator (admin), I want to have a navbar in the admin panel to manage the admin panel more easily.

  Background: common steps
    * Launch browser.
    * Go to "adminUrl"
    * Login to admin page as "duyguAdminUsername" "duyguAdminPassword"

  Scenario: TC01 Verify that the navbar of the admin panel has the site logo and that it refreshes the admin panel home page when clicked.

    And Verify that the heallife logo is visible in the navbar of the admin panel.
    And Click on the Billing Menu
    And Click on the heallife logo in the Navbar
    And Verify that the admin panel is refreshed when clicking on the heallife logo
    And Close browser


  Scenario: TC02 Verify that there is a menu icon in the navbar and verify that the dashboard menu opens and closes when clicked.

    * Verify that there is a dashboard menu icon in the navbar
    * Click on the menu icon.
    * Verify that the dashboard menu is closed when clicked
    * Click on the menu icon.
    * Verify that the dashboard menu is opened when clicked
    * Close browser


  Scenario: TC03 Navbar'da "Heal Life Hospital & Research Center" text'i bulundugu dogrulanmali.

    And Verify that the Navbar has the text *Heal Life Hospital & Research Center*
    And Close browser













