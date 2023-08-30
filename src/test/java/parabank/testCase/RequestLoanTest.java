package parabank.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.CustomerLoginPage;
import parabank.pages.RequestLoanPage;

public class RequestLoanTest extends BaseTest{
    @Test
    public void RequestLoanShouldSuccess(){
        RequestLoanPage requestLoanPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickRequestLoanPage()
                .fillLoanAmount(30000)
                .fillDownPayment(12000)
                .clickBtn();
        Assert.assertTrue(requestLoanPage.hasError());

    }
}
