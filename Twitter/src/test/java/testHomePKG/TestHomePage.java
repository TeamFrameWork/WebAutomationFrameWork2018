package testHomePKG;

import Base.CommonAPI;
import homePKG.HomePage;
import homePKG.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    public HomePage homePage;
    public LogInPage logInPage;
    @BeforeMethod
    public void initializeLogInPage(){logInPage= PageFactory.initElements(driver, LogInPage.class);}
    @BeforeMethod
    public void initialize(){homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void logInNsearch4Friend(){
        logInPage.clickOnLoginButton();
        logInPage.enterUserName();
        logInPage.enterPassWord();
        logInPage.UnCheckRememberMeButton();
        logInPage.clickOnLoginButtonAgain();
        logInPage.clickOnHOmeIcon();
        logInPage.clickOnRefresh();
        homePage.clickOnViewAllTab();
        homePage.searchWhom2Follow();
        homePage.selectWhom2Follow();
    }
    //@Test
    /*public void followOthers(){
        homePage.clickOnHOmeIcon();
        homePage.clickOnRefresh();
        homePage.clickOnViewAllTab();
        homePage.searchWhom2Follow();*/
    }
