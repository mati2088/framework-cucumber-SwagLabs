package step_definitions;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.CartPage;
import pom.CheckoutPage;
import pom.HomePage;
import pom.LoginPage;

public class BaseTest {
    protected ChromeDriver driver= Hooks.getDriver();

    /*Instancio las paginas con sus metodos
       despues en el test extiendo de baseTest
      donde me voy ahorrar mucho codigo usando los metodos de las clases.

      ej:
         protected HomePage homePage =new HomePage(driver);
         protected ComicsPage comicsPage=new ComicsPage(driver);
     */

    protected LoginPage loginPage=new LoginPage(driver);
    protected HomePage homePage=new HomePage(driver);
    protected CartPage cartPage=new CartPage(driver);
    protected CheckoutPage checkoutPage =new CheckoutPage(driver);






    public BaseTest() throws Exception {
    }

}
