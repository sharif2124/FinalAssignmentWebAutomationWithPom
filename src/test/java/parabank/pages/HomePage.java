package parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutlink(){
        return getWebElements(By.linkText("Log Out")).size()>0;
    }
    public OpenNewAccountPage ClickOpenNewAccountLink(){
        getWebElement(By.linkText("Open New Account")).click();
        return getInstance(OpenNewAccountPage.class);
    }
    public TransferFundPage clickTransferFundPage(){
        getWebElement(By.linkText("Transfer Funds")).click();
       return getInstance(TransferFundPage.class);
    }
    public AccountsOverviewPage clickAccountOverViewPage(){
        getWebElement(By.linkText("Accounts Overview")).click();
        return getInstance(AccountsOverviewPage.class);
    }
    public RequestLoanPage clickRequestLoanPage(){
        getWebElement(By.linkText("Request Loan")).click();
        return getInstance(RequestLoanPage.class);
    }
    public BillPayPage clickBillPayPage(){
        getWebElement(By.linkText("Bill Pay")).click();
        return getInstance(BillPayPage.class);
    }
}
