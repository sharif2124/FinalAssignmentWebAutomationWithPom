package parabank.testCase;


import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.CustomerLoginPage;
import parabank.pages.TransferFundPage;

public class TransferFundTest extends BaseTest{
    @Test
    public void transferFundShouldSucceed() {
        TransferFundPage transferFundPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUserName(), getPassword())
                .clickTransferFundPage()
                        .fillAmount(5000.00)
                                .clickTransferBtn();
        Assert.assertTrue(transferFundPage.hasTransferCompleteText());
    }
}
