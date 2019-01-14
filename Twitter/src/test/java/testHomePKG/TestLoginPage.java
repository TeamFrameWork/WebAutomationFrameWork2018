package testHomePKG;

import Base.CommonAPI;
import homePKG.HomePage;
import homePKG.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestLoginPage extends CommonAPI {

    LogInPage logInPage;
    HomePage homePage;
    @BeforeMethod
    public void initializeLogInPage(){logInPage= PageFactory.initElements(driver, LogInPage.class);
    }
    @Test
    public void loginToMyAccount(){
        logInPage.clickOnLoginButton();
        logInPage.UnCheckRememberMeButton();
        logInPage.enterUserName();
        logInPage.enterPassWord();
        logInPage.clickOnLoginButtonAgain();
        //logInPage.clickOnProfileNsettingsIcon();
    }
   /* @Test
    public void goToHomePageByLogin() {
        logInPage.clickOnLoginButton();
        logInPage.UnCheckRememberMeButton();
        logInPage.enterUserName();
        logInPage.enterPassWord();
        logInPage.clickOnLoginButtonAgain();

        homePage.clickOnHOmeIcon();
        homePage.clickOnRefresh();
        homePage.clickOnViewAllTab();
        homePage.searchWhom2Follow();
        homePage.searchWhom2Follow();
        homePage.selectWhom2Follow();
    }*/

    }

