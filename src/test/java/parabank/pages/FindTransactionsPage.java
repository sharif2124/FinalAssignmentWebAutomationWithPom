package parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class FindTransactionsPage extends BasePage{
    public FindTransactionsPage(WebDriver driver) {
        super(driver);
    }
    public FindTransactionsPage FindByTransactionID(int transactionID){
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@id='criteria.transactionId']")).sendKeys(String.valueOf(transactionID));
        return this;
    }
    public FindTransactionsPage FindByTransactionBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }
    public FindTransactionsPage FindByDate(int findByDate){
    getWebElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys(String.valueOf(findByDate));
    return this;
    }
    public FindTransactionsPage FindByDateBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }

    public FindTransactionsPage FindByDateRangeBetween(int dateRangeBetween){
        getWebElement(By.xpath("//input[@id='criteria.fromDate']")).sendKeys(String.valueOf(dateRangeBetween));
        return this;
    }
    public FindTransactionsPage FindByDateRangeAnd(int dateRangeAnd){
        getWebElement(By.xpath("//input[@id='criteria.toDate']")).sendKeys(String.valueOf(dateRangeAnd));
        return this;
    }
    public FindTransactionsPage FindByDateRangeBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }
    public FindTransactionsPage FindByAmount(int byAmount){
        getWebElement(By.xpath("//input[@id='criteria.amount']")).sendKeys(String.valueOf(byAmount));
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
