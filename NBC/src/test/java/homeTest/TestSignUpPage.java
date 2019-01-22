package homeTest;

import Base.CommonAPI;
import homePage.HomePage;
import homePage.SignUpPage;
import okio.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static homePage.SignUpPage.signInButtonInSignInPage;
import static homePage.SignUpPage.signUpButtonInSignUpPage;

public class TestSignUpPage extends CommonAPI {
    HomePage homePage;
    TestHomePage testHomePage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void initialization(){homePage= PageFactory.initElements(driver,HomePage.class);}
    @BeforeMethod
    public void initialization1(){signUpPage= PageFactory.initElements(driver,SignUpPage.class);
  }
    @Test
    public void signUpWithEmail1(){
        homePage.clickOnsignUpButton();
        signUpPage.setEmailAddressForSignUp("sadiasehil89@gmail.com");
        signUpPage.setPassword("sadia123");
        //System.out.println(encryptPassword("sadia123"));
        signUpPage.clickOnCheckBox();
        clickSubmitButton(signUpButtonInSignUpPage);
    }
    @Test
    public void signUpWithFacebook(){
        homePage.clickOnsignUpButton();
        signUpPage.clickOnSignUpFacebook();
    }
    @Test
    public void signInWithEmail(){
        homePage.clickOnsignUpButton();
        signUpPage.goToSignInPage();
        signUpPage.setEmailAddressForSignIn("sadiasehil89@gmail.com"); //c2FkaWExMjM=    c2FkaWExMjM=
        signUpPage.setPasswordForSignIn("sadia123");
        System.out.println(encryptPassword("sadia123"));
        clickSubmitButton(signInButtonInSignInPage);
    }
    @Test
    public void signUpOrSignIn(){
        signUpWithEmail1();

        String currentUrl=driver.getCurrentUrl();

        System.out.println(currentUrl);
            if (currentUrl== "https://www.nbc.com/sign-in"){
                System.out.println(driver.getCurrentUrl());
                System.out.println("you have an account already ");
                signInWithEmail();
            }
    }
}
