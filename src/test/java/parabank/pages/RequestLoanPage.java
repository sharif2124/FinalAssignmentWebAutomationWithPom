package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class RequestLoanPage extends BasePage{
    public RequestLoanPage(WebDriver driver) {
        super(driver);
    }
    public RequestLoanPage fillLoanAmount(int loanAmount){
        General.waitForDomStable();
        getWebElement(By.id("amount")).sendKeys(String.valueOf(loanAmount));
        return this;
    }
    public RequestLoanPage fillDownPayment(int downPayment){
        getWebElement(By.id("downPayment")).sendKeys(String.valueOf(downPayment));
        return this;
    }
    public RequestLoanPage clickBtn(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public boolean hasError(){
        return getWebElements(By.xpath("//h1[@class='title']")).size()>0;
    }
}
