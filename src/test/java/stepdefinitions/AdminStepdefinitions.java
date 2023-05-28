package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import utilities.Driver;
import utilities.HealMethods;
import utilities.ReusableMethods;


import java.util.List;

public class AdminStepdefinitions {//

    AdminPage adminPage=new AdminPage();
    Faker faker=new Faker();
    AdminPage adminpage=new AdminPage();

    @Given("Goes to Admin login page")
    public void goes_to_admin_login_page() {
        // intentionally left blank
    }
    @Then("Login with {string} and {string} datas")
    public void login_with_and_datas(String username, String password) {
        HealMethods.loginAsAdmin(username,password);
    }
    @Then("Click on the {string} link")
    public void clickOnTheLink(String link) {
        HealMethods.clickASidebarLink(link);
    }
    @Then("Verified redirected to Billing page")
    public void verified_redirected_to_billing_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bill"));
    }

    @And("Sees Single Module Billing and OPD_IPD Billing Through Case Id windows")
    public void seesSingleModuleBillingAndOPD_IPDBillingThroughCaseIdWindows() {
        ReusableMethods.bekle(3);
        Assert.assertEquals("Single Module Billing",adminPage.singleModuleWindow.getText());
        Assert.assertEquals("OPD/IPD Billing Through Case Id",adminPage.opdIpdWindow.getText());
    }

    @Then("Click on the OPD button")
    public void clickOnTheOPDButton() {
        adminPage.opdButton.click();
    }

    @And("Sees the {string} and their {string}")
    public void seesTheAndTheir(String filtreAdi, int sirasi) {
        HealMethods.makeFilterTest(filtreAdi,sirasi,7);
    }

    @And("test to searcbox")
    public void testToSearcbox() {
        HealMethods.makeSearchBoxTest();
    }

    @And("Click on the Add Patient button")
    public void clickOnTheAddPatientButton() {
        HealMethods.clickBlueOrAnyButton(" Add Patient");
    }

    @And("Create a New Patient with random datas")
    public void createANewPatientWithRandomDatas() {
        HealMethods.createNewPatient();
    }

    @And("Choose All and {int} options for patient display")
    public void chooseAllAndOptionsForPatientDisplay(int arg0) {
        HealMethods.makeAll100Test();
    }
    @Then("Verified redirected to Bill Details page")
    public void verifiedRedirectedToBillDetailsPage() {
        String actualWindowTitle=Driver.getDriver().findElement(By.xpath("(//h4[@class='modal-title'])[3]")).getText();
        Assert.assertEquals("Unsuccessful redirection","Bill Details",actualWindowTitle);
    }
    @And("Click the Pathology button on Billing page")
    public void clickThePathologyButtonOnBillingPage() {
        adminPage.pathologyButton.click();
    }
    @And("Click {int}. iconButton under the last column for display first patient profile")
    public void clickIconButtonUnderTheLastColumnForDisplayFirstPatientProfile(int sira) {
        HealMethods.clickIconWith3Line(sira);
    }

    @Given("Click on the Add Patient button in IPD page")
    public void clickOnTheAddPatientButtonInIPDPage() {
        adminPage.addPatientButtonIPD.click();
    }

    @Given("Click on the Discarged Patient button")
    public void clickOnTheDiscargedPatientButton() {
        adminPage.dischargedPatientButton.click();

        
    }


    @And("user should be able to on the Discarged Patient page")
    public void userShouldBeAbleToOnTheDiscargedPatientPage() {
        Assert.assertTrue(adminPage.ipdDischargedConfirmationText.isDisplayed());
    }

    @Given("It should be displayed in the IPD Discharged Patient List")
    public void itShouldBeDisplayedInTheIPDDischargedPatientList(List<String> ipdTableHeads) {
        for (int i = 0; i < ipdTableHeads.size(); i++) {
            Assert.assertEquals(ipdTableHeads.get(i), adminPage.ipdDischargeTableHeaders.get(i).getText());
        }
    }

    @And("Click {int}. first name for display patient profile")
    public void clickFirstNameForDisplayPatientProfile(int sira) {
        HealMethods.clickANameFromList(1);
    }


    @Then("Sees the {string} that {string}")
    public void seesTheThat(String filtreAdi, int sira) {
        System.out.println("filtreAdi = " + filtreAdi);
        System.out.println("sira = " + sira);
        HealMethods.makeFilterTest(filtreAdi,sira,7);
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////DGup
    @And("Login to admin page as {string} {string}")
    public void loginToAdminPageAs(String username, String password) {
        adminpage.loginAsAdmin(username,password);
    }

    @And("Verify that the heallife logo is visible in the navbar of the admin panel.")
    public void verifyThatTheHeallifeLogoIsVisibleInTheNavbarOfTheAdminPanel() {
        Assert.assertTrue("Heallife logo is not visible in the navbar of the admin panel",adminpage.heallifeLogo.isDisplayed());
    }

    @And("Click on the Billing Menu")
    public void clickOnTheBillingMenu() {
        adminpage.billingMenu.click();
    }

    @And("Click on the heallife logo in the Navbar")
    public void clickOnTheHeallifeLogoInTheNavbar() {
        adminpage.heallifeLogo.click();
    }

    @And("Verify that the admin panel is refreshed when clicking on the heallife logo")
    public void verifyThatTheAdminPanelIsRefreshedWhenClickingOnTheHeallifeLogo() {
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo",adminpage.welcomePartyAnnouncement.isEnabled());
        Assert.assertTrue("Admin panel does not refresh when clicking on heallife logo",adminpage.welcomePartyAnnouncement.isDisplayed());
    }

    @And("Verify that there is a dashboard menu icon in the navbar")
    public void verify_that_there_is_a_dashboard_menu_icon_in_the_navbar() {
        Assert.assertTrue("No dashboard menu icon in the navigation bar",adminpage.dashboardMenuIcon.isDisplayed());
        Assert.assertTrue("A dashboard menu icon is not clickable in the navigation bar",adminpage.dashboardMenuIcon.isEnabled());
    }

    @And("Click on the menu icon.")
    public void click_on_the_menu_icon() {
        adminpage.dashboardMenuIcon.click();
    }

    @And("Verify that the dashboard menu is closed when clicked")
    public void verify_that_the_dashboard_menu_is_closed_when_clicked() {
        Assert.assertFalse("Dashboard menu does not open and close when clicked",adminpage.billingMenu.isDisplayed());
    }

    @And("Verify that the dashboard menu is opened when clicked")
    public void verify_that_the_dashboard_menu_is_opened_when_clicked() {
        Assert.assertTrue("Dashboard menu does not open and close when clicked",adminpage.billingMenu.isDisplayed());
    }

    @And("Verify that the Navbar has the text *Heal Life Hospital & Research Center*")
    public void verifyThatTheNavbarHasTheTextHealLifeHospitalResearchCenter() {
        Assert.assertTrue("The text *Heal Life Hospital & Research Center* is not visible in Navbar",adminpage.healLifeHospitalResearchCenterText.isDisplayed());
    }




    ////////////////////////////////////////////////////////////////////////////////////////////////////////////DGdown


}
