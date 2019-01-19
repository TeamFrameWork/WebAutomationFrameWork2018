package dataBaseTest;

import Base.CommonAPI;
import databases.LogInUsingDB;
import homePKG.HomePage;
import homePKG.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogInDB extends CommonAPI {
    HomePage homePage;
  LogInUsingDB logInUsingDB;
//    SignUpPage signUpPage;

    @BeforeMethod
    public void initialisation1(){homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @BeforeMethod
   public void initialization2(){logInUsingDB=PageFactory.initElements(driver,LogInUsingDB.class);}


    @Test
    public void signUpUsignDtatFromBD() throws Exception {
        homePage.clickOnLoginButton();
        logInUsingDB.loginUsingDataFromDB();
        homePage.clickOnLoginButtonAgain();

    }
}

