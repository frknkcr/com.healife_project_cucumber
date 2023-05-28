package pages;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static utilities.Driver.driver;


public class PatientPage extends Base {
    // Userlogin >
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement entryLoginbutton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement entryEmailText;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement EntryPasswordText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Entry_SubmitButton;

    //UserLoginHomePage
    @FindBy(xpath = "//a[@role='button']")
    public WebElement homeThreeDots;

    @FindBy(xpath = "//body[@class='skin-blue fixed sidebar-mini vsc-initialized']")
    public WebElement thredotstrue;

    //HomePatientpageFlag
    @FindBy(xpath = "(//button[@type='button'])")
    public WebElement homeFlag;

    @FindBy(xpath = "//a[text()=' English']")
    public WebElement homeFlagEnglish;

    @FindBy(xpath = "//a[text()=' Turkish']")
    public WebElement homeFlagTurkish;

//PatientHome page notifications

    @FindBy(xpath = "//i[@class='fa fa-bell-o']")
    public WebElement notifications;
    @FindBy(xpath = "//h3[@class=\"box-title titlefix\"]")
    public WebElement notificationsboard;
    @FindBy(xpath = "//button[@autocomplete='off']")
    public WebElement notificationsDeletebutton;
    @FindBy(xpath = "//*[text()=\"No Record Found\"]")
    public WebElement notificationsInformation;

    //PatientHome page Profile_İmage
    @FindBy(xpath = "//img[@class='topuser-image']")
    public WebElement profileImage;
    @FindBy(xpath = "//h4[normalize-space()='ayse.nuriye.alcik']")
    public WebElement profileNametext;

    @FindBy(xpath = "//h5[text()='Patient']")
    public WebElement profilePatienttext;

    @FindBy(xpath = "//a[text()=' Change Password']")
    public WebElement profileChangepassButton;
    @FindBy(xpath = "//input[@name='current_pass']")
    public WebElement profileChangecurrentPassword;

    @FindBy(xpath = "//input[@name='new_pass']")
    public WebElement profileChangeNewPassword;
    @FindBy(xpath = "//input[@id='confirm_pass']")
    public WebElement profileConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement profileChangepasswordSubmitbutton;

    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement profileLogoutbutton;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/patient/dashboard/ipdprofile']//img[@alt='User Image']")
    public WebElement profileProfileImage;


    //Paitientpage_Dashborad_ON_Heallife_Textfield

    @FindBy(xpath = "(//img[@alt='Heal Life Hospital & Research Center'])[2]")
    public WebElement DashboardOnHeallifeText;


    @FindBy(xpath = "//span[text()=' Dashboard']")
    public WebElement dashboardButton;


    @FindBy(xpath = "//i[@class='fas fa-hospital-alt']")

    public WebElement myAppiontmentsButton;
    @FindBy(xpath = "//span[text()=' OPD']")
    public WebElement opdButton;

    @FindBy(xpath = "//span[text()=' IPD']")
    public WebElement ipdButton;
    @FindBy(xpath = "//span[text()=' Pharmacy']")
    public WebElement pharmacyButton;
    @FindBy(xpath = "//span[text()=' Pathology']")
    public WebElement pathologyButton;
    @FindBy(xpath = "//span[text()=' Radiology']")
    public WebElement radiologyButton;
    @FindBy(xpath = "//span[text()=' Ambulance']")
    public WebElement ambulanceButton;
    @FindBy(xpath = "//span[text()=' Blood Bank']")
    public WebElement bloodBankButton;

    //PatintPage  My Appointments Randevu oluşturma
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement addAppointmentsButton;
    @FindBy(xpath = "//input[@id='dates']")
    public WebElement addAppointmentDatetext;

    @FindBy(xpath = "//td[text()='27']")
    public WebElement addAppointmentDateoptionsMay27;
    @FindBy(xpath = "//td[text()='28']")
    public WebElement addAppointmentDateoptionsMay28;
    @FindBy(xpath = "//td[text()='29']")
    public WebElement addAppointmentDateoptionsMay29;
    @FindBy(xpath = "//td[text()='30']")
    public WebElement addAppointmentDateoptionsMay30;
    @FindBy(xpath = "//td[text()='31']")
    public WebElement addAppointmentDateoptionsMay31;


