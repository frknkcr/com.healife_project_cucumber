package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.HealMethods;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class PatientStepdefinitions {
    PatientPage patientPage=new PatientPage();
    AdminPage adminPage=new AdminPage();


    @Given("Goes to user login page")
    public void goesToUserLoginPage() {
        // intentionally left blank
    }

    @Then("Login with {string} and  {string} datas")
    public void loginWithAndDatas(String username,String password) {
        HealMethods.loginAsUser(username, password);
    }


    @When("Homepage redirect verified")
    public void homepageRedirectVerified() {

    patientPage.DashboardOnHeallifeText.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/patient/dashboard"));
    }

    @When("User clicks the flag")
    public void userClicksTheFlag() {
        patientPage.homeFlag.click();
        patientPage.homeFlagTurkish.click();
     //   ReusableMethods.waitForClickablility(patientPage.homeFlagTurkish,2);
        ReusableMethods.sleep(3);
        String expected=patientPage.myAppiontmentsButton.getText();
        System.out.println(expected);
      //  Assert.assertTrue(expected.equalsIgnoreCase("Randevularım"));

    }

   @And("user should be able to on the IPD page")
    public void userShouldBeAbleToOnTheIPDPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("admin/patient/ipdsearch"));
    }





    @When("Click on the notifications button")
    public void clickOnTheNotificationsButton() {
        patientPage.notifications.click();

    }

    @When("User see the notifications")
    public void userSeeTheNotifications() {
        Assert.assertTrue(patientPage.notificationsboard.isDisplayed());
    }





    @When("User not see any notifications")
    public void userNotSeeAnyNotifications() {
        Assert.assertTrue(patientPage.notificationsInformation.getText().contains("No Record Found"));
    }



    @When("User  see  Heal Life Hospital & Research Center text.")
    public void userSeeHealLifeHospitalResearchCenterText() {
        Assert.assertTrue(patientPage.DashboardOnHeallifeText.getText().contains("Heal"));

    }

    @When("Click on  Delete All button")
    public void clickOnDeleteAllButton() {
        ReusableMethods.sleep(2);
        ReusableMethods.waitForClickablility(patientPage.notificationsDeletebutton,2);
        patientPage.notificationsDeletebutton.click();
    }

    @Then("User  ben on the Dashboard profile page")
    public void userBenOnTheDashboardProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/patient/dashboard"));
    }

    @When("Clik on the dashboard button")
    public void clikOnTheDashboardButton() {
    patientPage.dashboardButton.click();
    }

    @When("Click on the My Appointments button")
    public void clickOnTheMyAppointmentsButton() {
        patientPage.myAppiontmentsButton.click();
    }

    @Then("User  be on the My Appointment profile page")
    public void userBeOnTheMyAppointmentProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("appointment"));

    }

    @When("Click on the OPD menu title on the Sidebar")
    public void clickOnTheOPDMenuTitleOnTheSidebar() {
        patientPage.opdButton.click();
    }

    @Then("User  be on the OPD profile page")
    public void userBeOnTheOPDProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("profile"));
    }

    @When("Click on the IPD button")
    public void clickOnTheIPDButton() {
        patientPage.ipdButton.click();
    }

    @Then("User  be on the IPD profile page")
    public void userBeOnTheIPDProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patientipddetails"));
    }

    @When("Click on the Pharmacy button")
    public void clickOnThePharmacyButton() {
        patientPage.pharmacyButton.click();
    }

    @Then("User  be on the Pharmacy profile page")
    public void userBeOnThePharmacyProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("pharmacybill"));

    }

    @When("Click on the Pathology button")
    public void clickOnThePathologyButton() {
        patientPage.pathologyButton.click();
    }

    @Then("User  be on the Pathology profile page")
    public void userBeOnThePathologyProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/pathology"));

    }


    @When("Click on the Radiology button")
    public void clickOnTheRadiologyButton() {
        patientPage.radiologyButton.click();
        
    }

    @Then("User  be on the Radiology profile page")
    public void userBeOnTheRadiologyProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(" dashboard/radiology"));

    }


    @When("Click on the Ambulance button")
    public void clickOnTheAmbulanceButton() {
        
        patientPage.ambulanceButton.click();
    }

    @Then("User  be on the  Ambulance profile page")
    public void userBeOnTheAmbulanceProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard/ambulance"));
    }


    @When("Click on the BloodBank button")
    public void clickOnTheBloodBankButton() {
        patientPage.bloodBankButton.click();

    }

    @Then("User  be on the BloodBank  profile page")
    public void userBeOnTheBloodBankProfilePage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard/bloodbank"));

    }

    @When("Click on the three lines one below the other button")
    public void clickOnTheThreeLinesOneBelowTheOtherButton() {
        patientPage.homeThreeDots.click();
    }

    @Then("User   see Dashboard navbar close")
    public void userSeeDashboardNavbarClose() {

        patientPage.homeThreeDots.click();

    }

    @When("User  see Patient Id, Gender, Marital Status, Phone, Email, Address, Age, Guardian Name informations")
    public void userSeePatientIdGenderMaritalStatusPhoneEmailAddressAgeGuardianNameInformations() {
        PatientPage.checkHeaderExistence(patientPage.myInformations);


    }

    @When("User  be Appointment No, Appointment Date, Priority, Specialist, Doctor, Status, Message, Action title")
    public void userBeAppointmentNoAppointmentDatePrioritySpecialistDoctorStatusMessageActionTitle() {
        WebElement table = driver.findElement(By.id("DataTables_Table_0"));
        PatientPage.checkTableHeadersExist(table);
    }

    @When("Click on the Delete button  User  be Delete menu")
    public void clickOnTheDeleteButtonUserBeDeleteMenu() {
        patientPage.myAppointmentdeleteButton.click();

    }

    @When("Clik on the Show button  User sees Appointment Details")
    public void clikOnTheShowButtonUserSeesAppointmentDetails() {
        patientPage.myAppointmentsShowButton.click();
        patientPage.myAppointmentsShowcloseButton.click();
    }

    @When("User enters card information and completes payment")
    public void userEntersCardInformationAndCompletesPayment() {
        patientPage.myAppiontmentsPaybutton.click();
        patientPage.myAppointmentsPaywithCardbutton.click();
        ReusableMethods.bekle(2);
        patientPage.myAppointmentsEmailtext.sendKeys("aysenuriye27@gmail.com");
        patientPage.myAppointmentsCardnumberText.sendKeys("4242 4242 4242 4242");
        patientPage.myAppointmentsMMYYText.sendKeys("0727");
        patientPage.myAppointmentsCVCText.sendKeys("571");
        patientPage.myAppoinmentsSecondPaybutton.click();
    }



    @Given("Navigate to {string}")
    public void navigate_to(String string) {
    }

    @Given("Login to user page as {string} {string}")
    public void login_to_user_page_as(String username, String password) {
        Driver.getDriver().get("https://qa.heallifehospital.com/site/userlogin");
        WebElement usernameLocate = Driver.getDriver().findElement(By.id("email"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("password"));
        passwordLocate.sendKeys(password);
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

    }

    @Given("Click on the {string} linkk")
    public void click_on_the_linkk(String string) {
        patientPage.pharmacySideBox.click();

    }

    @Given("Verified redirected to pharmacybill page")
    public void verified_redirected_to_pharmacybill_page() {
        patientPage.pharmacyBillText.isDisplayed();

    }

    @And("Verify that {string} in the Pharmacy Bill List are displayed")
    public void verifyThatInThePharmacyBillListAreDisplayed(String data) {
        PatientPage.baslikListelemeMethod(data);
    }

    @Then("Click the {string}")
    public void clickThe(String arg0) {
        patientPage.searchBox.click();

    }

    @Then("Enter the excisting {string}")
    public void enterTheExcisting(String arg0) {
        patientPage.searchBox.sendKeys("PHARMAB43");
    }

    @And("It is verified that filtering is done by entering the bill number in the Search Box.")
    public void ıtIsVerifiedThatFilteringIsDoneByEnteringTheBillNumberInTheSearchBox() {
        Assert.assertTrue(patientPage.pharmacyText.isDisplayed());
    }

    @Then("It is verified that the headings are sorted by clicking on them.")
    public void ıtIsVerifiedThatTheHeadingsAreSortedByClickingOnThem() {
        Assert.assertTrue(PatientPage.intListSortTest(1));
    }

    @Then("Click the View payments.")
    public void clickTheViewPayments() {
        patientPage.wievAllBox.click();

    }
    @Then("The visibility of the amount text is verified")
    public void theVisibilityOfTheAmountTextIsVerified() {
        Assert.assertTrue(patientPage.dateText.isDisplayed());
    }
    @Then("close the screen")
    public void closeTheScreen() {
        patientPage.pharmacyCloseButton.click();

    }

    @Then("Click the show button.")
    public void clickTheShowButton() {
        patientPage.pharmacyShowButton.click();

    }


    @Then("Name text \\(ayse.busra.pehlıvan) should visible")
    public void nameTextAyseBusraPehlıvanShouldVisible() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(patientPage.pharmacyNameText.isDisplayed());

    }

    @Then("Click the pay button.")
    public void clickThePayButton() {
        patientPage.pharmacyPayButton.click();
    }




    //}

    @Then("the amount paid is entered.")
    public void theAmountPaidIsEntered() {
        patientPage.pharmacyPaymenAmount.click();
        patientPage.pharmacyPaymenAmount.clear();
        patientPage.pharmacyPaymenAmount.sendKeys("30");
        patientPage.pharmacyAddButton.click();
    }
    @And("Click the add button.")
    public void clickTheAddButton() {
        patientPage.pharmacyAddButton.click();
    }


    @And("Click the pay with card.")
    public void clickThePayWithCard() {
        patientPage.pharmacyPayWithCard.click();
        ReusableMethods.bekle(6);



    }

    @Given("e-mail, card number, date and cvc code are entered")
    public void eMailCardNumberDateAndCvcCodeAreEntered() {
        // patientPage.pharmacyEmailBox.click();
        // WebElement element=Driver.getDriver().findElement(By.xpath(("//input[@class='control'])[1])")));
        //JSUtilities.clickWithJS(Driver.getDriver(),element);
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(3);

        actions.sendKeys("asd@gmail.com").build().perform();
        //actions.sendKeys(faker.internet().emailAddress()).perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("4242 4242").build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("4242 4242").build().perform();
        ReusableMethods.bekle(3);
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("04").perform();
        ReusableMethods.bekle(3);
        actions.sendKeys("28").perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("123").build().perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys("456").build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.TAB).build().perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ENTER).perform();

        // patientPage.pharmacyPayBox.click();
        ReusableMethods.bekle(2);

    }

    @Then("The visibility of the success text is verified")
    public void theVisibilityOfTheSuccessTextIsVerified() {

        Assert.assertTrue(patientPage.pharmacySuccesfulText.isDisplayed());
    }

    @Then("wait {int} seconds")
    public void waitSeconds(int arg0) {
        ReusableMethods.bekle(3);
    }

    @Then("close the screenn")
    public void closeTheScreenn() {
        patientPage.pharmacyClose.click();
    }
}



