package com.citibank.testcases;

import Base.CommonAPI;
import com.citibank.pages.HomePage;
import com.citibank.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestHomePage extends CommonAPI {
    HomePage homePage;
    LoginPage loginPage;
    @BeforeMethod
    public void initElements() {
        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test()
    public void testBanking(){
        homePage.banking();
    }
    @Test()
    public void testCreditCards(){
        homePage.creditCards();
    }
     @Test()
     public void testCitiGoldAccount(){
        homePage.citiGoldAccount();
     }
    @Test()
    public void loginPageTitle() throws InterruptedException
    {
        //String title =homePage.validateHomePageTitle();
       // Assert.assertEquals(title,"Banking with Citi | Citi.com");
    }
    @Test()
    public void  citiLogoImageTest()
    {
       boolean flag = loginPage.validateCitiLogo();
       // Assert.assertTrue(flag);
    }
    @Test()
    public void loginTest() {
        homePage.login();
    }

    @Test
    public void testbrand(){
        homePage.checkbrand();
}
}
