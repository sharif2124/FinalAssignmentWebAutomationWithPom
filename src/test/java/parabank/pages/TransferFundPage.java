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
        getWebElement(By.id("amount")).sendKeys(String.valueOf(amount));
        return this;
    }

    public TransferFundPage clickTransferBtn() {
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }

    public boolean hasTransferCompleteText() {
        return getWebElement(By.className("title")).getText().trim().contains(ParaBankString.COMPLETE);
    }
}
