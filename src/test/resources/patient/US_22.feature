Feature: As a user (patient) I want to have an appointment page where I can check my appointments.

  Scenario:   Dashboard sidebar should have My Appointments menu title and when clicked it should redirect to the "appointment" page

    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the My Appointments button
    Then User  be on the My Appointment profile page


  Scenario: User information (Patient Id, Gender, Marital Status, Phone, Email, Address, Age, Guardian Name) should be displayed in the user information window on the "appointment" page.
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the My Appointments button
    When User  see Patient Id, Gender, Marital Status, Phone, Email, Address, Age, Guardian Name informations

  Scenario:On the "appointment" page, the user should be able to create a new appointment.


  Scenario: In the My appointments List, the appointments that the user has taken from the system should be listed under the headings (Appointment No, Appointment Date, Priority, Specialist, Doctor, Status, Message, Action).
    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the My Appointments button
    When User  be Appointment No, Appointment Date, Priority, Specialist, Doctor, Status, Message, Action title

  Scenario: In My appointments list, the user should be able to perform operations related to appointments under the Action title (show, share, delete).

    Given Goes to user login page
    Then Login with "ayse.nuriye.alcik" and  "heallife123" datas
    When Click on the My Appointments button
    When User enters card information and completes payment
    When Click on the Delete button  User  be Delete menu
    When Clik on the Show button  User sees Appointment Details


  Scenario: User should be able to search and filter (sort) appointments in My appointments list


  Scenario: 10 user appointments should be displayed in My appointments list, if more than 10 user appointments, they should be displayed on the next page.


