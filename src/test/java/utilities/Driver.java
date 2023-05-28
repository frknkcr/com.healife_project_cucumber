package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
   private Driver(){
        //SingletonPattern konusu: day12/C01_DriverSingletonPattern
        //default constructor yerine parametresiz constructor oluşturarak defaultu kaldırdık
       //access modifier'ı da private yaparak kullanimini engellemiş oluruz
    }
    //Daha fazla kontrol imkanı ve extends kullanmadan driver'a ulaşmak için
    //webDriver objesini Driver class'indaki static bir method ile oluşturacagiz
    //Ancak getDriver() her kullanildiginda yeni bir driver olusturuyor bunu engellemek
    //icin ilk kullanımda  driver=new ChromeDriver(); calissin sonraki kullanimlarda calismasin
    //diye bir yöntem gelistirmeliyiz

    public static WebDriver driver;
    static ChromeOptions ops = new ChromeOptions();

    public static WebDriver getDriver(){
        String istenenBrowser=ConfigReader.getProperty("browser");

        if (driver==null){
            switch (istenenBrowser){

                case "chrome":
                    ops.addArguments("--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(ops);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case  "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }


        return driver;
    }

    public static void closeDriver(){
       if (driver!=null){
        driver.close();
        driver=null;
       }
    }
    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
