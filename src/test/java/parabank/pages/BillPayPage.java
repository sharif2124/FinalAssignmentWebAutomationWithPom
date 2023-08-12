package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;


public class BillPayPage extends BasePage{
    public BillPayPage(WebDriver driver) {
        super(driver);
    }
    public BillPayPage PayeeName(){
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@name='payee.name']")).sendKeys("Sharif");
        return this;

    }
    public BillPayPage Address(){
        getWebElement(By.xpath("//input[@name='payee.address.street']")).sendKeys("SQLA");
        return this;
    }
    public BillPayPage City(){
        getWebElement(By.xpath("//input[@name='payee.address.city']")).sendKeys("SQLA");
        return this;
    }
    public BillPayPage State(){
        getWebElement(By.xpath("//input[@name='payee.address.state']")).sendKeys("CO");
        return this;
    }
    public BillPayPage ZipCode(){
        getWebElement(By.xpath("//input[@name='payee.address.zipCode']")).sendKeys("1205");
        return this;
    }
    public BillPayPage Phone(){
        getWebElement(By.xpath("//input[@name='payee.phoneNumber']")).sendKeys("07788993344");
        return this;
    }
    public BillPayPage Account(){
        getWebElement(By.xpath("//input[@name='payee.accountNumber']")).sendKeys("2345677");
        return this;
    }
    public BillPayPage VerifyAccount(){
        getWebElement(By.xpath("//input[@name='verifyAccount']")).sendKeys("2345677");
        return this;
    }
    public BillPayPage Amount(){
        getWebElement(By.xpath("//input[@name='amount']")).sendKeys("12000");
        return this;
    }
    public BillPayPage sendPaymentButton(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public Boolean hasError(){
       return getWebElements(By.xpath("//h1[@class='title']")).size()>0;
    }

}
