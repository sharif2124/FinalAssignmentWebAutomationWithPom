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
                .PayeeName()
                .Address()
                .City()
                .State()
                .ZipCode()
                .Phone()
                .Account()
                .VerifyAccount()
                .Amount()
                .sendPaymentButton();

        Assert.assertTrue(billPayPage.hasError());
    }
}