    @FindBy(xpath = "//select[@name='specialist']")
    public WebElement addAppointmentSpecialistButton;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement addAppointmentSpecialistValue;

    @FindBy(xpath = "//select[@name='doctor']")
    public WebElement addAppointmentsDoctorbutton;
    @FindBy(xpath = "//option[@value='56']")
    public WebElement addAppointmentdoctorAysenuriye;
    @FindBy(xpath = "//select[@name='global_shift']")
    public WebElement addAppointmentsShiftButton;
    @FindBy(xpath = "(//option[@value='3'])[2]")
    public WebElement addAppointmentsshiftEvening;

    @FindBy(xpath = "//select[@name='shift']")
    public WebElement addAppointmentsslotButton;
    @FindBy(xpath = "//option[@value='470']")

    public WebElement addAppointmentsSlot04PM;
    @FindBy(xpath = "//select[@name='priority']")
    public WebElement addAppointmentsPrioritybutton;

    @FindBy(xpath = "(//option[@value='1'])[3]")
    public WebElement addAppointmentpriorityNormal;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement addAppointmentsmessageText;

    @FindBy(xpath = "//span[@id='slot_0']")
    public WebElement addAppointmentsslot04;
    @FindBy(xpath = "//span[@id='slot_1']")
    public WebElement addAppointmentsslot0410;
    @FindBy(xpath = "//span[@id='slot_2']")
    public WebElement addAppointmentsslot0420;
    @FindBy(xpath = "//span[@id='slot_3']")
    public WebElement addAppointmentsslot0430;
    @FindBy(xpath = "//span[@id='slot_4']")
    public WebElement addAppointmentsslot0440;
    @FindBy(xpath = "//span[@id='slot_5']")
    public WebElement addAppointmentsslot0450;
    @FindBy(xpath = "//button[@id='formaddbtn']")
    public WebElement addAppointmentsSaveButton;

    //mypatientShowButton

    @FindBy(xpath = "(//a[@href='#'])[9]")
    public WebElement myAppointmentsShowButton;

    @FindBy(xpath = "//button[@data-original-title='Close']")
    public WebElement myAppointmentsShowcloseButton;
    //myAppointmentdelete
    @FindBy(xpath = "//a[@data-original-title='Delete']")
    public WebElement myAppointmentdeleteButton;

    //MyAppointmentPAY
    @FindBy(xpath = "//*[text()='  Pay']")
    public WebElement myAppiontmentsPaybutton;

    @FindBy(xpath = "//*[text()='Pay with Card']")
    public WebElement myAppointmentsPaywithCardbutton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement myAppointmentsEmailtext;
    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement myAppointmentsCardnumberText;
    @FindBy(xpath = "//input[@id='cc-exp']")
    public WebElement myAppointmentsMMYYText;
    @FindBy(xpath = "//input[@id='cc-csc']")
    public WebElement myAppointmentsCVCText;
    @FindBy(xpath = "//button[@tabindex='2']")
    public WebElement myAppoinmentsSecondPaybutton;
    //MypAppoinmetSeachtext
    @FindBy(xpath = "//input[@type='search']")
    public WebElement myAppoinmetSeachtext;
    @FindBy(xpath = "//tr[@class='odd']/td[1]")
    public WebElement myAppointmentApointmentno;
    //MyAppoinments NextPage
    @FindBy(xpath = "//*[text()='2']")
    public WebElement myAppoinmentsSecondPageButton;
    @FindBy(xpath = "//*[text()='']")
    public WebElement myAppoinmentsFirstPageButton;

    @FindBy(xpath = "//*[text()='Records: 1 to 10 of 12']")
    public WebElement myAppointmentsFirstpageDetails;

    @FindBy(xpath = "//*[text()='Records: 11 to 12 of 12']")
    public WebElement myAppointmentsSecondspageDetails;
    @FindBy(xpath = "//ul[@class='list-group list-group-unbordered']\n")
    public WebElement myInformations;





    public static void checkHeaderExistence(WebElement element) {

        String[] headerNames = {"Patient Id", "Gender", "Marital Status", "Phone", "Email", "Address", "Age", "Guardian Name", "Username", "Password"};

        for (String headerName : headerNames) {
            List<WebElement> headerElements = element.findElements(By.xpath("//li[b='" + headerName + "']"));
            if (headerElements.size() > 0) {
                System.out.println(headerName + " exists");
            } else {
                System.out.println(headerName + " does not exist");
            }
        }
    }

