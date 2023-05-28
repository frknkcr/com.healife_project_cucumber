
@wip
Feature: US_025 As a user (patient) I would like to have the Pharmacy page on the Dashboard in order to access my pharmacy invoices.

  Background: common steps
    * Navigate to "homepageUrl"
    * Login to user page as "ayse.busra.pehlivan" "heallife123"
    * Click on the "Pharmacy" linkk


  Scenario: TC_01 The Dashboard sidebar should have the Pharmacy menu title and when clicked it should redirect to the "pharmacybill" page
    And Verified redirected to pharmacybill page



  Scenario: TC_02 The Pharmacy Bill page should have the headings (Bill No, Case ID, Date, Doctor Name, Note, Amount($), Paid Amount($), Balance Amount($), Action) in the Pharmacy Bill List.
   And  Verify that "Bill No, Case ID, Date, Doctor Name, Note, Amount($), Paid Amount($), Balance Amount($), Action)" in the Pharmacy Bill List are displayed


  Scenario: TC_03:To be able to search the Pharmacy Bill List, there must have a searchTextBox and it should search correctly.

    Then Click the "search box"
    Then Enter the excisting "Pharmacy Bill"
    And It is verified that filtering is done by entering the bill number in the Search Box.

  Scenario: TC_04 It should be possible to sort the list over the titles in the Pharmacy Bill List.
    Then It is verified that the headings are sorted by clicking on them.

  Scenario: TC_05 It should be possible to perform transactions (View Payments, Show and Pay) under the Action title in the Pharmacy Bill List.

    Then Click the View payments.
    Then The visibility of the amount text is verified
    Then close the screen
    Then Click the show button.
    Then Name text (ayse.busra.pehlıvan) should visible
    Then wait 5 seconds
    Then close the screenn
    Then wait 3 seconds
    Then Click the pay button.
    Then the amount paid is entered.
    And Click the add button.
    Then wait 3 seconds
    And Click the pay with card.
    Given e-mail, card number, date and cvc code are entered
    Then The visibility of the success text is verified


