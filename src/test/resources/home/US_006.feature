Feature: US_006 As a user, I want the doctors section on the main page to see the doctors serving in the hospital.

  @US_006
  Scenario: TC_01 It should be verified that the photo, name, surname and title of 6 doctors (Heidi Prather, Alexander C.
  Simotas, Kristina Marie Quirolgico, Christopher Lutz, Joel M. Press, Dena Barsoum) are visible under the title "Our Doctors"
  on the main page.

    Given go to home page
    Then the photo confirms that their name and title appear as Professor
      | Heidi Prather             |
      | Alexander C. Simotas      |
      | Kristina Marie Quirolgico |
      | Christopher Lutz          |
      | Joel M. Press             |
      | Dena Barsoum              |
