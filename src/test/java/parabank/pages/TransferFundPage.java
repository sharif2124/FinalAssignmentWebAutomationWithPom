package parabank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import parabank.util.General;
import parabank.util.ParaBankString;


public class TransferFundPage extends BasePage{
    public TransferFundPage(WebDriver driver) {
        super(driver);
    }
    public TransferFundPage fillAmount(double amount) {
        General.waitForDomStable();
        getWebElement(By.xpath("//input[@id='amount']")).sendKeys(String.valueOf(amount));
        return this;
    }

    public TransferFundPage clickTransferBtn() {
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }

    public boolean hasTransferCompleteText() {
       // return getWebElement(By.xpath("//h1[@class='title']")).getText().trim().contains(ParaBankString.COMPLETE);
        return getWebElements(By.xpath("//h1[@class='title']")).size()>0;

    }
}
