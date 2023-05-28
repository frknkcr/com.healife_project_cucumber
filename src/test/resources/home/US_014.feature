@furkan
Feature: As a user, I would like a 'Contact Us' page to be available to communicate with the hospital management.

  Background:
    Given User goes to "https://qa.heallifehospital.com/"


  Scenario: There should be a redirect from the main page to the Contact Us page.

    Then Testing that the Contact Us button is visible
    And Browser is closed


  Scenario: Contact Us sayfasindaki Let's Talk kisminda Name, Email, Subject, Description box'lari görünmeli.

    Then User clicks contact us button
    Then Test that the Name text box is visible
    Given Test that the Email text box is visible
    And Test that the Subject text box is visible
    And Test that the Description text box is visible
    And Browser is closed


  Scenario:  Name, Email, Subject, Description box'larina gecerli veriler girilip Submit edildiginde mesaj hastane yönetimine gönderilmeli.

    Then User clicks contact us button
    Given User enters the text "user name" in the Name text box
    And User enters the text "user@mail.com" in the Email text box
    And User enters the text "demo" in the Subject text box
    And User enters the text "This is a test text" in the Description text box
    And User is click on the submit button
    And Test that the form has been submitted successfully


    Scenario: There should be a Map on the Contact Us page.

      Then User clicks contact us button
      Given User is scroll to map
      And Harita kaydırılır