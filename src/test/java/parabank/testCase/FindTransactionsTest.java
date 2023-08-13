package parabank.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.CustomerLoginPage;
import parabank.pages.FindTransactionsPage;

public class FindTransactionsTest extends BaseTest{
    @Test
    public void FindTransactionsShouldSuccess(){
        FindTransactionsPage findTransactionsPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickFindTransactionsPage()
                .FindByTransactionID()
                .FindByTransactionBtn()
                .FindByDate()
                .FindByDateBtn()
                .FindByDateRangeBetween()
                .FindByDateRangeAnd()
                .FindByDateRangeBtn()
                .FindByAmount()
                .FindByAmountBtn();

        Assert.assertTrue(findTransactionsPage.hasTransactionSuccess());
    }
}
