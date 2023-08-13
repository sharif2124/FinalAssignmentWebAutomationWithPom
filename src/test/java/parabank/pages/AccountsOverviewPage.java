package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import parabank.util.General;

public class AccountsOverviewPage extends BasePage{
    public AccountsOverviewPage(WebDriver driver) {
        super(driver);
    }
    public AccountsOverviewPage accountTable (){
        General.waitForDomStable();
      getWebElement(By.className("ng-binding")).click();
      return this;
    }
    public AccountsOverviewPage selectMonth(int Index){
        new Select(getWebElement(By.id("month"))).selectByIndex(Index);
        return this;
    }
    public AccountsOverviewPage selectType(int Index){
        new Select(getWebElement(By.xpath("//select[@id='transactionType']"))).selectByIndex(Index);
        return this;
    }
    public AccountsOverviewPage ClickButton(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public Boolean hasTransactionTable(){
        return getWebElements(By.id("transactionTable")).size()>0;
    }
}
