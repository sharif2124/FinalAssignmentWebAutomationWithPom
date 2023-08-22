package parabank.testCase;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import parabank.pages.BasePage;
import parabank.pages.Page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    private Properties properties;
    Page page;
    public BaseTest(){
        try {
        String filePath =System.getProperty("user.dir")+"\\src\\test\\resources\\config properties";
        properties = new Properties();


            FileInputStream inputStream = new FileInputStream(filePath);
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public String getUserName(){
        return properties.getProperty("username");
    }
    public String getPassword(){
        return properties.getProperty("password");
    }

@BeforeClass
    public void setUpBrowser(){
    //Dynamic Browser Setup
       String browserName = properties.getProperty("browserName");
       if(Objects.equals(browserName,"chrome")){
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
       } else if (Objects.equals(browserName,"firefox")) {
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
       } else if (Objects.equals(browserName,"chromeHeadless")) {
           WebDriverManager.chromedriver().setup();
           ChromeOptions chromeOptions= new ChromeOptions();
           chromeOptions.addArguments("--headless");
           driver=new ChromeDriver(chromeOptions);
       } else if (Objects.equals(browserName,"firefoxHeadless")) {
           WebDriverManager.chromedriver().setup();
           FirefoxOptions firefoxOptions = new FirefoxOptions();
           firefoxOptions.addArguments("--headless");
           driver=new FirefoxDriver(firefoxOptions);

       }
       else {
           System.out.println("Please Provide Browser Name");
       }


    driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        page=new BasePage(driver);


    }
    @AfterMethod
    public void dearTown(){
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
