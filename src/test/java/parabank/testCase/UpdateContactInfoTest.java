package parabank.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.CustomerLoginPage;
import parabank.pages.UpdateContactInfoPage;

public class UpdateContactInfoTest extends BaseTest{
    @Test
    public void ProfileUpdateSuccess(){
        UpdateContactInfoPage updateContactInfoPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUserName(),getPassword())
                .clickUpdateContactInfoPage()
                .fillFirstName("John")
                .fillLastName("Smith")
                .fillAddress("1431 Main St")
                .fillCity("Beverly Hills")
                .fillState("CA")
                .fillZipCode(90210)
                .fillPhone(310-447-4121)
                .updateClickButton();
        Assert.assertTrue(updateContactInfoPage.hasUpdateSuccess());
    }
}
