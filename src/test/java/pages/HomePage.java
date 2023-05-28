package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class HomePage extends Base {


    public HomePage() {

    }

    @FindBy(xpath = "//div[@class='team-member']//img")
    public List<WebElement> ourDoctorsResim;

    @FindBy(xpath = "//div[@class='team-member']//h4")
    public List<WebElement> ourDoctorsIsim;

    @FindBy(xpath = "//div[@class='team-member']//p")
    public List<WebElement> ourDoctorsUnvan;

    public int ourDoctorsPicturesCount() {
        return ourDoctorsResim.size();
    }






    //********************Duygu*************************************//

    // homepage > footer section
    @FindBy(xpath = "//i[@class='fa fa-pencil-square']")
    public WebElement complainIcon;

    // homepage > footer section
    @FindBy(xpath = "//a[text()='Complain']")
    public WebElement complainButton;

    //////////////////////////////////////////////////////////////////


    // homepage > Mainbanner
    @FindBy (tagName = "html")
    public WebElement MainBanner;

    // homepage > Appointment Button
    @FindBy (xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[2]/a")
    public WebElement appointmentButton;



    @FindBy (xpath = "//div[@id='navbar-collapse-3']//a[text()='Contact Us']")
    public WebElement navbarContactUs;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement contactUsName;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement contactUsEmail;

    @FindBy (xpath = "//input[@name='subject']")
    public WebElement contactUsSubject;

    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement contactUsDescription;

    @FindBy (xpath = "//input[@name='submit']")
    public WebElement contactUsSubmitButton;

    @FindBy (xpath = "//div[@class='alert alert-success']")
    public WebElement successfullyText;

    @FindBy (xpath = "//iframe[@style='border:0']")
    public WebElement contactusMap;
}
