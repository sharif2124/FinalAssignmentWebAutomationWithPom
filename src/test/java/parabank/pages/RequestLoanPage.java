package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class RequestLoanPage extends BasePage{
    public RequestLoanPage(WebDriver driver) {
        super(driver);
    }
    public RequestLoanPage LoanAmount(int loanAmount){
        General.waitForDomStable();
        getWebElement(By.id("amount")).sendKeys(String.valueOf(loanAmount));
        return this;
    }
    public RequestLoanPage DownPayment(int downPayment){
        getWebElement(By.id("downPayment")).sendKeys(String.valueOf(downPayment));
        return this;
    }
    public RequestLoanPage ClickBtn(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public boolean hasError(){
        return getWebElements(By.xpath("//h1[@class='title']")).size()>0;
    }
}
