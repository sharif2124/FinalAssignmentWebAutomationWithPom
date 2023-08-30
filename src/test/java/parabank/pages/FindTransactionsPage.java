package parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;

public class FindTransactionsPage extends BasePage{
    public FindTransactionsPage(WebDriver driver) {
        super(driver);
    }
    public FindTransactionsPage findByTransactionID(int transactionID){
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@id='criteria.transactionId']")).sendKeys(String.valueOf(transactionID));
        return this;
    }
    public FindTransactionsPage clickFindByTransactionBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }
    public FindTransactionsPage findByDate(String findByDate){
    getWebElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys(findByDate);
    return this;
    }
    public FindTransactionsPage clickFindByDateBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }

    public FindTransactionsPage findByDateRangeBetween(String dateRangeBetween){
        getWebElement(By.xpath("//input[@id='criteria.fromDate']")).sendKeys(dateRangeBetween);
        return this;
    }
    public FindTransactionsPage findByDateRangeAnd(String dateRangeAnd){
        getWebElement(By.xpath("//input[@id='criteria.toDate']")).sendKeys(dateRangeAnd);
        return this;
    }
    public FindTransactionsPage clickFindByDateRangeBtn(){
        getWebElement(By.xpath("//button[@type='submit']")).click();
        return this;
    }
    public FindTransactionsPage findByAmount(int byAmount){
        getWebElement(By.xpath("//input[@id='criteria.amount']")).sendKeys(String.valueOf(byAmount));
        return this;
    }
    public FindTransactionsPage clickFindByAmountBtn(){
        getWebElement(By.xpath("//button[@class='button']")).click();
        return this;
    }
    public Boolean hasTransactionSuccess(){
        return getWebElements(By.xpath("//h1[@class='title']")).size()>0;
    }
}
