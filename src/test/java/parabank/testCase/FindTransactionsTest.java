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
                .FindByTransactionID(3455566)
                .FindByTransactionBtn()
                .FindByDate(12-12-2022)
                .FindByDateBtn()
                .FindByDateRangeBetween(12-12-2022)
                .FindByDateRangeAnd(12-20-2022)
                .FindByDateRangeBtn()
                .FindByAmount(30000)
                .FindByAmountBtn();

        Assert.assertTrue(findTransactionsPage.hasTransactionSuccess());
    }
}
