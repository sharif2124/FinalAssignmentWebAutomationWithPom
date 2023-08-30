package parabank.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import parabank.report.ReportTestManager;

import java.util.List;

public class BasePage extends Page{
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement webElement=null;
        try {
            waitForWebElement(locator);
            webElement=driver.findElement(locator);
            addInfoLog("has been located " + locator.toString());
        }catch (Exception e){
            System.out.println(locator.toString()+"No data found");
        }
        return webElement;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement> webElements=null;
        try {
            waitForWebElement(locator);
            webElements=driver.findElements(locator);
        }catch (Exception e){
            System.out.println(locator.toString()+"No data found");
        }
        return webElements;
    }

    @Override
    public void waitForWebElement(By locator) {
       try {
           wait.until(ExpectedConditions.presenceOfElementLocated(locator));
       }catch (Exception e){
           System.out.println(locator.toString()+"Not Loading");
       }
    }
    public void addInfoLog(String message) {
        if (ReportTestManager.getTest() != null)
            ReportTestManager.getTest().log(Status.INFO, message);
    }
}
