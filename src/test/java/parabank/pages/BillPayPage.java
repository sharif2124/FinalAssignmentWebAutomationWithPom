package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;


public class BillPayPage extends BasePage{
    public BillPayPage(WebDriver driver) {
        super(driver);
    }
    public BillPayPage fillPayeeName(String payName){
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@name='payee.name']")).sendKeys(payName);
        return this;

    }
    public BillPayPage fillAddress(String address){
        getWebElement(By.xpath("//input[@name='payee.address.street']")).sendKeys(address);
        return this;
    }
    public BillPayPage fillCity(String city){
        getWebElement(By.xpath("//input[@name='payee.address.city']")).sendKeys(city);
        return this;
    }
    public BillPayPage fillState(String state){
        getWebElement(By.xpath("//input[@name='payee.address.state']")).sendKeys(state);
        return this;
    }
    public BillPayPage fillZipCode(int zipcode){
        getWebElement(By.xpath("//input[@name='payee.address.zipCode']")).sendKeys(String.valueOf(zipcode));
        return this;
    }
    public BillPayPage fillPhone(int phoneNumber){
        getWebElement(By.xpath("//input[@name='payee.phoneNumber']")).sendKeys(String.valueOf(phoneNumber));
        return this;
    }
    public BillPayPage fillAccount(int accountNumber){
        getWebElement(By.xpath("//input[@name='payee.accountNumber']")).sendKeys(String.valueOf(accountNumber));
        return this;
    }
    public BillPayPage fillVerifyAccount(int verifyAccount){
        getWebElement(By.xpath("//input[@name='verifyAccount']")).sendKeys(String.valueOf(verifyAccount));
        return this;
    }
    public BillPayPage fillAmount(int amount){
        getWebElement(By.xpath("//input[@name='amount']")).sendKeys(String.valueOf(amount));
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
