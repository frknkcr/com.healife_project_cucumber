package utilities;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HealMethods {
    static AdminPage adminPage=new AdminPage();
    static Faker faker=new Faker();
   static Actions actions=new Actions(Driver.getDriver());


    public static void loginAsAdmin(String username, String password){
        Driver.getDriver().get("https://qa.heallifehospital.com/site/login");
        WebElement usernameLocate = Driver.getDriver().findElement(By.id("email"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("password"));
        passwordLocate.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }
    public static void loginAsUser(String username, String password) {
        Driver.getDriver().get("https://qa.heallifehospital.com/site/userlogin");
        WebElement usernameLocate = Driver.getDriver().findElement(By.id("email"));
        usernameLocate.sendKeys(username);

        WebElement passwordLocate = Driver.getDriver().findElement(By.id("password"));
        passwordLocate.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    public static void clickASidebarLink(String linkName){ //Sidebar (sol taraf) daki linklere isimlerini girdiginizde tiklar,
                                                        // developer'in kimisine bosluk koyup kimisine koymadigi goz onune alarak
                                                        //parametre olarak link in ismini girmelisiniz
        WebElement linkname=Driver.getDriver().findElement(By.xpath("//*[text()='"+linkName+"']"));
        linkname.click();
    }

    public static void makeSearchBoxTest(){
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        Assert.assertTrue(searchBox.isDisplayed());
        searchBox.sendKeys("testing now...");
        ReusableMethods.bekle(2);
        searchBox.clear();
        ReusableMethods.bekle(5);
    }

    public static void makeAll100Test(){

        WebElement all100=Driver.getDriver().findElement(By.xpath("(//select[@name])[1]"));
        WebElement alttakiMetin=Driver.getDriver().findElement(By.xpath("//div[@class='dataTables_info']"));
        Select select=new Select(all100);

        //=====All seciyoruz========
        select.selectByVisibleText("All");
        ReusableMethods.bekle(2);
        String text=alttakiMetin.getText();
        // System.out.println("text = " + text);
        int start = text.indexOf(" to ") + 4; // " to " ifadesinin sonrasındaki değerin başlangıç indeksini buluyoruz
        int end = text.indexOf(" ", start); // Başlangıçtan sonraki ilk boşluğa kadar olan kısmı alıyoruz

        String numberString1 = text.substring(start, end); // Başlangıçtan sonraki kısmı alıyoruz
        String numberString2 = text.substring(end + 4); // İkinci "157" değerini alıyoruz

        int number1 = Integer.parseInt(numberString1);
        int number2 = Integer.parseInt(numberString2);
        Assert.assertEquals(number1,number2); //All testinin assertion islemi

        //=====100 seciyoruz========
        //actions.moveToElement(all100);
        select.selectByVisibleText("100");
        ReusableMethods.bekle(3);
        String text2=alttakiMetin.getText();
        //System.out.println("text2 = " + text2);
        String[] words = text2.split(" "); //bosluktan bolup array e attım
        int number = Integer.parseInt(words[3]);
        //System.out.println("number = " + number);
        Assert.assertTrue(number<=100);//100 testinin assertion islemi


    }

    public static void makeIconTest(){
        String bolumBasligi=Driver.getDriver().findElement(By.xpath("//h3[@class='box-title titlefix']")).getText();
        bolumBasligi=bolumBasligi.split(" ")[0]; //bolum baslıginin ilk kelimesini aldım,her sayfada degisbiliyor

        WebElement copyIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-files-o']"));
        Assert.assertTrue(copyIcon.isDisplayed());
        copyIcon.click();
        WebElement copyText=Driver.getDriver().findElement(By.xpath("//h2[text()='Copy to clipboard']"));
        String copyTextStr=JSUtilities.getTextWithJS(Driver.getDriver(),copyText);
        Assert.assertEquals("Copy to clipboard",copyTextStr); //ekrana cikan yaziyi JS ile yakalayip assert icine atip test ediyoz


        WebElement excelIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-file-excel-o']"));
        Assert.assertTrue(excelIcon.isDisplayed());
        excelIcon.click();
        indirmeyiTestEt(bolumBasligi,".xlsx");

        WebElement csvIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-file-text-o']"));
        Assert.assertTrue(csvIcon.isDisplayed());
        csvIcon.click();
        indirmeyiTestEt(bolumBasligi,".csv");

        WebElement pdfIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-file-pdf-o']"));
        Assert.assertTrue(pdfIcon.isDisplayed());
        pdfIcon.click();
        indirmeyiTestEt(bolumBasligi,".pdf");

        WebElement printIcon=Driver.getDriver().findElement(By.xpath("//i[@class='fa fa-print']"));
        Assert.assertTrue(printIcon.isDisplayed());
        printIcon.click();
        int acilanPencereSayisi=JSUtilities.getNumberOfOpenWindows(Driver.getDriver()); //JS ile acilan pencere sayisini yakalıyoruz
        //System.out.println("acilanPencereSayisi = " + acilanPencereSayisi);
        Assert.assertTrue(acilanPencereSayisi>1); //print icin baska sayfaya gidecegi icin 1 den buyukse test pass olmalı


    }

    public static void makeFilterTest(String filterName,int filtreKacinciSirada, int toplamSutunSayisi){
        System.out.println("filterName = " + filterName);
        System.out.println("filtreKacinciSirada = " + filtreKacinciSirada);
        System.out.println("toplamFiltreSayisi = " + toplamSutunSayisi);
        ReusableMethods.bekle(3);
        WebElement filter=Driver.getDriver().findElement(By.xpath("(//th[text()='"+filterName+"'])[1]"));
        ReusableMethods.bekle(2);
        Assert.assertTrue(filter.isDisplayed());
        filter.click();
        ReusableMethods.bekle(4);
        List<String> filtreList=new ArrayList<>();
        for (int i = filtreKacinciSirada; i <=toplamSutunSayisi*100 ; i=(i+toplamSutunSayisi+1)) {
            WebElement hucreElement=Driver.getDriver().findElement(By.xpath("(//td)["+i+"]"));
            filtreList.add(hucreElement.getText());
        }
        List<String> expectedList = new ArrayList<>(filtreList);
        Collections.sort(expectedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = extractNumber(o1);
                int n2 = extractNumber(o2);
                return n1 - n2;
            }
            private int extractNumber(String s) {
                String number = s.replaceAll("\\D", "");
                return number.isEmpty() ? 0 : Integer.parseInt(number);
            }
        });
        Assert.assertEquals(filterName+" filter not functional",expectedList,filtreList);
    }
    public static void indirmeyiTestEt(String aranacakKelime,String format){
        //bu metot downloads klasöründeki dosyaları sıralar ve dosya ismi "aranacakKelime.format" içeriyor mu diye test eder
        //metoda iki parametre gonderilir ilki isim ikinci format olarak arar: or. patient.pdf
        String downloadsPath = System.getProperty("user.home") + "/Downloads";
        File downloadsFolder = new File(downloadsPath);
        File[] files = downloadsFolder.listFiles();
        boolean fileFound = false;
        for (File file : files) {
            if (file.getName().contains(aranacakKelime) || file.getName().contains(format)) {
                fileFound = true;
                break;
            }
        }
        ReusableMethods.bekle(3);
        Assert.assertTrue("Download of "+aranacakKelime+format+" not successful",fileFound);
    }

    public static void clickBlueOrAnyButton(String butonIsmi){ // parametre yollarken buton isminin
                                            //onunde bosluk olup olmadigina dikkat edip, featurea oyle yazalım
        Driver.getDriver().findElement(By.xpath("//*[text()='"+butonIsmi+"']")).click();
    }

    public static void createNewPatient(){ // +New Patient butonuna basar, bilgileri random girer save yapar, kayıt yaptığını doğrular
        Driver.getDriver().findElement(By.xpath("//span[text()='New Patient']")).click();
        adminPage.nameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.name().fullName()).perform();
        Select select=new Select(adminPage.genderDropDown);
        select.selectByIndex(faker.random().nextInt(1,2));
        adminPage.birthDateBox.sendKeys(faker.date().birthday().toString().replaceAll("0",""));
        actions.sendKeys(Keys.TAB).perform();
        int ageYear=faker.number().numberBetween(1,100);//rastgele yas (yıl olarak) int tipinde
        actions.sendKeys(Integer.toString(ageYear)).perform(); //rastgele yası toString olarak gonder
        int ageMonth=faker.number().numberBetween(1,12);//rastgele yas (ay olarak) int tipinde
        actions.sendKeys(Integer.toString(ageMonth)).perform(); //rastgele yası toString olarak gonder
        int ageDay=faker.number().numberBetween(1,30);//rastgele yas (gun olarak) int tipinde
        actions.sendKeys(Integer.toString(ageDay)).perform(); //rastgele yası toString olarak gonder
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.number().digits(5)).perform();

        select=new Select(adminPage.bloodGroupDropDown);
        select.selectByIndex(faker.number().numberBetween(1,7));

        select=new Select(adminPage.maritalStatusDropDown);
        select.selectByIndex(faker.number().numberBetween(1,5));

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.phoneNumber().phoneNumber().replaceAll("\\D","")).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.internet().emailAddress()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.address().fullAddress()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.medical().diseaseName()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.medical().symptoms()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.idNumber().valid()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("11.05.23").perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.idNumber().validSvSeSsn()).perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(faker.phoneNumber().cellPhone()).perform();

        Driver.getDriver().findElement(By.id("formaddpabtn")).click();
        WebElement basariliGrisYaziElement=Driver.getDriver().findElement(By.xpath("//div[@class='toast-message']"));
        String actualYazi=JSUtilities.getTextWithJS(Driver.getDriver(),basariliGrisYaziElement);
        Assert.assertEquals("Record Saved Successfully",actualYazi);

        ReusableMethods.bekle(4);

    }
    public static void clickIconWith3Line(int sira){ //listenin en saginda yer alan ve uzerine gelindiginde ancak
                                                    //gorunen icona tiklar. Sira sayisi parametre olarak girilmeli
        //bir sayfada mavi buton uzerinde bile 3cizgi elementi var ise ilk ona tiklayacaktir.Dikkat etmeliyiz
    WebElement iconButton=Driver.getDriver().findElement(By.xpath("(//i[@class='fa fa-reorder'])["+sira+"]"));
    JSUtilities.clickWithJS(Driver.getDriver(),iconButton);
    ReusableMethods.bekle(3);
    }
    public static void clickANameFromList(int sira){
        Driver.getDriver().findElement(By.xpath("(//td)["+sira+"]"));
    }
}