        public  static  boolean checkTableHeadersExist(WebElement table) {
            List<WebElement> headers = table.findElements(By.tagName("th"));
            String[] expectedHeaders = {"Appointment No", "Appointment Date", "Priority", "Specialist", "Doctor", "Status", "Message", "Action"};

            if (headers.size() != expectedHeaders.length) {
                return false;
            }

            for (int i = 0; i < expectedHeaders.length; i++) {
                if (!headers.get(i).getText().equals(expectedHeaders[i])) {
                    return false;
                }
            }

        return true;
    }

    public  void userLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        entryLoginbutton.click();
        entryEmailText.sendKeys(ConfigReader.getProperty("usernameAysenuriye"));
        EntryPasswordText.sendKeys(ConfigReader.getProperty("userPassword"));
        Entry_SubmitButton.click();



    }









    public void myAppointmentsAddAppointment(){
        userLogin();
        myAppiontmentsButton.click();
        addAppointmentsButton.click();
        addAppointmentDatetext.click();
        addAppointmentDateoptionsMay27.click();
        addAppointmentSpecialistButton.click();
        addAppointmentSpecialistValue.click();
        addAppointmentsDoctorbutton.click();
        addAppointmentdoctorAysenuriye.click();
        addAppointmentsShiftButton.click();
        addAppointmentsshiftEvening.click();
        addAppointmentsslotButton.click();
        addAppointmentsSlot04PM.click();
        addAppointmentsmessageText.sendKeys("HASTAA");
        addAppointmentsslot04.click();
        addAppointmentsSaveButton.click();


    }

        public void testStatusChangeMessage() {
            // Assume that the language has been changed successfully
            String message = "Status Change Successfully";


            // Get the message element from the page
            String pageSource = driver.getPageSource();
            Assert.assertTrue(pageSource.contains(message));
        }
    //Pharmacy page=============================================//=======================

    @FindBy(xpath = "//h3[@class='box-title titlefix']")
    public WebElement pharmacyBillText;


    @FindBy(xpath = "//span[text()=' Pharmacy']")
    public WebElement pharmacySideBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[text()='PHARMAB43']")
    public WebElement pharmacyText;

    @FindBy(xpath = "(//i[@class='fa fa-money'])[1]")
    public WebElement wievAllBox;

    @FindBy(xpath = "(//th[text()='Date'])[1]")
    public WebElement dateText;

    @FindBy(xpath = "(//button[@class='close'])[3]")
    public WebElement pharmacyCloseButton;

    @FindBy(xpath = "(//i[@class='fa fa-reorder'])[1]")
    public WebElement pharmacyShowButton;

    @FindBy(xpath = "//td[text()='ayse.busra.pehlivan (338)']")
    public WebElement pharmacyNameText;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-xs'])[6]")
    public WebElement pharmacyPayButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement pharmacyPaymenAmount;

    @FindBy(xpath = "//button[@id='pay_button']")
    public WebElement pharmacyAddButton;

    @FindBy(xpath = "//span[text()='Pay with Card']")
    public WebElement pharmacyPayWithCard;

    @FindBy(xpath = "(//input[@class='control'])[1]")
    public WebElement pharmacyEmailBox;

    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement pharmacyCardNumberBox;

    @FindBy(xpath = "//div[@class='bodyView']//button[@id='submitButton']")
    public WebElement pharmacyPayBox;

    @FindBy(xpath = "//i[@class='fa fa-check']")
    public WebElement pharmacySuccesfulText;


    @FindBy(xpath = "(//button[@class='close'])[2]")
    public WebElement pharmacyClose;



    public static boolean baslikListelemeMethod(String data) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//th[@aria-controls='DataTables_Table_0']"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        System.out.println(baslikListesiActual);
        String[] liste = data.split(", ");
        int count = 0;

        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).contains(liste[i])) {
                    count++;
                }
            }
        }
        if (count == liste.length) {
            return true;
        }

        return false;
    }

    public static boolean intListSortTest ( int sutunNo){
        WebElement baslik = Driver.getDriver().findElement(By.xpath("(//th[@aria-controls='DataTables_Table_0'])[" + sutunNo + "]"));
        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[" + sutunNo + "]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().replaceAll("[^\\d]", ""));
        }
        System.out.println(ActualStringList);


        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;

    }
}


















