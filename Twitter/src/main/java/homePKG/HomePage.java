package homePKG;
import java.lang.String;
import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @FindBy(linkText = "Log in")
    public static WebElement loginButton1;

    @FindBy(css="Input[class='js-username-field email-input js-initial-focus']")
    public static WebElement userNameField;

    @FindBy(css="input[class='js-password-field']")
    public static WebElement passWordFiled;

    @FindBy(xpath="//label[@class=\"t1-label remember\"]//input[@name=\"remember_me\"]")
    public static WebElement chkBoxRememberMe;

    @FindBy(xpath="//div[@class=\"clearfix\"]//button[contains(text(),'Log in') and @class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")
    public static WebElement loginButton2;

    @FindBy(css = "a[class='Icon Icon--close Icon--medium dismiss']")
    public static WebElement closeMessageBox;

    @FindBy(xpath= "//label[@class=\"t1-label remember\"]//a[@href=\"/account/begin_password_reset\" ]")
    public static WebElement forgotPasswrdLink;

    @FindBy(linkText = "Activate your account »")
    public static WebElement activateYouraccount;



    @FindBy(css = "input[name='account_identifier']")
    public static WebElement enterEmailToSearchAccount;


    @FindBy(css= "input[class='Button EdgeButton--primary EdgeButton']")
    public static WebElement searchBuuton2FindUser;



    @FindBy(css="input[value=\"1083494843307999232\"]")
    public static WebElement radBtnText2rsetPW;


    @FindBy(css="input[value=\"-1\"]")
    public static WebElement radBtnEmail2rsetPW;

    @FindBy(css= "input[class='Button EdgeButton--primary EdgeButton']")
    public static WebElement Continue4ResetLink;

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


    @FindBy(xpath= "//*[@class=\"js-nav js-tooltip js-dynamic-tooltip\"]")
    public static WebElement homeIcon;


    @FindBy(xpath = "//span[contains(text(),'Following') and @class=\"ProfileCardStats-statLabel u-block\"]")
    public static WebElement following;

    public void clickOnFollowing(){following.click();}

    @FindBy(xpath = "//*[@id=\"global-actions\"]/li[4]/a")
    public static WebElement Messages;

    @FindBy(xpath = "//*[@id=\"dm_dialog-dialog\"]/div[2]/div[1]/div/button[1]")
    public static WebElement MarkAsRead;

    @FindBy(xpath = "//*[@id=\"dm_dialog-dialog\"]/div[2]/div[1]/div/button[2]")
    public static WebElement NewMessage;    // This feature is available under Messages.

    @FindBy(xpath = "//*[@id=\"dm_dialog-dialog\"]/div[3]/div[1]/div/div[2]/div[2]/div/ul[1]/li/textarea")
    public static WebElement EnterName;  //feature is available under Messages>NewMessage;
    @FindBy(xpath = "//*[@id=\"dm_dialog-dialog\"]/div[3]/div[1]/div/div[2]/div[3]/div/button")
    public static WebElement NextButton;    //feature avaiable under Messages>newMessages;


    @FindBy(xpath = "//*[@id=\"global-actions\"]/li[2]/a")
    public static WebElement Moments;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/ul/li[1]/a")
    public static WebElement Today;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/ul/li[2]/a")
    public static WebElement News;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/ul/li[3]/a")
    public static WebElement Sports;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/ul/li[4]/a")
    public static WebElement Entertainment;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/ul/li[5]/a")
    public static WebElement Fun;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/button")
    public static WebElement CreateNewMoment;

    @FindBy(xpath = "//a[@href='/i/notifications']")
    public static WebElement Notifications;

    @FindBy(xpath = "//*[@id=\"content-main-heading\"]/div/div/ul/li[1]/a")
    public static WebElement All;

    @FindBy(xpath = "//a[contains(text(),'Mentions') and @href='/mentions']")
    public static WebElement Mentions;   //This feature is available under Notifications

    @FindBy(xpath = "//*[@id=\"content-main-heading\"]/div/div/ul/a")
    public static WebElement Settings;


    @FindBy(css = "#following_filter_enabled")
    public static WebElement checkBoxYouDontFollw;

    @FindBy(css = "#filter_not_followed_by_enabled")
    public static WebElement checkBoxWhoDontFollowYou;


    @FindBy(css = "#filter_new_users_enabled")
    public static WebElement checkBoxWithNewAccount;

    @FindBy(css = "#filter_default_profile_image_enabled")
    public static WebElement checkBoxWithDefaultProfilePhoto;


    @FindBy(css = "#filter_no_confirmed_email_enabled")
    public static WebElement checkBoxWhohaventConfirmedEmail;

    @FindBy(css = "#filter_no_confirmed_phone_enabled")
    public static WebElement checkBoxWhohaventConfirmedPhone;

    @FindBy(xpath = "//*[@id=\"account-form\"]/fieldset[2]/div/p[2]/a[1]")
    public static WebElement SeeWhoYouHaveMuted;

    @FindBy(xpath = "//*[@id=\"account-form\"]/fieldset[2]/div/p[2]/a[2]")
    public static WebElement SeeWhoYouHaveBlocked;

    @FindBy(xpath = "//*[@id=\"settings_save\"]")
    public static WebElement SaveChanges;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div[1]/div/div[2]/ul/li[2]/a/span[1]")
    public static WebElement FollowingLink;

    /*
    @FindBy(xpath = "//li[@class=\"ProfileCardStats-stat Arrange-sizeFit\"]//span[contains(text(),\"Following\")]")
    public static WebElement FollowingLink; //  link that shows whome are you following
*/

    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div[2]/div/ul/li[3]/a")
    public static WebElement peopleTab;


    @FindBy(xpath ="//span[@data-original-title='10:18 PM - 21 Aug 2015']")
    public static WebElement joinedDate;

    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[5]/div/div/span[2]/button[2]")
    public static WebElement followingButton;

    public void unFollowMrSharif(){followingButton.click();}
    @FindBy(xpath="//*[@id=\"page-container\"]/div[2]/div/div/div[1]/div/div/div/div[1]/div[5]/div/div/button")
    public static WebElement tweetToButton;

    @FindBy(xpath="//*[@id=\"tweet-box-global\"]")
    public static WebElement globalTweetBox;
    @FindBy(xpath ="/*[@class=\"tweet-action EdgeButton EdgeButton--primary js-tweet-btn\"]")
    public static WebElement tweetSendButton;
    @FindBy(xpath ="//*[@id=\"user-dropdown-toggle\"]")
    public static WebElement ProfileAndSettings;

    @FindBy(xpath = "//*[@id=\"user-dropdown\"]/div/ul/li[3]/a")
    public static WebElement Profile;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[6]/div/button")
    public static WebElement Editprofile;

    @FindBy(xpath = "//li[@id=\"signout-button\"]//button")
    public static WebElement logOutButton;

    @FindBy(xpath = "//li[@class=\"current-user nightmode-toggle\"]//a")
    public static WebElement NightMode;

    @FindBy(xpath = "//button[contains(text(),\"Keyboard shortcuts\") and @class=\"dropdown-link\"]")
    public static WebElement KeyboardShortcuts;
    public void clickOnKeyboardShortcuts(){KeyboardShortcuts.click();}
    @FindBy(xpath = "//*[@role='presentation']//a[@href='/settings']")
    public static WebElement SettingsAndPrivacy;

    @FindBy(css= "button[class='btn-link js-refresh-suggestions']")
    public static WebElement refreshButton;

    @FindBy(linkText = "View all")
    public static WebElement viewAllTab;

    @FindBy(xpath = "//div[@role=\"search\"]//input[@id=\"search-query\"]")
    public static WebElement searchInput; // Twitter search Box To find People
    @FindBy(xpath="//span[@class='search-icon js-search-action']")
    public static WebElement searchIcon; // click on it to get Search Result
    @FindBy(xpath = "//a[contains(text(),'Sadia sehil') and @href=\"/Sehilsadia\"]")
    public static WebElement selectByNameSadia;


    @FindBy(xpath = "//a[contains(text(),'Sadia sehil') and @class=\"fullname ProfileNameTruncated-link u-textInheritColor js-nav\"]")
    public static WebElement profileSadiaSehil;

    @FindBy(xpath = "//a[contains(text(),'SHARIF ALAMGIR')]")
    public static WebElement profileSharifAlamgir;

    @FindBy(xpath = "//a[contains(text(),'Sherlock Holmes') and @class=\"fullname ProfileNameTruncated-link u-textInheritColor js-nav\"]")
    public static WebElement profileSherlockHolmse;

    @FindBy(xpath = "//a[contains(text(),'James Bond') and @class=\"fullname ProfileNameTruncated-link u-textInheritColor js-nav\"]")
    public static WebElement profileJamesBond;

    @FindBy(xpath = "//div[@class='u-textTruncate u-inlineBlock']//a[@href='/Queen_Europe']")
    public static WebElement profileAngelaMerkel;

    @FindBy(css = "#stream-item-user-837854677265952769 > div > div > div.ProfileCard-userFields > span")
    public static WebElement profileChankiPande;

    @FindBy(xpath = "//a[contains(text(),'Tom Cruise') and @class=\"fullname ProfileNameTruncated-link u-textInheritColor js-nav\"]")
    public static WebElement profileTomCruise;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[5]/div/div/span[2]/button[1]")
    public static WebElement followButtonMrsharif;

    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[4]/div/div/span[2]/button[1]")
    public static WebElement followButtonMsSadia;

    @FindBy(xpath="//*[@id=\"stream-item-user-752684407\"]/div/div/div[1]/div/div/div/span[2]/button[1]")
    public static WebElement followButtonSherlockHolmes;

    @FindBy(xpath="//*[@id=\"stream-item-user-389229444\"]/div/div/div[1]/div/div/div/span[2]/button[1]")
    public static WebElement followButtonJamesBond;

    @FindBy(xpath="//*[@id=\"stream-item-user-407347022\"]/div/div/div[1]/div/div/div/span[2]/button[1]")
    public static WebElement followButtonAngelaMerkel;

    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[5]/div/div/span[2]/button[1]")
    public static WebElement followButtonChankiPande;

    @FindBy(xpath="//*[@id=\"stream-item-user-48410093\"]/div/div/div[1]/div/div/div/span[2]/button[1]")
    public static WebElement followButtonTomCruise;


    public void clickOnLoginButton(){loginButton1.click();}

    public void enterUsername(){userNameField.sendKeys("team.jan2019@yahoo.com"); }

    public void enterUserName(String email){userNameField.sendKeys(email);}

    public void enterEmailInTheUserNameField(){
        loginButton1.click();
        userNameField.sendKeys("team.jan2019@yahoo.com");
    }

    public void enterPassWord(){passWordFiled.sendKeys("!tweetme");}

    public void enterPassWordInThePassWordField(){
        loginButton1.click();
        passWordFiled.sendKeys("!tweetme");
    }


    public void clickOnForgotPassWordLink(){
        loginButton1.click();
        forgotPasswrdLink.click();
        driver.navigate().to("https://twitter.com/login");
    }

    public void clickActivateYourAccount(){
        loginButton1.click();
        activateYouraccount.click();
        driver.navigate().back();
    }

    public void UnCheckRememberMeButton(){chkBoxRememberMe.click();}

    public void clickOnLoginButtonAgain(){loginButton2.click();}

    public void click2CloseMessageBox(){closeMessageBox.click();}

    public void clickOnHomeIcon(){
        logInToTwitter();
        homeIcon.click();
    }

    public void clickOnMoments(){
        logInToTwitter();
        Moments.click();
    }

    public void clickOnToday(){
        logInToTwitter();
        clickOnMoments();
        Today.click();

    }

    public void clickOnNews(){
        logInToTwitter();
        clickOnMoments();
        News.click();
    }

    public void clickOnSports(){
        logInToTwitter();
        clickOnMoments();
        Sports.click();
    }

    public void clickOnEntertainment(){
        logInToTwitter();
        clickOnMoments();
        Entertainment.click();
    }

    public void clickOnFun(){
        logInToTwitter();
        clickOnMoments();
        Fun.click();
    }

    public void clickOnCreateNewMoment(){
        logInToTwitter();
        clickOnMoments();
        CreateNewMoment.click();
    }


    public void clickOnNotifications(){
        logInToTwitter();
        Notifications.click();
    }

    public void clickOnAll(){
        logInToTwitter();
        Notifications.click();
        All.click();
    }

    public void clickOnMentions(){//This feature is available under Notifications
        logInToTwitter();
        Notifications.click();
        Mentions.click();
    }

    public void clickOnSettings(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
    }

    public void clickOnCheckBoxWithDefaultProfilePhoto(){
    logInToTwitter();
    Notifications.click();
    Settings.click();
    checkBoxWithDefaultProfilePhoto.click();
    }

    public void clickOnCheckBoxYouDontFollw(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
        checkBoxYouDontFollw.click();
    }

    public void clickOnCheckBoxWhoDontFollowYou(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
        checkBoxWhoDontFollowYou.click();
    }

    public void clickOnCheckBoxWithNewAccount(){
        Notifications.click();
        Settings.click();
        checkBoxWithNewAccount.click();
    }


    public void clickOnCheckBoxWhohaventConfirmedEmail(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
        checkBoxWhohaventConfirmedEmail.click();
    }

    public void clickOnCheckBoxWhohaventConfirmedPhone(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
        checkBoxWhohaventConfirmedPhone.click();
    }

    public void clickOnSeeWhoYouHaveMuted(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
        SeeWhoYouHaveMuted.click();
    }

    public void clickOnSeeWhoYouHaveBlocked(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
        SeeWhoYouHaveBlocked.click();
    }

    public void clickOnSaveChanges(){
        logInToTwitter();
        Notifications.click();
        Settings.click();
        checkBoxWhoDontFollowYou.click();
        SaveChanges.click();
    }

    public void clickOnViewAllTab(){
        logInToTwitter();
        Notifications.click();
        viewAllTab.click();
    }

    public void clickOnRefresh(){
        logInToTwitter();
        Notifications.click();
        refreshButton.click();
    }

    public void clickOnMessagesIcon(){
        logInToTwitter();
        Messages.click();
    }

    public void clickOnMarkAsRead(){
        logInToTwitter();
        Messages.click();
        MarkAsRead.click();
    }
    public void clickOnNewMessage(){
        logInToTwitter();
        Messages.click();
        NewMessage.click();

    }

    public void createNewMessage(){
        logInToTwitter();
        Messages.click();
        clickOnNewMessage();
        EnterName.sendKeys("hello all!");
        NextButton.click();
    }

    public void readJoinDate(){
        System.out.println(joinedDate.getAttribute("data-original-title"));
    }
    public void readTextFollowingButton(){ System.out.println(followingButton.getAttribute("linkedText"));}

    public void clickOnProfileNSettings(){
        logInToTwitter();
        ProfileAndSettings.click();
    }

    public void clickOnProfile(){
        logInToTwitter();
        ProfileAndSettings.click();
        Profile.click();
    }
    public void clickOnEditProfile(){
        logInToTwitter();
        ProfileAndSettings.click();
        Profile.click();
        Editprofile.click();
    }
    public void settingsAndPrivacy(){
        logInToTwitter();
        ProfileAndSettings.click();
        SettingsAndPrivacy.click();
    }

    public void TurnNightModeONorOFF(){
        logInToTwitter();
        ProfileAndSettings.click();
        NightMode.click();
    }
    public void logOut(){
        logInToTwitter();
        ProfileAndSettings.click();
        logOutButton.click();
    }

    public void clearInputField(){enterEmailToSearchAccount.clear();}

    public void searchAccountByEmail(){
        enterEmailToSearchAccount.clear();
        enterEmailToSearchAccount.sendKeys("team.jan2019@yahoo.com");
    }



    public void clickOnSearchToFindTheAccount(){searchBuuton2FindUser.click();}


    public void ClickContinueButton(){
        System.out.println("clicked on continue button to get the password reset link:");
        Continue4ResetLink.click();
    }

    public void radioBtnSelectedAsText(){
        loginButton1.click();
        forgotPasswrdLink.click();
        enterEmailToSearchAccount.sendKeys("team.jan2019@yahoo.com");
        searchBuuton2FindUser.click();
        radBtnEmail2rsetPW.click();
        radBtnText2rsetPW.click();
    }


    public void radiobtnSelectedAsEmail(){
        loginButton1.click();
        forgotPasswrdLink.click();
        enterEmailToSearchAccount.sendKeys("team.jan2019@yahoo.com");
        searchBuuton2FindUser.click();
        radBtnEmail2rsetPW.click();

    }




    public void reSetPassWord(){
        loginButton1.click();
        forgotPasswrdLink.click();
        enterEmailToSearchAccount.sendKeys("team.jan2019@yahoo.com");
        searchBuuton2FindUser.click();
        radBtnEmail2rsetPW.click();
        Continue4ResetLink.click();
    }

    public void clickOnPeopleTab(){peopleTab.click();}

    public void clickOnFollowingLink(){
        logInToTwitter();
        clickOnHomeIcon();
        FollowingLink.click();
    }

    public void searchMissSadia(){
        searchInput.clear();
        searchInput.sendKeys("Sadia Sehil");
        searchIcon.click();
    }

    public void searchMrSharif(){
        searchInput.clear();
        searchInput.sendKeys("Sharif Alamgir");
        searchIcon.click();
    }

    public void searchSherlockHolmes(){
        searchInput.clear();
        searchInput.sendKeys("Sherlock Holmes");
        searchIcon.click();
    }

    public void searchJamesBond(){
        searchInput.clear();
        searchInput.sendKeys("James Bond");
        searchIcon.click();
    }

    public void searchAngelaMerkel(){
        searchInput.clear();
        searchInput.sendKeys("Angela Merkel");
        searchIcon.click();
    }
    public void searchChankiPande(){
        searchInput.clear();
        searchInput.sendKeys("Chanki Pande");
        searchIcon.click();
    }

    public void searchTomCruise(){
        searchInput.clear();
        searchInput.sendKeys("Tom Cruise");
        searchIcon.click();
    }


    public void clickOnProfileSherlockHolmse(){profileSherlockHolmse.click();}

    public void clickOnProfileJamesBond(){profileJamesBond.click();}

    public void clickOnProfileAngelaMerkel(){profileAngelaMerkel.click();}

    public void clickOnProfileChankiPande(){profileChankiPande.click();}

    public void clickOnProfileTomCruise(){profileTomCruise.click();}

    public void clickOnProfileSharifAlamgir(){profileSharifAlamgir.click();}

    public void clickOnProfileSadiaSehil(){profileSadiaSehil.click();}


    public void clickFollowButtonSherlockHolmes(){followButtonSherlockHolmes.click();}

    public void clickFollowButtonJamesBond(){followButtonJamesBond.click();}

    public void clickFollowButtonAngelaMerkel(){followButtonAngelaMerkel.click();}

    public void clickFollowButtonChankiPande(){followButtonChankiPande.click();}

    public void clickFollowButtonTomCruise(){followButtonTomCruise.click();}

    public void clickFollowButtonMissSadia(){followButtonMsSadia.click();}

    public void clickFollowButtonMrSharif(){followButtonMrsharif.click();}



    public void clickOnSearchButton(){
        searchIcon.click();
    }

    public void clickOnTweetToButton(){tweetToButton.click();}


    /*public void searchWhom2Follow2(){
        searchInput.clear();
        searchInput.sendKeys("van dam");
    }*/

    public void clickOnSearchIcon(){
        logInToTwitter();
        enterUsername();
        enterPassWord();
        searchIcon.click();
    }

















    public void selectWhom2Follow1(){
        selectByNameSadia.click();
    }

    public void findAndFollowMrSharif(){
        logInToTwitter();
        searchMrSharif();
        clickOnPeopleTab();
        //profileSharifAlamgir.click();
        clickOnProfileSharifAlamgir();
        clickFollowButtonMrSharif();
    }

    public void findAndFollowMisSadia(){
        logInToTwitter();
        searchMissSadia();
        clickOnPeopleTab();
        clickOnProfileSadiaSehil();
        clickFollowButtonMissSadia();
    }
    public void findAndFollowSherlockHolmes(){
        logInToTwitter();
        searchSherlockHolmes();
        clickOnPeopleTab();
        clickOnProfileSherlockHolmse();
        clickFollowButtonSherlockHolmes();
    }


    public void findAndFollowJamesBond(){
        logInToTwitter();
        searchJamesBond();
        clickOnPeopleTab();
        clickOnProfileJamesBond();
        clickFollowButtonJamesBond();
    }



    public void findAndFollowAngelaMerke(){
        logInToTwitter();
        searchAngelaMerkel();
        clickOnPeopleTab();
        clickOnProfileAngelaMerkel();
        clickFollowButtonAngelaMerkel();
    }


    public void findAndFollowChankiPande(){
        logInToTwitter();
        searchChankiPande();
        clickOnPeopleTab();
        clickOnProfileChankiPande();
       clickFollowButtonChankiPande();
    }

    public void findAndFollowTomCruise(){
        logInToTwitter();
        searchTomCruise();
        clickOnPeopleTab();
        clickOnProfileTomCruise();
        clickFollowButtonTomCruise();
    }


    public void TweetMrSharif(){
        logInToTwitter();
        //clickOnFollowingLink();
        profileSharifAlamgir.click();
        //clickOnProfileSharifAlamgir();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clickOnTweetToButton();
        //globalTweetBox.sendKeys("Hello ! take my salam");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //tweetSendButton.click();
    }

    public void tweetSherlockHolmes(){
        logInToTwitter();
        clickOnFollowingLink();
        clickOnProfileSherlockHolmse();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        clickOnTweetToButton();
        globalTweetBox.sendKeys("Hello ! take my salam");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tweetSendButton.click();
    }

    public void tweetJamesBond(){
        logInToTwitter();
        clickOnFollowingLink();
        clickOnProfileJamesBond();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        clickOnTweetToButton();
        globalTweetBox.sendKeys("Hello ! take my salam");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tweetSendButton.click();

    }

    public void tweetAngelaMerke(){
        logInToTwitter();
        clickOnFollowingLink();
        clickOnProfileAngelaMerkel();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        clickOnTweetToButton();
        globalTweetBox.sendKeys("Hello ! take my salam");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tweetSendButton.click();

    }

    public void tweetChankiPande(){
        logInToTwitter();
        clickOnFollowingLink();
        clickOnProfileChankiPande();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        clickOnTweetToButton();
        globalTweetBox.sendKeys("Hello ! take my salam");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tweetSendButton.click();

    }

    public void tweetTomCruise(){
        logInToTwitter();
        clickOnFollowingLink();
        clickOnProfileTomCruise();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        clickOnTweetToButton();
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

    public void enterWrongEmail(){
        userNameField.sendKeys("wronUser@email.com");
    }
    public void enterWrongPassWord(){
        System.out.println("wrong passwd entered");
        passWordFiled.sendKeys("900090");
    }
    public void clickOnHOmeIcon(){
        System.out.println("Home Icon is clicked");
        homeIcon.click();
    }

    public void logInToTwitter(){
        loginButton1.click();
        userNameField.sendKeys("team.jan2019@yahoo.com");
        passWordFiled.sendKeys("!tweetMe");
        loginButton2.click();
    }
    public void enterUsername(String username){userNameField.sendKeys(username, Keys.ENTER);}
    public void enterPassword(String password){passWordFiled.sendKeys(password, Keys.ENTER);}


    }
