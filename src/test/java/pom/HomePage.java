package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
    private By logoVerificatorHome=By.className("app_logo");
    private By addToCart=By.id("add-to-cart-sauce-labs-backpack");
    private By removeToCart=By.id("remove-sauce-labs-backpack");




    private By selectToProducts=By.className("product_sort_container");
    private By addToCartSauceOnesie=By.id("add-to-cart-sauce-labs-onesie");

    private By addToCartRedChacket=By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
    private By removtoShirtRed=By.id("remove-test.allthethings()-t-shirt-(red)");








    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageIsPresent() throws Exception {
        return this.isDisplayed(logoVerificatorHome);
    }


    public void agregarAlCarrito() throws Exception {
        this.clickInElement(addToCart);
    }
    public void removeToCart() throws Exception {
        this.clickInElement(removeToCart);
    }
    public void removeShirtRed() throws Exception {
        this.clickInElement(removtoShirtRed);
    }




    public void selecAZ() throws Exception {

        WebElement productsAZ = this.obtenerElemento(selectToProducts);
        this.clickInElement(selectToProducts);

        Select dropdown = new Select(productsAZ);
        dropdown.selectByVisibleText("Name (Z to A)");
    }
    public void selecLowToHigh() throws Exception {

        WebElement productsAZ = this.obtenerElemento(selectToProducts);
        this.clickInElement(selectToProducts);

        Select dropdown = new Select(productsAZ);
        dropdown.selectByVisibleText("Price (low to high)");
    }
    public void selecHighToLow() throws Exception {

        WebElement productsAZ = this.obtenerElemento(selectToProducts);
        this.clickInElement(selectToProducts);

        Select dropdown = new Select(productsAZ);
        dropdown.selectByVisibleText("Price (high to low)");
    }

    public void addToCardCAMISETAROJA() throws Exception {
        this.clickInElement(addToCartRedChacket);
    }
    public void AddToCartSauceOnesie() throws Exception {
        this.clickInElement(addToCartSauceOnesie);
    }





}
