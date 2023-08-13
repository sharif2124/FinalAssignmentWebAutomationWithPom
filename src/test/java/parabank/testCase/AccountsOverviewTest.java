package parabank.testCase;


import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.AccountsOverviewPage;
import parabank.pages.CustomerLoginPage;

public class AccountsOverviewTest extends BaseTest{
    @Test
    public void AccountsOverViewShouldSuccess(){
      AccountsOverviewPage accountsOverviewPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickAccountOverViewPage()
                .accountTable()
                .selectMonth(0)
                .selectType(0)
                .ClickButton();
      Assert.assertTrue(accountsOverviewPage.hasTransactionTable());
    }
}
