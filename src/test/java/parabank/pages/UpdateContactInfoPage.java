package parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class UpdateContactInfoPage extends BasePage{
    public UpdateContactInfoPage(WebDriver driver) {
        super(driver);
    }
    public UpdateContactInfoPage fillFirstName(String firstname){
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstname);
        return this;
    }
    public UpdateContactInfoPage fillLastName(String lastname){
        getWebElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lastname);
        return this;
    }
    public UpdateContactInfoPage fillAddress(String address){
        getWebElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(address);
        return this;
    }
    public UpdateContactInfoPage fillCity(String city){
        getWebElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
        return this;
    }
    public UpdateContactInfoPage fillState(String state){
        getWebElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(state);
        return this;
    }
    public UpdateContactInfoPage fillZipCode(int zipcode){
        getWebElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(String.valueOf(zipcode));
        return this;
    }
    public UpdateContactInfoPage fillPhone(int phone){
        getWebElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(String.valueOf(phone));
        return this;
    }
    public UpdateContactInfoPage updateClickButton(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public Boolean hasUpdateSuccess(){
        return getWebElements(By.xpath("//h1[@class='title']")).size()>0;
    }
}
