Feature: As a user (patient), I would like to have a sidebar with menus in order to be able to operate on the menus on my dashboard.

  Scenario: Dashboard should have the title Dashboard in the sidebar and when clicked it should refresh the main page of the dashboard panel
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Clik on the dashboard button
    Then  User  ben on the Dashboard profile page

  Scenario: Dashboard sidebar should have My Appointments menu title and when clicked it should redirect to the "appointment" page
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the My Appointments button
    Then User  be on the My Appointment profile page

  Scenario: Dashboard sidebar should have OPD menu title and when clicked it should redirect to "opdprofile" page.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the OPD menu title on the Sidebar
    Then User  be on the OPD profile page

  Scenario: Dashboard sidebar should have IPD menu title and when clicked it should redirect to "ipdprofile" page.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the IPD button
    Then User  be on the IPD profile page

  Scenario: The Dashboard sidebar should have the Pharmacy menu title and when clicked it should redirect to the "pharmacy" page.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the Pharmacy button
    Then User  be on the Pharmacy profile page


  Scenario: The Dashboard sidebar should have the Pathology menu title and when clicked it should redirect to the "pathology" page.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the Pathology button
    Then User  be on the Pathology profile page


  Scenario: The Dashboard sidebar should have the Radiology menu title and when clicked it should redirect to the "radiology" page.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the Radiology button
    Then User  be on the Radiology profile page

    Scenario: The Dashboard sidebar should have the Ambulance menu title and when clicked, it should redirect to the "ambulance" page.
      Given Goes to user login page
      Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
  When Click on the Ambulance button
      Then User  be on the  Ambulance profile page

      Scenario: There should be a Bloodbank menu title in the Dashboard sidebar and when clicked, it should redirect to the "bloodbank" page.
        Given Goes to user login page
        Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
        When  Click on the BloodBank button
        Then User  be on the BloodBank  profile page


        Scenario: The dashboard sidebar should close and open when the menu icon (three lines one below the other) is clicked on the Dashboard navbar.
          Given Goes to user login page
          Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
          When Click on the three lines one below the other button
          Then User   see Dashboard navbar close