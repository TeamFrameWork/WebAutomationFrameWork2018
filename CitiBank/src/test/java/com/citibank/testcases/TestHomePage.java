package com.citibank.testcases;

import Base.CommonAPI;
import com.citibank.pages.HomePage;
import com.citibank.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestHomePage extends CommonAPI {
    HomePage homePage;
    LoginPage loginPage;
    @BeforeMethod
    public void initializeHomePage() {
        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
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
        String title =homePage.validateHomePageTitle();
        Assert.assertEquals(title,"Banking with Citi | Citi.com");
    }
    @Test()
    public void  citiLogoImageTest()
    {
        boolean flag = loginPage.validateCitiLogo();
        Assert.assertTrue(flag);
    }
    @Test()
    public void loginTest() {
        homePage.login();
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
