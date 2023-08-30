package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import parabank.util.General;


public class OpenNewAccountPage extends BasePage{
    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public OpenNewAccountPage selectAccountType(int Index){
        General.waitForDomStable();
        new Select(getWebElement(By.id("type"))).selectByIndex(Index);
        return this;
    }
    public OpenNewAccountPage clickButton(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }
    public Boolean hasAccountId(){
        return getWebElements(By.id("newAccountId")).size()>0;
    }
}
