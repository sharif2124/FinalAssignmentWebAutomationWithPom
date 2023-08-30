package parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage extends BasePage{
    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    public CustomerLoginPage fillUsername(String username){
        getWebElement(By.name("username")).sendKeys("msk");
        return this;
    }
    public CustomerLoginPage fillPassword(String password){
        getWebElement(By.name("password")).sendKeys("msk");
        return this;
    }
    public HomePage clickLoginButton(){
        getWebElement(By.cssSelector("input.button")).click();
        return getInstance(HomePage.class);
    }

    public CustomerLoginPage clickLoginFail(){
        getWebElement(By.cssSelector("input.button")).click();
        return this;
    }

    public CustomerLoginPage doLogin(){
        return clickLoginFail();
    }
    public CustomerLoginPage doLogin(String userName){
        return fillUsername(userName)
                .clickLoginFail();
    }
    public HomePage doLogin(String username,String password){
        return fillUsername(username)
        .fillPassword(password)
                .clickLoginButton();
    }

    public boolean hasError(){
        return getWebElements(By.className("error")).size()>0;
    }
}
