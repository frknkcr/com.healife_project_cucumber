Feature: As an administrator (admin), I would like to have a page in
  the dashboard sidebar to see IPD patients (with their details) and add new patients.

  Background: User login steps
    Given Goes to Admin login page
    Then Login with "said.ozkan.admin@heallifehospital.com" and "heallife123" datas
    And Click on the " IPD" link

  Scenario: TC_01 When you click on the IPD link on the Dashboard sidebar, it should redirect to the relevant page.

    And user should be able to on the IPD page


  Scenario: TC_02 In order to add a new patient from the IPD page (and add patients using the page functions),the
  relevant page must be accessed.
    Given Click on the Add Patient button in IPD page
    And Create a New Patient with random datas
#
#    Scenario: TC_03 A new patient data should be added to the IPD Patient List when the required fields are filled in
#               with the correct data (for the current or new patient) and saved on the page that opens.
#      Given

  Scenario: TC_04 There should be a transition from the IPD page to the IPD Discharged Patient page.
    Given Click on the Discarged Patient button
    And user should be able to on the Discarged Patient page


  Scenario:  TC_05 It should be displayed in the IPD Discharged Patient List (titles Name, Patient Id, Case ID/Patient ID,
  Gender, Phone, Consultant, Admission Date, Discharged Date, Tay($), Net Amount($), Total($)).
    Given Click on the Discarged Patient button
    And user should be able to on the Discarged Patient page
  Given It should be displayed in the IPD Discharged Patient List
  |Name|
  |Patient Id|
  |Case ID / Patient ID|
  |Gender|
  |Phone|
  |Consultant|
  |Admission Date|
  |Discharged Date|
  |Tax ($)|
  |Net Amount ($)|
  |Total ($)|

    Scenario: TC_06  It should be possible to sort through the titles in the IPD Discharged Patient List.
      Given Click on the Discarged Patient button

