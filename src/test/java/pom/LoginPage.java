package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
        private By logoVerificatorPage=By.className("login_logo");
        private By loginInputLocator=By.id("user-name");
        private By passwordInputLocator=By.id("password");
        private By submitLocator=By.id("login-button");

         public LoginPage(WebDriver driver) {
        super(driver);}

    public boolean loginPageIsDisplayed() throws Exception {
             return this.isDisplayed(logoVerificatorPage);
    }

    public void loginSession() throws Exception {
       /*userName*/ this.obtenerElemento(loginInputLocator).sendKeys("standard_user");
        /*userName*/ this.obtenerElemento(passwordInputLocator).sendKeys("secret_sauce");

    }
    public void clickButton(){
        /*submit*/ this.obtenerElemento(submitLocator).click();
    }
}
