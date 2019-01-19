package testHomePKG;

import Base.CommonAPI;
import homePKG.HomePage;
import homePKG.LogInPage;
import homePKG.ResetPassWord;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHomePage extends CommonAPI {
    public HomePage homePage;
    @BeforeMethod
    public void initialize() {homePage = PageFactory.initElements(driver, HomePage.class);}
    @Test
    public void clickFirstLogInBitton(){
        homePage.clickOnLoginButton();
    }

    @Test
    public void reSetAccountPassWord(){homePage.reSetPassWord();}
    @Test
    public void logInToTwitterAccount(){homePage.logInToTwitter();}
    @Test
    public void findAndFollowMisSadia(){homePage.findAndFollowMisSadia();}
    @Test
    public void tweetMrSharif(){
        homePage.TweetMrSharif();
        //homePage.clickOnMoments();
        //homePage.clickOnHomeIcon();
    }
    @Test
    public void logOutFromTwitter(){homePage.logOut();}











    /*@Test
     public void logInNsearch4Friend() {
       homePage.clickOnLoginButton();
       homePage.enterUserName();
       homePage.enterPassWord();
       homePage.UnCheckRememberMeButton();
       homePage.clickOnLoginButtonAgain();
       homePage.clickOnHOmeIcon();
       homePage.clickOnRefresh();
       homePage.clickOnViewAllTab();
       homePage.searchWhom2Follow();
       homePage.selectWhom2Follow();
       homePage.searchPeopleByName();
       homePage.clickOnSearchButton();
       homePage.clickOnPeopleTab();
       homePage.choosePeopleToFolllow();
       homePage.clickOnFollowButton();
       homePage.readJoinDate();
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       homePage.unFollowSharifAlamgir();
       homePage.readTextFollowingButton();
       homePage.clickOnHOmeIcon();
       }*/
    /*@Test
        public void followOthers() {
        homePage.clickOnHOmeIcon();
        homePage.clickOnRefresh();
        homePage.clickOnViewAllTab();
        //homePage.searchWhom2Follow();
        }*/
     /* @Test
    public void reSetPassWord(){
        homePage.clickOnLoginButton();
        homePage.clickForgotPassWordLink();
        homePage.searchAccountByEmail();
        homePage.clickOnSearchToFindTheAccount();
        homePage.radiobtnSelectedAsEmail();
        homePage.ClickContinueButton();
        homePage.pgHeaderCheckYourEmail();
    }*/
      /*public LogInPage logInPage;
    @BeforeMethod
    public void initializeLogInPage() {
        logInPage = PageFactory.initElements(driver, LogInPage.class);
    }*/



    }
