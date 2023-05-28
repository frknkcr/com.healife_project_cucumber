Feature: As a user (patient), I would like to have functions in the navbar of my dashboard so that I can manage the panel more easily.

  Background: User is on Homepage


  Scenario: The heallife hospital logo on the Dashboard navbar is clicked, it should lead to the panel home page.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Homepage redirect verified

  Scenario:The language option of the panel can be changed from the Dashboard navbar.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When User clicks the flag


  Scenario: Notifications should be accessible by clicking on the notification icon in the Dashboard navbar.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the notifications button
    When  User see the notifications

  Scenario: All notifications should be displayed in the notification list on the systemnotifications page and notifications can be deleted
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the notifications button

    Scenario: When you click on the profile picture in the Dashboard navbar, the user name, title and profile picture should be displayed in the tab that opens.


     Scenario: The registered password can be changed from the tab that opens when the profile picture on the Dashboard navbar is clicked, and logout can be made (taken) from the system.

Scenario: Dashboard navbar should have "Heal Life Hospital & Research Center" text.
  When User  see  Heal Life Hospital & Research Center text.
  Scenario: The dashboard sidebar should close and open when the menu icon (three lines one below the other) is clicked on the Dashboard navbar.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the three lines button and User  see Dashboard navbar close