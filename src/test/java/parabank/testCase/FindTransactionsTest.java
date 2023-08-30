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
                .findByTransactionID(3455566)
                .clickFindByTransactionBtn()
                .findByDate("12-12-2022")
                .clickFindByDateBtn()
                .findByDateRangeBetween("12-12-2022")
                .findByDateRangeAnd("12-20-2022")
                .clickFindByDateRangeBtn()
                .findByAmount(30000)
                .clickFindByAmountBtn();

        Assert.assertTrue(findTransactionsPage.hasTransactionSuccess());
    }
}
