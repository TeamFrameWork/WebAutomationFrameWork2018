package homeTest;

import Base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
HomePage homePage;
    @BeforeMethod
    public void initialization(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        setUp("https://www.nbc.com");
    }
    @Test
    public void test1(){

        searchPage();
    }
}
