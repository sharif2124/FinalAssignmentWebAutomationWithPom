package parabank.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.CustomerLoginPage;
import parabank.pages.HomePage;
import parabank.pages.OpenNewAccountPage;
import parabank.util.ParaBankString;

public class OpenNewAccountTest extends BaseTest{
    @Test(enabled = false)
    public void OpenAccountShouldSuccess(){
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        Assert.assertEquals(loginPage.getTitle(), ParaBankString.LOGIN_TITLE);
       HomePage homePage = loginPage.doLogin(getUserName(),getPassword());
       Assert.assertTrue(homePage.hasLogoutlink());
       OpenNewAccountPage openNewAccountPage =homePage.ClickOpenNewAccountLink()
               .SelectAccountType(1)
               .ClickButton();
        Assert.assertTrue(openNewAccountPage.hasAccountId());

    }
    @Test
    public void OpenAccountShouldSuccess2(){

        OpenNewAccountPage openNewAccountPage =page.getInstance(CustomerLoginPage.class)
                        .doLogin(getUserName(),getPassword())
                    .ClickOpenNewAccountLink()
                .SelectAccountType(1)
                .ClickButton();
        Assert.assertTrue(openNewAccountPage.hasAccountId());

    }

}
