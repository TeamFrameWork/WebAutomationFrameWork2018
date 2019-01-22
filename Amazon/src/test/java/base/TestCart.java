package base;

import FrontPage.Cart;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCart extends Cart {
    Cart cart;
    @BeforeMethod
    public void initialization(){
        cart= PageFactory.initElements(driver,Cart.class);
        setUrl("https://www.amazon.com/");
    }

    @Override
    public void setUrl(String URL) {
        super.setUrl("");
    }

    @Test
    public void searchItem(){
        cart.ClickOnSearch();}
    @Test
    public void longTunic(){
        cart.clickOnLongTunic();}
    @Test
    public void clickOnSkirt(){
        cart.clickOnSkirt();}
}
