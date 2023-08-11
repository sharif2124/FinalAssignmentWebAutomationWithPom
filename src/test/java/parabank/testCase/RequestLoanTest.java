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
                .LoanAmount()
                .DownPayment()
                .ClickBtn();
        Assert.assertTrue(requestLoanPage.hasError());

    }
}
