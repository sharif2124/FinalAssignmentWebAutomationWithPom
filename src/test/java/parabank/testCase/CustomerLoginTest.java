package parabank.testCase;


import org.testng.Assert;
import org.testng.annotations.Test;
import parabank.pages.CustomerLoginPage;
import parabank.pages.HomePage;
import parabank.util.ParaBankString;

public class CustomerLoginTest extends BaseTest{
    @Test
    public void shouldLoginWithoutCredential(){
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class)
                .doLogin();
        Assert.assertTrue(loginPage.hasError());

    }
    @Test
    public void loginShouldFailWithoutPassword(){
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getUserName());
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void loginShouldFailWithoutUserName(){
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class)
                .doLogin(getPassword());
        Assert.assertTrue(loginPage.hasError());
    }
    @Test
    public void VarifyfLoginPageTitle(){
        CustomerLoginPage loginPage = page.getInstance(CustomerLoginPage.class);
        Assert.assertEquals(loginPage.getTitle(), ParaBankString.LOGIN_TITLE);

    }
  @Test(enabled = true)
    public void loginShouldSuccess(){
      HomePage homePage = page.getInstance(CustomerLoginPage.class)
              .doLogin(getUserName(),getPassword());

  }
    @Test(enabled = false)
    public void loginShouldSuccess2(){
        HomePage homePage = page.getInstance(CustomerLoginPage.class)
                .fillUsername(getUserName())
                .fillPassword(getPassword())
                .clickLoginButton();

    }

}
