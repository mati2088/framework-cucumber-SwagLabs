package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    private By checkoutLocator=By.id("checkout");
    private By firstNameLocator=By.id("first-name");
    private By lastNameLocator=By.id("last-name");
    private By postalCodeLocator=By.id("postal-code");
    private By continuButtonLocator=By.id("continue");
    private By paymentTextLocator=By.className("summary_total_label");
    private By finishButtonLocator=By.id("finish");
    private By completeFinishLocator=By.className("complete-header");
    private By backToHomeButtonLocator=By.id("back-to-products");


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckout() throws Exception {
        this.clickInElement(checkoutLocator);
    }
    public void sendFirstName(){
        this.obtenerElemento(firstNameLocator).sendKeys("juan");
    }
    public void sendLastName(){
        this.obtenerElemento(lastNameLocator).sendKeys("lopez");
    }
    public void sendPostalCode(){
        this.obtenerElemento(postalCodeLocator).sendKeys("300");
    }
    public void clickContinue() throws Exception {
        this.clickInElement(continuButtonLocator);
    }
    public Boolean paymentTextIsPresent() throws Exception {
        return this.isDisplayed(paymentTextLocator);
    }
    public void clickFinish() throws Exception {
        this.clickInElement(finishButtonLocator);
    }
    public Boolean completeFinishIsPresent() throws Exception {
        return this.isDisplayed(completeFinishLocator);
    }
    public void clickBackToHome() throws Exception {
        this.clickInElement(backToHomeButtonLocator);
    }


}
