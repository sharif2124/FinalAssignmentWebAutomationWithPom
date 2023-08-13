package parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class FindTransactionsPage extends BasePage{
    public FindTransactionsPage(WebDriver driver) {
        super(driver);
    }
    public FindTransactionsPage FindByTransactionID(){
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@id='criteria.transactionId']")).sendKeys("3455566");
        return this;
    }
    public FindTransactionsPage FindByTransactionBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }
    public FindTransactionsPage FindByDate(){
    getWebElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys("12-12-2022");
    return this;
    }
    public FindTransactionsPage FindByDateBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }

    public FindTransactionsPage FindByDateRangeBetween(){
        getWebElement(By.xpath("//input[@id='criteria.fromDate']")).sendKeys("12-12-2022");
        return this;
    }
    public FindTransactionsPage FindByDateRangeAnd(){
        getWebElement(By.xpath("//input[@id='criteria.toDate']")).sendKeys("12-20-2022");
        return this;
    }
    public FindTransactionsPage FindByDateRangeBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }
    public FindTransactionsPage FindByAmount(){
        getWebElement(By.xpath("//input[@id='criteria.amount']")).sendKeys("30000");
        return this;
    }
    public FindTransactionsPage FindByAmountBtn(){
        getWebElement(By.xpath("//button[@class='button']")).click();
        return this;
    }
    public Boolean hasTransactionSuccess(){
        return getWebElements(By.xpath("//h1[@class='title']")).size()>0;
    }
}
