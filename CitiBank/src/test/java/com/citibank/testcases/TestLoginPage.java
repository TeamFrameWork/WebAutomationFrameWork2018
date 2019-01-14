package com.citibank.testcases;

import Base.CommonAPI;
import com.citibank.pages.HomePage;
import com.citibank.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//import static com.citibank.base.TestBase.initializationMethod;

public class TestLoginPage extends CommonAPI
{
    LoginPage loginPage;
    HomePage homePage;

    public TestLoginPage()
    {
        super();
    }
  /*  @BeforeMethod
    public void setUp()
    {
        initializationMethod();
        loginPage = new LoginPage();
    }*/

    @Test(priority = 1)
    public void loginPageTitle()
    {
        String title =loginPage.validateLoginPageTitle();
        System.out.println(title);
        //Assert.assertEquals(title,"Banking with Citi | Citi.com");
    }
    @Test(priority = 2)
    public void  citiLogoImageTest()
    {
        boolean flag = loginPage.validateCitiLogo();
        Assert.assertTrue(flag);
    }

    @Test(priority =3)
    public void loginTest()
    {
       //homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
