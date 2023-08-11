package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class RequestLoanPage extends BasePage{
    public RequestLoanPage(WebDriver driver) {
        super(driver);
    }
    public RequestLoanPage LoanAmount(){
        General.waitForDomStable();
        getWebElement(By.id("amount")).sendKeys("30000");
        return this;
    }
    public RequestLoanPage DownPayment(){
        getWebElement(By.id("downPayment")).sendKeys("12000");
        return this;
    }
    public RequestLoanPage ClickBtn(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public boolean hasError(){
        return getWebElements(By.className("error")).size()>0;
    }
}
