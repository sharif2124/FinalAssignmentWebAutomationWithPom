package parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class UpdateContactInfoPage extends BasePage{
    public UpdateContactInfoPage(WebDriver driver) {
        super(driver);
    }
    public UpdateContactInfoPage FirstName(){
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
        return this;
    }
    public UpdateContactInfoPage LastName(){
        getWebElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Smith");
        return this;
    }
    public UpdateContactInfoPage Address(){
        getWebElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("1431 Main St");
        return this;
    }
    public UpdateContactInfoPage City(){
        getWebElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Beverly Hills");
        return this;
    }
    public UpdateContactInfoPage State(){
        getWebElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("CA");
        return this;
    }
    public UpdateContactInfoPage ZipCode(){
        getWebElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("90210");
        return this;
    }
    public UpdateContactInfoPage Phone(){
        getWebElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("310-447-4121");
        return this;
    }
    public UpdateContactInfoPage UpdateClickButton(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public Boolean hasUpdateSuccess(){
        return getWebElements(By.xpath("//h1[@class='title']")).size()>0;
    }
}
