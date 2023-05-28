package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.ConfigReader;


import java.util.List;


public class HomepageStepdefinitions {

    HomePage homepage = new HomePage();

    @Given("go to home page")
    public void goToHomePage() {
        Driver.getDriver().get("https://qa.heallifehospital.com/");
    }

    @Then("the photo confirms that their name and title appear as Professor")
    public void ThePhotoConfirmsThatTheirNameAndTitleAppearAsProfessor(List<String> isim) {

        int expectedSize = 6;
        int actualSize = homepage.ourDoctorsPicturesCount();
        Assert.assertEquals(expectedSize, actualSize);

        for (int i = 0; i < isim.size(); i++) {
            Assert.assertEquals(isim.get(i), homepage.ourDoctorsIsim.get(i).getText());
            Assert.assertEquals("Professor", homepage.ourDoctorsUnvan.get(i).getText());
        }
    }




    Actions actions = new Actions(Driver.getDriver());


    /////////////////////////////////////////////////////////////////////////////////////
    @Given("Launch browser.")
    public void launchBrowser() {
        Driver.getDriver();}

    @Then("Go to {string}")
    public void goTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));}

    @And("Go to the home page footer section.")
    public void goToTheHomePageFooterSection() {actions.sendKeys(Keys.END).perform();}

    @And("Verify that the complain button and icon are visible.")
    public void verifyThatTheComplainButtonAndIconAreVisible() {
        Assert.assertTrue("Complain icon are not visible",homepage.complainIcon.isDisplayed());
        Assert.assertTrue("Complain button are not visible",homepage.complainButton.isDisplayed());
        Assert.assertTrue("Complain icon are not clickable",homepage.complainIcon.isEnabled());
        Assert.assertTrue("Complain button are not clickable",homepage.complainButton.isEnabled());}

    @And("Close browser")
    public void closeBrowser() {
        Driver.closeDriver();}

    @And("Click on the complainIcon")
    public void clickOnTheComplainIcon() {
        homepage.complainButton.click();}

    @And("Verify that it redirects to the {string} page.")
    public void verifyThatItRedirectsToThePage(String url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty(url);

        Assert.assertEquals("The 'Complain' button on the homepage does not redirect to the complain page.",expectedUrl,actualUrl);}

    //////////////////////////////////////////////////////////////////////////////////////////////////



    @Given("User goes to the home page")
    public void user_goes_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));}

    @Then("Verify that the URL of the website is correct")
    public void verify_that_the_url_of_the_website_is_correct() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("homePageUrl");
        Assert.assertEquals("The Url of the home page is correct",expectedUrl,actualUrl);
    }
    @Then("Close the web browser")
    public void close_the_web_browser() {
        Driver.closeDriver();
    }

    @Then("Verify that home page is visible")
    public void verify_that_home_page_is_visible() {
        ReusableMethods.bekle(1);
        Assert.assertTrue("Home page is visible", homepage.MainBanner.isDisplayed());
    }
    @Then("Click the Appointment Button")
    public void click_the_appointment_button() {
        ReusableMethods.bekle(1);
        homepage.appointmentButton.click();

    }
    @Then("Verify that the URL of the Appointment page is correct")
    public void verify_that_the_url_of_the_appointment_page_is_correct() {
        ReusableMethods.bekle(1);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("appointmentPageUrl");
        Assert.assertEquals("The Url of the Appointment page is correct",expectedUrl,actualUrl);
    }

    @Given("User goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);
    }


    @Then("Browser is closed")
    public void browser_is_closed() {
        //Driver.quitDriver();

    }

    @Then("Testing that the Contact Us button is visible")
    public void testingThatTheContactUsButtonIsVisible() {
        Assert.assertTrue(homepage.navbarContactUs.isDisplayed());
    }

    @Then("Test that the Name text box is visible")
    public void testThatTheNameTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsName.isDisplayed());
    }

    @Given("Test that the Email text box is visible")
    public void testThatTheEmailTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsEmail.isDisplayed());
    }

    @And("Test that the Subject text box is visible")
    public void testThatTheSubjectTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsSubject.isDisplayed());
    }

    @And("Test that the Description text box is visible")
    public void testThatTheDescriptionTextBoxIsVisible() {
        Assert.assertTrue(homepage.contactUsDescription.isDisplayed());
    }

    @Then("User clicks contact us button")
    public void userClicksContactUsButton() {
        homepage.navbarContactUs.click();
    }

    @Given("User enters the text {string} in the Name text box")
    public void userEntersTheTextInTheNameTextBox(String data) {
        homepage.contactUsName.sendKeys(data);
    }

    @And("User enters the text {string} in the Email text box")
    public void userEntersTheTextInTheEmailTextBox(String data) {
        homepage.contactUsEmail.sendKeys(data);
    }

    @And("User enters the text {string} in the Subject text box")
    public void userEntersTheTextInTheSubjectTextBox(String data) {
        homepage.contactUsSubject.sendKeys(data);
    }

    @And("User enters the text {string} in the Description text box")
    public void userEntersTheTextInTheDescriptionTextBox(String data) {
        homepage.contactUsDescription.sendKeys(data);
    }

    @And("User is click on the submit button")
    public void userIsClickOnTheSubmitButton() {
        homepage.contactUsSubmitButton.click();
    }

    @And("Test that the form has been submitted successfully")
    public void testThatTheFormHasBeenSubmittedSuccessfully() {
        Assert.assertTrue(homepage.successfullyText.isDisplayed());
    }

    @Given("User is scroll to map")
    public void userIsScrollToMap() {
        ReusableMethods.scrollToElement(homepage.contactusMap);
    }

    @And("Harita kaydırılır")
    public void haritaKaydırılır() {
        Driver.getDriver().switchTo().frame(homepage.contactusMap);

        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(3);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        ReusableMethods.bekle(4);

    }
}


