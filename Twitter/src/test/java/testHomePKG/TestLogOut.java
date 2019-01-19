/*
package testHomePKG;
import homePKG.HomePage;
import homePKG.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLogOut extends TestLoginPage {
  LogInPage logInPage;
    HomePage hpage;
    //public void initLogInPage(){logInPage= PageFactory.initElements(driver,LogInPage.class); }
    public void initHomePage(){hpage= PageFactory.initElements(driver,HomePage.class);}

    @Test
    public void logOutFromTwitterAccount(){
        //logInPage.logInToTwitter();
        logInToTwitterAccount();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        hpage.logOut();
    }


    }
*/
