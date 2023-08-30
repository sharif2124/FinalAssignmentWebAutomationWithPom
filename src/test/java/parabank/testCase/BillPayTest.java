package parabank.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.BillPayPage;
import parabank.pages.CustomerLoginPage;

public class BillPayTest extends BaseTest{
    @Test
    public void BillPayShouldSuccess(){
        BillPayPage billPayPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickBillPayPage()
                .fillPayeeName("Sharif")
                .fillAddress("SQLA")
                .fillCity("Dhaka")
                .fillState("CO")
                .fillZipCode(1205)
                .fillPhone(0070-89268)
                .fillAccount(2345677)
                .fillVerifyAccount(2345677)
                .fillAmount(12000)
                .sendPaymentButton();

        Assert.assertTrue(billPayPage.hasError());
    }
}
