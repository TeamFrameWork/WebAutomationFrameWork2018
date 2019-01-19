package homePKG;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @FindBy(linkText = "Log in")
    public static WebElement loginButton1;
    public void clickOnLoginButton(){loginButton1.click();}
    @FindBy(css="Input[class='js-username-field email-input js-initial-focus']")

    public static WebElement userNameField;
    @FindBy(css="input[class='js-password-field']")
    public static WebElement passWordFiled;

    @FindBy(xpath="//label[@class=\"t1-label remember\"]//input[@name=\"remember_me\"]")
    public static WebElement chkBoxRememberMe;
    public void UnCheckRememberMeButton(){chkBoxRememberMe.click();}

    @FindBy(css = "button[class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")
    public static WebElement loginButton2;
    public void clickOnLoginButtonAgain(){loginButton2.click();}

    @FindBy(css = "a[class='Icon Icon--close Icon--medium dismiss']")
    public static WebElement closeMessageBox;
    public void click2CloseMessageBox(){closeMessageBox.click();}

    @FindBy(xpath= "//label[@class=\"t1-label remember\"]//a[@href=\"/account/begin_password_reset\" ]")
    public static WebElement forgorPasswrdLink;
    public void clickForgotPassWordLink(){forgorPasswrdLink.click();}

    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderFindYrtwitterAc;
    public void pgHeaderFindYrtwitterAcExist(){
        System.out.println("Find Your Twitter Accout Page Header Appears?:"+pgHeaderFindYrtwitterAc.isDisplayed());
    }

    @FindBy(css = "input[name='account_identifier']")
    public static WebElement enterEmailToSearchAccount;
    public void clearInputField(){enterEmailToSearchAccount.clear();}
    public void searchAccountByEmail(){
        enterEmailToSearchAccount.clear();
        enterEmailToSearchAccount.sendKeys("palash.us@live.com");}

    @FindBy(css= "input[class='Button EdgeButton--primary EdgeButton']")
    public static WebElement searchBuuton2FindUser;
    public void clickOnSearchToFindTheAccount(){searchBuuton2FindUser.click();}

    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderHWdoYouWantToRSetYourPW;
    public void pgHeaderHowDoUwantToRsetYourPassWord(){
        System.out.println("How do yu want to reset your pass word is dispaled?"+pgHeaderHWdoYouWantToRSetYourPW.isDisplayed());
    }

    @FindBy(css="input[value=\"1083494843307999232\"]")
    public static WebElement radBtnText2rsetPW;
    public void radioBtnSelectedAsText(){radBtnText2rsetPW.click();}

    @FindBy(css="input[value=\"-1\"]")
    public static WebElement radBtnEmail2rsetPW;
    public void radiobtnSelectedAsEmail(){radBtnEmail2rsetPW.click();}

    @FindBy(css= "input[class='Button EdgeButton--primary EdgeButton']")
    public static WebElement Continue4ResetLink;
    public void ClickContinueButton(){
        System.out.println("clicked on continue button to get the password reset link:");
        Continue4ResetLink.click();
    }

    @FindBy(css= "a[href=\"https://support.twitter.com/forms/signin?ref=password_reset\" ]")
    public static WebElement contactSupportLink;
    public void contactSupport(){
        contactSupportLink.isDisplayed();
        contactSupportLink.click();
    }

    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement PageHeaderRsetPwIsExist;
    @FindBy(linkText= "I didn't receive the email")
    public static WebElement checkYourEmailMessagePageDisplayed;

    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderCheckYourEmail;
    public void pgHeaderCheckYourEmail(){pgHeaderCheckYourEmail.isDisplayed();}

    @FindBy(xpath= "//*[@class=\"js-nav js-tooltip js-dynamic-tooltip\"]")
    public static WebElement homeIcon;
    public void clickOnHomeIcon(){homeIcon.click();}

    @FindBy(xpath = "//*[@id=\"global-actions\"]/li[4]/a")
    public static WebElement Messages;
    public void clickOnMessages(){Messages.click();}
    @FindBy(xpath = "//*[@id=\"dm_dialog-dialog\"]/div[2]/div[1]/div/button[2]")
    public static WebElement NewMessage;    // This feature is available under Messages.
    public void clickOnNewMessage(){NewMessage.click();}
    @FindBy(xpath = "//*[@id=\"dm_dialog-dialog\"]/div[3]/div[1]/div/div[2]/div[2]/div/ul[1]/li/textarea")
    public static WebElement EnterName;  //feature is available under Messages>NewMessage;
    @FindBy(xpath = "//*[@id=\"dm_dialog-dialog\"]/div[3]/div[1]/div/div[2]/div[3]/div/button")
    public static WebElement NextButton;    //feature avaiable under Messages>newMessages;
    public void clickOnNextButton(){NextButton.click();}

    public void enterNameNgoNextToSendMessage(){
        clickOnMessages();
        clickOnNewMessage();
        EnterName.sendKeys("hello all!");
        clickOnNextButton();
    }



    @FindBy(xpath = "//*[@id=\"global-actions\"]/li[2]/a")
    public static WebElement Moments;
    public void clickOnMoments(){Moments.click();}

    @FindBy(xpath = "//a[@href='/i/notifications']")
    public static WebElement Notifications;
    public void clickOnNotifications(){Notifications.click();}

    @FindBy(xpath = "//a[contains(text(),'Mentions') and @href='/mentions']")
    public static WebElement Mentions;   //This feature is available under Notifications
    public void clickOnMentions(){Mentions.click();}

    @FindBy(xpath = "//a[@href=\"/thepalash/following\"]//span[contains(text(),\"Following\")]")
    public static WebElement FollowingLink; //  link that shows you whome are you following
    public void clickOnFollowingLink(){   //to see who you following
        FollowingLink.click();
    }

   /* @FindBy(css = "input[class=\"flex-table-input search-query\"]")
    public static WebElement selectByName;*/
    /*@FindBy(xpath = "//input[@id='search-query']")
    public static WebElement searchtwitterbox;
    @FindBy(xpath="//span[@class='search-icon js-search-action']")
    public static WebElement searchButton2FindPeople;*/

    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div[2]/div/ul/li[3]/a")
    public static WebElement peopleTab;
    public void clickOnPeopleTab(){peopleTab.click();}

    @FindBy(xpath = "//a[contains(text(),'SHARIF ALAMGIR')and @href=\"/SharifAlamgir\"]")
    public static WebElement selectMrSharif;
    public void chooseMrsharifToFolllow(){selectMrSharif.click();}


    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[5]/div/div/span[2]/button[1]")
    public static WebElement followBtnMrsharif;
    public void clkFollowButton4MrSharif(){followBtnMrsharif.click();}

    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[3]/div/div/span[2]/button[1]")
    public static WebElement followBtnMsSadia;
    public void clkFollowButtonMsSadia(){followBtnMsSadia.click();}

    @FindBy(xpath ="//span[@data-original-title='10:18 PM - 21 Aug 2015']")
    public static WebElement joinedDate;
    public void readJoinDate(){
        System.out.println(joinedDate.getAttribute("data-original-title"));
    }

    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[5]/div/div/span[2]/button[2]")
    public static WebElement followingButton;
    public void readTextFollowingButton(){ System.out.println(followingButton.getAttribute("linkedText"));}
    public void unFollowMrSharif(){followingButton.click();}

    @FindBy(xpath="//*[@id=\"page-container\"]/div[2]/div/div/div[1]/div/div/div/div[1]/div[5]/div/div/button")
    public static WebElement tweetToSharifAlamgirBtn;
    public void clickTweetToSharifAlamgirBtn(){tweetToSharifAlamgirBtn.click();}

    @FindBy(xpath="//*[@id=\"tweet-box-global\"]")
    public static WebElement globalTweetBox;
    @FindBy(xpath ="/*[@class=\"tweet-action EdgeButton EdgeButton--primary js-tweet-btn\"]")
    public static WebElement tweetSendButton;

    @FindBy(xpath ="//*[@id=\"user-dropdown-toggle\"]")
    public static WebElement ProfileAndSettings;
    public void clickOnProfileNSettings(){
        ProfileAndSettings.click();}

    @FindBy(xpath = "//li[@id=\"signout-button\"]//button")
    public static WebElement logOutButton;
    public void logOut(){
        //homeIcon.click();
        ProfileAndSettings.click();
        logOutButton.click();
    }
    @FindBy(xpath = "//li[@class=\"current-user nightmode-toggle\"]//a")
    public static WebElement NightMode;
    public void TurnNightModeONorOFF(){
        ProfileAndSettings.click();
        NightMode.click();
    }
    @FindBy(xpath = "//button[contains(text(),\"Keyboard shortcuts\") and @class=\"dropdown-link\"]")
    public static WebElement KeyboardShortcuts;
    public void clickOnKeyboardShortcuts(){
        KeyboardShortcuts.click();}

    @FindBy(xpath = "//*[@role='presentation']//a[@href='/settings']")
    public static WebElement SettingsAndPrivacy;
    public void settingsAndPrivacy(){SettingsAndPrivacy.click();}



    @FindBy(css= "button[class='btn-link js-refresh-suggestions']")
    public static WebElement refreshButton;
    public void reFreshHomePage(){
        homeIcon.click();
        refreshButton.click();
    }
    @FindBy(linkText = "View all")
    public static WebElement viewAllTab;
    public void clickOnViewAllTab(){viewAllTab.click();}


    @FindBy(xpath = "//div[@role=\"search\"]//input[@id=\"search-query\"]")
    public static WebElement searchInput; // Twitter search Box To find People
    @FindBy(xpath="//span[@class='search-icon js-search-action']")
    public static WebElement searchIcon; // click on it to get Search Result

    @FindBy(xpath = "//a[contains(text(),'Sadia sehil') and @href=\"/Sehilsadia\"]")
    public static WebElement selectByNameSadia;



    public void reSetPassWord(){
        loginButton1.click();
        forgorPasswrdLink.click();
        enterEmailToSearchAccount.sendKeys("palash.us@live.com");
        searchBuuton2FindUser.click();
        radBtnEmail2rsetPW.click();
        Continue4ResetLink.click();
        System.out.println("user should receieve email with link to reset password"+ pgHeaderCheckYourEmail);
    }





    public void searchMrSharif(){
        searchInput.clear();
        searchInput.sendKeys("Sharif Alamgir");
        System.out.println("di it hit the enter button?");
    }

    public void clickOnSearchButton(){
        searchIcon.click();
    }







    public void searchWhom2Follow1(){
        searchInput.clear();
        searchInput.sendKeys("sadia sehil");

    }
    public void clickOnSearchIcon(){
        searchIcon.click();
    }
    public void selectWhom2Follow1(){
        selectByNameSadia.click();
    }



    public void findAndFollowMisSadia(){
        logInToTwitter();
        //clickOnHomeIcon();
        searchWhom2Follow1();
        //searchMrSharif();
        clickOnSearchButton();
        clickOnPeopleTab();
        selectWhom2Follow1();
        clkFollowButtonMsSadia();
        //clkFollowButton4MrSharif();
    }

    public void findAndFollowMrsharif(){
        logInToTwitter();
        //clickOnHomeIcon();
        searchWhom2Follow1();
        //searchMrSharif();
        clickOnSearchButton();
        clickOnPeopleTab();
        selectWhom2Follow1();
        clkFollowButtonMsSadia();
        //clkFollowButton4MrSharif();
    }
    public void TweetMrSharif(){
        logInToTwitter();
        clickOnHomeIcon();
        clickOnFollowingLink();
        chooseMrsharifToFolllow();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        clickTweetToSharifAlamgirBtn();
        globalTweetBox.sendKeys("Hello ! take my salam");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tweetSendButton.click();
    }

    /*public void tweetMrSharif(){
        homeIcon.click();
        followingButton.click();
        selectMrSharif.click();
        tweetToSharifAlamgirBtn.click();
        globalTweetBox.sendKeys("Hello! take my salam");
        tweetSendButton.click();
    }*/



    public void enterPassWord(){
        System.out.println("wrong passwd entered");
        passWordFiled.sendKeys("900090");
    }



    public void clickOnHOmeIcon(){
        System.out.println("Home Icon is clicked");
        homeIcon.click();
    }

    public void clickOnRefresh(){
        System.out.println("refresh button clicked");
        refreshButton.click();
    }


    public void logInToTwitter(){
        loginButton1.click();
        userNameField.sendKeys("palash.us@live.com");
        passWordFiled.sendKeys("!tweetMe");
        loginButton2.click();
    }

    public void enterUserName(String username){userNameField.sendKeys(username, Keys.ENTER);}
    public void enterPassword(String password){passWordFiled.sendKeys(password, Keys.ENTER);}



}
