package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    private By clickToCart=By.className("shopping_cart_link");
    private By removeProduct= By.id("remove-test.allthethings()-t-shirt-(red)");
    private By backTo=By.id("continue-shopping");
    private By titelCart=By.className("title");
    private By checkOutLocator=By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCart() throws Exception {
        this.clickInElement(clickToCart);
    }
    public void goToShoping() throws Exception {
        this.clickInElement(backTo);
    }

    public void removProduct() throws Exception {
        this.clickInElement(removeProduct);
    }
    public boolean titleIsPresent() throws Exception {
        return this.isDisplayed(titelCart);
    }
    public void checkoutClick() throws Exception {
        this.clickInElement(clickToCart);
    }
}
