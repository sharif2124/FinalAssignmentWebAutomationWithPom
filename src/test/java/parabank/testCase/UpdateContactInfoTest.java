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
                .fillFirstName()
                .fillLastName()
                .fillAddress()
                .fillCity()
                .fillState()
                .fillZipCode()
                .fillPhone()
                .updateClickButton();
        Assert.assertTrue(updateContactInfoPage.hasUpdateSuccess());
    }
}
