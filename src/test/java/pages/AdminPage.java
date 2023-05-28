package pages;


import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ConfigReader;

import java.util.List;

public class AdminPage extends Base{


    //Admin > Billing
    @FindBy (xpath = "(//h3[@class='box-title titlefix'])[1]")
    public WebElement singleModuleWindow;

    //Admin > Billing
    @FindBy (xpath = "(//h3[@class='box-title titlefix'])[2]")
    public WebElement opdIpdWindow;

    //Admin > Billing
    @FindBy (xpath = "//p[.='OPD']")
    public WebElement opdButton;

    //Admin > Billing > OPD
    @FindBy(id = "add")
    public WebElement addPatientButton;

    //Admin > Billing > OPD > Add Patient
    @FindBy(xpath = "//span[text()='New Patient']")
    public WebElement newPatientButton;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(id = "name")
    public WebElement nameBox;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "(//input[@name='guardian_name'])[2]")
    public WebElement guardianNameBox;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(id = "birth_date")
    public WebElement birthDateBox;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupDropDown;

    //Admin > Billing > OPD > Add Patient > New Patient
    @FindBy(xpath = "//select[@name='marital_status']")
    public WebElement maritalStatusDropDown;

    //Admin > Billing
    @FindBy (xpath = "//p[.='Pathology']")
    public WebElement pathologyButton;


    //Admin > IPD >
    @FindBy(id = "addp")
    public WebElement addPatientButtonIPD;

    //Admin > IPD > Discharged Patient Button
    @FindBy(xpath = "//a[@class=\"btn btn-primary btn-sm\"]")
    public WebElement dischargedPatientButton;

    //Admin > IPD > Discharged Patient Button > Discharged Confirmation Text
    @FindBy (xpath = "//h3[@class=\"box-title titlefix\"]")
    public WebElement ipdDischargedConfirmationText;

    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]//th")
    public List<WebElement> ipdDischargeTableHeaders;


    //********************Duygu*************************************//

    // adminLoginPage
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;
    // adminLoginPage
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    // adminLoginPage
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    ///////LOGIN METHODU///////
    public void loginAsAdmin (String username,String password){
        emailBox.sendKeys(ConfigReader.getProperty(username));
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        signInButton.click();
    }
    ///////////////////////////

    // adminpage > Navbardaki Heallife Logosu
    @FindBy(xpath = "//span[@class='logo-lg']")
    public WebElement heallifeLogo;

    // adminpage > Dashboard'daki Billing Menusu
    @FindBy(xpath = "//span[text()=' Billing']") // bu tamamını gosteriyor << (//li[@class='treeview '])[1]
    public WebElement billingMenu;

    // admin homepage > Welcome Party! duyurusu
    @FindBy(xpath = "//a[text()='Welcome Party!']") // bu tamamını gosteriyor << (//li[@class='treeview '])[1]
    public WebElement welcomePartyAnnouncement;

    // adminpage > Dashboard'daki uc cizgi seklinde olan menu ıconu
    @FindBy(xpath = "//a[@role='button']")
    public WebElement dashboardMenuIcon;

    // adminpage > Navbar Heal Life Hospital & Research Center yazisi
    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement healLifeHospitalResearchCenterText;

    //********************Duygu*************************************//
    //////////////////////////////////////////////////////////////////




}
