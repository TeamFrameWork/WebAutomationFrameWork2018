package testHomePKG;

import java.lang.String;
import Base.CommonAPI;
import homePKG.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    public HomePage homePage;
    @BeforeMethod
    public void initializeHPg() {homePage = PageFactory.initElements(driver, HomePage.class);}

    @Test
    public void usersAreAbleToClickOnTheFirstLogInBitton(){
        homePage.clickOnLoginButton();
        String actual =driver.getCurrentUrl();
        String expect = "https://twitter.com/login";
        Assert.assertEquals(actual,expect);
    }

    @Test
    public void usersAreAbleToEnterEmailInTheUserNameField(){homePage.enterEmailInTheUserNameField(); }

    @Test
    public void usersAreAbleToEnterPassWordInThePassWordField(){homePage.enterPassWordInThePassWordField();}

    @Test//passed
    public void usersAreAbleToClickOnTheForgotPassWdLink(){homePage.clickOnForgotPassWordLink();}

    @Test//passed
    public void usersAreAbleToClickOnTheActivateYourAccountLink(){homePage.clickActivateYourAccount();}

    @Test//passed
    public void usersAreAbleToSelectRadioButtonAsText(){homePage.radioBtnSelectedAsText();}

    @Test//passed
    public void usersAreAbleToSelectRadioButtonAsEmail(){homePage.radiobtnSelectedAsEmail();}

    @Test //passed
    public void usersAreAbleToReSetAccountPassWord(){homePage.reSetPassWord();}

    @Test//passed
    public void usersAreAbleToLogInToTwitterAccount(){homePage.logInToTwitter();}

    @Test
    public void usersAreAbleToClickOnSearchIcon(){homePage.clickOnSearchIcon();}

    @Test
    public void usersAreAbleToClickOnHomeIcon(){homePage.clickOnHomeIcon();}

    @Test
    public void usersAreAbleToClickOnMomentsIcon(){homePage.clickOnMoments();}

    @Test
    public void usersAreAbleToClickOnToday(){homePage.clickOnToday();}

    @Test
    public void usersAreAbleToClickOnClickOnNews(){homePage.clickOnNews();}

    @Test
    public void usersAreAbleToClickOnClickOnSports(){homePage.clickOnSports();}

    @Test
    public void usersAreAbleToClickOnClickOnEntertainment(){homePage.clickOnEntertainment(); }

    @Test
    public void usersAreAbleToClickOnClickOnFun(){homePage.clickOnFun();}

    @Test
    public void usersAreAbleToClickOnClickOnCreateNewMoment(){homePage.clickOnCreateNewMoment();}

    @Test
    public void usersAreAbleToClickOnNotifications(){homePage.clickOnNotifications();}

    @Test
    public void usersAreAbleToClickOnAll(){homePage.clickOnAll();}

    @Test
    public void usersAreAbleToClickOnMentions(){homePage.clickOnMentions();}

    @Test
    public void usersAreAbleToClickOnSettings(){homePage.clickOnSettings();}

    @Test
    public void usersAreAbleToClickOnMutenotificationsfrompeople_Youdontfollow(){homePage.clickOnCheckBoxYouDontFollw();}

    @Test
    public void usersAreAbleToClickOnMutenotificationsfrompeople_WhoDontFollowyou(){homePage.clickOnCheckBoxWhoDontFollowYou();}

    @Test
    public void usersAreAbleToClickOnMutenotificationsfrompeople_WithAnewAccount(){homePage.clickOnCheckBoxWithNewAccount();}


    @Test
    public void usersAreAbleToClickOnMutenotificationsfrompeople_WhoHaveAdefaultProfilePhoto(){homePage.clickOnCheckBoxWithDefaultProfilePhoto();}

    @Test
    public void usersAreAbleToClickOnMutenotificationsfrompeople_WhoHaventConfirmedTheirEmail(){homePage.clickOnCheckBoxWhohaventConfirmedEmail();}

    @Test
    public void usersAreAbleToClickOnMutenotificationsfrompeople_WhoHaventConfirmedTheirPhoneNumber(){homePage.clickOnCheckBoxWhohaventConfirmedPhone();}

    @Test
    public void usersAreAbleToClickOnSeeWhoYouHaveMuted(){homePage.clickOnSeeWhoYouHaveMuted();}

    @Test
    public void usersAreAbleToClickOnSeeWhoYouHaveBlocked(){homePage.clickOnSeeWhoYouHaveBlocked();}

    @Test
    public void usersAreAbleToClickOnSaveChanges(){homePage.clickOnSaveChanges();}

    @Test
    public void usersAreAbleToClickOnClickOnViewAllTab(){homePage.clickOnViewAllTab();}

    @Test
    public void usersAreAbleToClickOnClickOnClickOnRefresh(){homePage.clickOnRefresh();}

    @Test
    public void usersAreAbleToClickOnMessagesIcon(){homePage.clickOnMessagesIcon();}

    @Test
    public void usersAreAbleToClickOnClickOnMarkAsRead(){homePage.clickOnMarkAsRead();}

    @Test
    public void usersAreAbleToClickOnNewMessage(){homePage.clickOnNewMessage();}

    @Test
    public void usersAreAbleToCreateNewMessage(){homePage.createNewMessage();}

    @Test
    public void usersAreAbleToFollowMrSharif(){homePage.findAndFollowMrSharif();}
    @Test
    public void usersAreAbleToFollowMisSadia(){homePage.findAndFollowMisSadia();}
    @Test
    public void usersAreAbleToFollowSherlockHolmse(){homePage.findAndFollowSherlockHolmes();}
    @Test
    public void usersAreAbleToFolloJamesBond(){homePage.findAndFollowJamesBond();}
    @Test
    public void usersAreAbleToFollowAngelaMarkel(){homePage.findAndFollowAngelaMerke();}
    @Test
    public void usersAreAbleToFollowChankiPande(){homePage.findAndFollowChankiPande();}
    @Test
    public void usersAreAbleToFollowTomCruise(){homePage.findAndFollowTomCruise();}

    @Test
    public void usersAreAbleToTweetMrSharif(){homePage.TweetMrSharif();}

    @Test
    public void usersAreAbleToTweetSherlockHolmse(){homePage.tweetSherlockHolmes();}

    @Test
    public void usersAreAbleToTweetJamesBond(){homePage.tweetJamesBond();}

    @Test
    public void usersAreAbleToTweetAngelaMerkel(){homePage.tweetAngelaMerke();}

    @Test
    public void usersAreAbleToTweetChankiPande(){homePage.tweetChankiPande();}

    @Test
    public void usersAreAbleToTweetTomCruise(){homePage.tweetTomCruise();}

    @Test
    public void usersAreAbleToClickOnProfileAndSettings(){homePage.ProfileAndSettings.click();}

    @Test
    public void usersAreAbleToClickOnProfile(){homePage.clickOnProfile();}

    @Test
    public void usersAreAbleToClickOnEditProfile(){homePage.clickOnEditProfile();}

    @Test
    public void usersAreAbleToClickOnSettingsAndPrivacy(){homePage.settingsAndPrivacy();}

    @Test
    public void usersAreAbleToTurnNightModeONorOFF(){homePage.TurnNightModeONorOFF();}

    @Test
    public void logOutFromTwitter(){
        homePage.logOut();
        navigateBack();
    }


    }
