Feature: US_038 As an admin I would like to have a page in the dashboard sidebar to manage billing.

  Background: User login steps
    Given Goes to Admin login page
    Then Login with "ahmet.yazicioglu.admin@heallifehospital.com" and "heallife123" datas
    Then Click on the " Billing" link

  Scenario: TC_01 Clicking on the Billing link on the Dashboard sidebar should lead to the relevant page.

    And Verified redirected to Billing page

  Scenario: TC_02 The Billing page should have "Single Module Billing" and "OPD/IPD Billing Through Case Id" windows.

    And Sees Single Module Billing and OPD_IPD Billing Through Case Id windows


  Scenario Outline: TC_03 OPD Billing List should be displayed on the page that opens when the OPD board
  in the Single Module Billing window is clicked.

    And Click on the OPD button
    Then Sees the "<FilterName>" and their "<Order>"

    Examples:
      | FilterName      | Order |
      | Name            | 1     |
      | Patient Id      | 2     |
      | Guardian Name   | 3     |
      | Gender          | 4     |
      | Phone           | 5     |
      | Consultant      | 6     |
      | Last Visit      | 7     |
      | Total Recheckup | 8     |


  Scenario: TC_04 In order to search easily in the OPD Billing List, there must be a SearchTextBox.

    And Click on the OPD button
    Then  test to searcbox


  Scenario: TC_05 A new patient should be able to be added in the OPD Billing List.

    And Click on the OPD button
    And Click on the Add Patient button
    Then Create a New Patient with random datas


  Scenario: TC_06 The number of patients to be displayed in the OPD Billing List (100 or all) can be selected

    And Click on the OPD button
    Then Choose All and 100 options for patient display

  @US038
  Scenario: TC_07   The relevant patient (detail profile) information should be displayed under the
  Total Recheckup heading in the OPD Billing List.

    And Click on the OPD button
    Then Click 1. iconButton under the last column for display first patient profile


  Scenario: TC_08 When the names under Name in the OPD Billing List are clicked,
  the information of the relevant patient (detail profile) should be displayed.

    And Click on the OPD button
    Then Click 1. first name for display patient profile


  Scenario Outline: TC_09 When Pathology board in the Single Module Billing window is clicked,(all)Amounts)
  should be displayed.
          And Click the Pathology button on Billing page
          Then Sees the name of "<Billing List>" that their "<int:Ordered>" number

    Examples:
      | Billing List           | Ordered |
      | "Bill No"              | 1       |
      | "Case ID / Patient ID" | 2       |
      | "Reporting Date"       | 3       |
      | "Reporting Date"       | 4       |
      | "Reference Doctor"     | 5       |
      | "Amount ($)"           | 6       |
      | "Paid Amount ($)"      | 7       |


    Scenario: TC_10 In order to search easily in the Pathology Billing List, there must be a SearchTextBox.

          And Click the Pathology button on Billing page
          Then test to searcbox

    Scenario: TC_11 A new patient should be able to be added to the Pathology Billing List.

          And Click the Pathology button on Billing page
          And Click on the Add Patient button
          Then Create a New Patient with random datas

    Scenario: TC_12 The number of patients to be displayed in the Pathology Billing List (100 or all) can be selected.

          And Click the Pathology button on Billing page
          Then Choose All and 100 options for patient display

    Scenario: TC_13   Under the title Balance Amount ($) in the Pathology Billing List,
                      the relevant patient's (detail invoice) information should be displayed.

          And Click the Pathology button on Billing page
          And Click 1. iconButton under the last column for display first patient profile
          Then Verified redirected to Bill Details page
